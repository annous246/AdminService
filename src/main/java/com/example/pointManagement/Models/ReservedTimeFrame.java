package com.example.pointManagement.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class ReservedTimeFrame {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "reserved_time_frame_sequence")
    @SequenceGenerator(name = "reserved_time_frame_sequence",allocationSize = 1)
    Long id;

    @OneToOne
    ProfessorModel professor;

    @OneToOne
    SubGroupModel subGroup;

    @OneToOne
    TimeFrame timeFrame;




    String createdAt;
    String updatedAt;
}
