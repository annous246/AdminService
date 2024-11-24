package com.example.pointManagement.Repositories;

import com.example.pointManagement.Models.PointModel;
import com.example.pointManagement.Models.PointStatus;
import com.example.pointManagement.Models.PointType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PointRepository extends JpaRepository<PointModel, Long> {

    
    List<PointModel> getAllByStudentId(long id);
    List<PointModel> getAllByProfessorId(long id);
    List<PointModel> getAllByStatus(PointStatus status);
    List<PointModel> getAllByTimeFrameId(long id);
    List<PointModel> getAllByType(PointType type);
}