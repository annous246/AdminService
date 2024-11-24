package com.example.pointManagement.Repositories;

import com.example.pointManagement.Models.PointModel;
import com.example.pointManagement.Models.PointStatus;
import com.example.pointManagement.Models.PointType;
import com.example.pointManagement.Models.PresenceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PresenceRepository extends JpaRepository<PresenceModel, Long> {


    List<PresenceModel> getAllBySubGroupId(Long id);
    List<PresenceModel> getAllByProfessorId(Long id);
    List<PresenceModel> getAllByTimeFrameId(Long id);
    Optional<PresenceModel> getAllByTimeFrameIdAndSubGroupIdAndProfessorIdAndDate(Long timeFrameId, Long subGroup, Long professorId, String date);

}