package com.example.pointManagement.Repositories;

import com.example.pointManagement.Models.GroupModel;
import com.example.pointManagement.Models.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentModel, Long> {


    List<StudentModel> findAllBySubGroupId(Long id);
}
