package com.example.pointManagement.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Inheritance(strategy = InheritanceType.JOINED)
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "time_frame_sequence")
    @SequenceGenerator(name = "time_frame_sequence",allocationSize = 1)
    Long id;
    String firstName;
    String lastName;
    String email;
    String phone;
    String password;
    String createdAt;
    String updatedAt;
}
