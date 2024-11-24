package com.example.pointManagement.Repositories;

import com.example.pointManagement.Models.GroupModel;
import com.example.pointManagement.Models.ReservedTimeFrame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservedTimeFrameRepository extends JpaRepository<ReservedTimeFrame, Long> {

}
