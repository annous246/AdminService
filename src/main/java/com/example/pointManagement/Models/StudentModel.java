package com.example.pointManagement.Models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_sequence")
    @SequenceGenerator(name = "student_sequence",allocationSize = 1)
    Long id;
    String firstName;
    String lastName;
    String email;
    String phone;
    Boolean presence;

    @ManyToOne
    SubGroupModel subGroup;
    String password;
    String createdAt;
    String updatedAt;
}
