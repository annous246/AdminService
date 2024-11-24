package com.example.pointManagement.Models;


import jakarta.persistence.*;
import lombok.Data;

@Entity

@Data
public class PointModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "point_sequence")
    @SequenceGenerator(name = "point_sequence",allocationSize = 1)
    Long id;
    @ManyToOne
    StudentModel student;

    Integer addedPoints;

    Integer totalPoints;

    @ManyToOne
    ProfessorModel professor;

    @ManyToOne
    TimeFrame timeFrame;

    @Enumerated(EnumType.STRING)
    PointType type;

    String moreInfo;

    String date;

    @Enumerated(EnumType.STRING)
    PointStatus status;

    String createdAt;

    String updatedAt;



}


