package com.example.pointManagement.Models;


import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data

public class ProfessorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "professor_sequence")
    @SequenceGenerator(name = "professor_sequence",allocationSize = 1)
    Long id;
    String firstName;
    String lastName;
    String email;
    String phone;
    String address;
    String password;
    String createdAt;
    String updatedAt;
}
