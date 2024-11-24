package com.example.pointManagement.Repositories;

import com.example.pointManagement.Models.GroupModel;
import com.example.pointManagement.Models.TimeFrame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeFrameRepository extends JpaRepository<TimeFrame, Long> {

}
