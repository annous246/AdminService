package com.example.pointManagement.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity

@Data
public class GroupModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "group_sequence")
    @SequenceGenerator(name = "group_sequence",allocationSize = 1)
    Long id;
    String name;
    String createdAt;
    String updatedAt;
}
