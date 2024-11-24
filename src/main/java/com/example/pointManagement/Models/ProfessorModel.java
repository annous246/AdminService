package com.example.pointManagement.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class ProfessorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "professor_sequence")
    @SequenceGenerator(name = "professor_sequence",allocationSize = 1)
    Long id;
    String name;
    String email;
    String password;
    String createdAt;
    String updatedAt;
}
