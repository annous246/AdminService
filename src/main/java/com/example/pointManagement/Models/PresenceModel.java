package com.example.pointManagement.Models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class PresenceModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "presence_sequence")
    @SequenceGenerator(name = "presence_sequence",allocationSize = 1)
    Long id;

    @ManyToOne
    ProfessorModel professor;

    @ManyToOne
    SubGroupModel subGroup;

    @ManyToMany
    @JoinTable()
    List<StudentModel> Students;

    @ManyToOne
    TimeFrame timeFrame;

    String date;

    String comment;

    String createdAt;
    String updatedAt;


}
