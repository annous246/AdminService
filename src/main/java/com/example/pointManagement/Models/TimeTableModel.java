package com.example.pointManagement.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class TimeTableModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "time_table_sequence")
    @SequenceGenerator(name = "time_table_sequence", allocationSize = 1)
    private Long id;

    @Enumerated(EnumType.STRING) // Map the enum to a database column
    private WeekType weekType;

    @ManyToOne
    @JoinColumn(name = "sub_group_model_id") // Explicit foreign key column name
    private SubGroupModel subGroupModel;

    private String dayOfWeek;

    @ManyToMany
    @JoinTable(
            name = "time_table_time_frames",
            joinColumns = @JoinColumn(name = "time_table_id"),
            inverseJoinColumns = @JoinColumn(name = "time_frame_id")
    )
    private List<TimeFrame> timeFrames;
}



