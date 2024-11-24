package com.example.pointManagement.Models;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "time_frame")
public class TimeFrame {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "time_frame_sequence")
    @SequenceGenerator(name = "time_frame_sequence",allocationSize = 1)
    Long id;
    Integer startTime;
    Integer endTime;
}
