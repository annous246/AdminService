package com.example.pointManagement.Repositories;

import com.example.pointManagement.Models.GroupModel;
import com.example.pointManagement.Models.TimeTableModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeTableRepository extends JpaRepository<TimeTableModel, Long> {

}
