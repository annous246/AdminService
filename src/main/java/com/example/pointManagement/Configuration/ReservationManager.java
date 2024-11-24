package com.example.pointManagement.Configuration;

import com.example.pointManagement.Helper.Utils;
import com.example.pointManagement.Models.ReservedTimeFrame;
import com.example.pointManagement.Repositories.ReservedTimeFrameRepository;
import lombok.Data;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Service
@Data
public class ReservationManager {


    private final ReservedTimeFrameRepository reservedTimeFrameRepository;


    @Scheduled(fixedRate = 90 * 60 * 1000) // Run every 90 minutes (in milliseconds)
    @Transactional
    public void cleanUpOldEntries() {
        LocalDateTime thresholdTime = LocalDateTime.now().minusMinutes(90);

        List<ReservedTimeFrame> reservedTimeFrames = reservedTimeFrameRepository.findAll();

        LocalDateTime currentTime = LocalDateTime.now();

        Date now = new Date();
        for (ReservedTimeFrame reservedTimeFrame : reservedTimeFrames) {
            Date date = Utils.getDateFromString(reservedTimeFrame.getCreatedAt());

            if (Utils.isSameDay(now, date)) {
                reservedTimeFrameRepository.deleteById(reservedTimeFrame.getId());

            }

            // Current date and time
            LocalDateTime currentDateTime = LocalDateTime.now();


            LocalDate storedDate = LocalDate.now(); // Example date
            double storedTimeDouble = reservedTimeFrame.getTimeFrame().getEndTime();

            // Convert double to LocalTime
            int hour = (int) storedTimeDouble; // Extract the hour
            int minutes = (int) ((storedTimeDouble - hour) * 100); // Extract the minutes
            LocalTime storedTime = LocalTime.of(hour, minutes);

            // Combine date and time into LocalDateTime
            LocalDateTime storedDateTime = LocalDateTime.of(storedDate, storedTime);

            // Compare dates
            boolean hasPassed = currentDateTime.isAfter(storedDateTime);
            if (hasPassed) {
                System.out.println(reservedTimeFrame.getSubGroup().getName() + " now available again");

                reservedTimeFrameRepository.deleteById(reservedTimeFrame.getId());

            }


        }
    }





}
