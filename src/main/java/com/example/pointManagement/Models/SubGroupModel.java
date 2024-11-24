package com.example.pointManagement.Models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class SubGroupModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "time_frame_sequence")
    @SequenceGenerator(name = "time_frame_sequence",allocationSize = 1)
    Long id;


    @ManyToOne
    GroupModel group;
    String name;
    String createdAt;
    String updatedAt;
}