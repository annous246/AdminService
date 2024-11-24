package com.example.pointManagement.Services;


import com.example.pointManagement.Helper.Utils;
import com.example.pointManagement.Models.*;
import com.example.pointManagement.Repositories.PointRepository;
import com.example.pointManagement.Repositories.PresenceRepository;
import com.example.pointManagement.Repositories.StudentRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@RequiredArgsConstructor
@Service

public class PointService {

    private final PointRepository pointRepository;

    private final PresenceRepository presenceRepository;
    private final StudentRepository studentRepository;

    public List<PointModel>getAllPoints(){
        return pointRepository.findAll();
    }
    public PointModel getPointModelById(Long id){
        return pointRepository.findById(id).orElse(null);
    }

    public void  updateAllPoints(PointModel pointModel){
        pointRepository.save(pointModel);
    }
    public void  updatePoint(PointModel point){
        pointRepository.save(point);
    }

    public List<PointModel> getAllUserPointHistoryByUserId(Long userId) {
        return pointRepository.getAllByStudentId(userId);
    }

    public Integer getUserPointByUserId(Long userId) {
        List<PointModel> userPointHistory = getAllUserPointHistoryByUserId(userId);
        return userPointHistory.getLast().getTotalPoints();
    }

    public List<PointModel> getPointsByProfessorId(Long professorId) {
        return pointRepository.getAllByProfessorId(professorId);
    }

    public List<PointModel> getPointsByStatus(PointStatus status) {
        return pointRepository.getAllByStatus(status);
    }

    public List<PointModel> getPointsByType(PointType pointType) {
        return pointRepository.getAllByType(pointType);
    }
    public List<PresenceModel> getPresenceByStudentId(Long id) {
        Optional<StudentModel> studentModel=studentRepository.findById(id);
        if(studentModel.isPresent()) {
            return presenceRepository.getAllBySubGroupId(studentModel.get().getSubGroup().getId());
        }else{
            return null;
        }
    }

    record PresenceRequest(SubGroupModel subGroup, PointModel point) {}
    /*public List<StudentModel> getPresenceListForToday(PresenceRequest presenceRequest) {

    }*/









    public String addPointToStudentByAdmin(PointModel pointModel) {
        try {
        pointModel.setCreatedAt(Utils.getNowTimeInString());
        pointModel.setUpdatedAt(Utils.getNowTimeInString());
        pointRepository.save(pointModel);
        return "Done";

        } catch (Exception e) {
            return null;
        }
    }



        //This function to save student presence for each lesson
  /*  ResponseModel setStudentPresenceByProfessor(PointModel pointModel) {
        Optional<PresenceModel> presenceModel = presenceRepository.getAllByTimeFrameIdAndSubGroupIdAndProfessorIdAndDate(
                pointModel.getTimeFrame().getId(),
                pointModel.getStudent().getSubGroup().getId(),
                pointModel.getProfessor().getId(),
                pointModel.getDate()
                );

        if (presenceModel.isPresent()) {
            ResponseModel responseModel = new ResponseModel();
            responseModel.setResponse("Cant Add Presence in this time,Another user already add it");
        }else{

            PresenceModel newPresence = getPresenceModelFromPointModel(pointModel);
            try {
                presenceRepository.save(newPresence);
            }catch (Exception e){
                ResponseModel responseModel = new ResponseModel();
                responseModel.setResponse("Error in saving presence");
                responseModel.setError(true);
                return responseModel;
            }
            pointModel.setCreatedAt(Utils.getNowTimeInString());
            pointModel.setUpdatedAt(Utils.getNowTimeInString());
            pointModel.setStatus(PointStatus.BINDING);
            try {
                pointRepository.save(pointModel);
                ResponseModel responseModel = new ResponseModel();
                responseModel.setResponse("Successfully added presence");
                responseModel.setError(false);
                return responseModel;
            }catch (Exception e){
                ResponseModel responseModel = new ResponseModel();
                responseModel.setResponse("Error in saving point");
                responseModel.setError(true);
                return responseModel;
            }

        }
    }*/

    private static PresenceModel getPresenceModelFromPointModel(PointModel pointModel) {
        PresenceModel newPresence = new PresenceModel();
        newPresence.setComment(pointModel.getMoreInfo());
        newPresence.setDate(pointModel.getDate());
        newPresence.setProfessor(pointModel.getProfessor());
        newPresence.setSubGroup(pointModel.getStudent().getSubGroup());
        newPresence.setTimeFrame(pointModel.getTimeFrame());
        newPresence.setCreatedAt(Utils.getNowTimeInString());
        newPresence.setUpdatedAt(Utils.getNowTimeInString());
        return newPresence;
    }


}
