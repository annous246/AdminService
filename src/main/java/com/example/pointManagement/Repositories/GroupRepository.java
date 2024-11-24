package com.example.pointManagement.Repositories;

import com.example.pointManagement.Models.GroupModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<GroupModel, Long> {

}
