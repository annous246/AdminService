package com.example.pointManagement.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_sequence")
    @SequenceGenerator(name = "student_sequence",allocationSize = 1)
    Long id;
    String name;
    String email;
    @ManyToOne
    SubGroupModel subGroup;
    String password;
    String createdAt;
    String updatedAt;
}
