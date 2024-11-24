package com.example.pointManagement.Repositories;

import com.example.pointManagement.Models.GroupModel;
import com.example.pointManagement.Models.ProfessorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<ProfessorModel, Long> {

}
