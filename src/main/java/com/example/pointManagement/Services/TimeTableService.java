package com.example.pointManagement.Services;




import com.example.pointManagement.Models.TimeTableModel;

import com.example.pointManagement.Repositories.TimeTableRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@RequiredArgsConstructor
@Service
public class TimeTableService {

    private final TimeTableRepository repository;


    List<TimeTableModel> getAllElements() {
        return repository.findAll();
    }

    String deleteElement(Long id) {
        try {


            repository.deleteById(id);
            return "element deleted";
        }
        catch (Exception e) {
            return "Error deleting element";
        }
    }

    public String addElement(TimeTableModel model) {
        try {
            repository.save(model);
            return "element added";
        }catch (Exception e) {
            return "Error adding element";
        }
    }


    String updateElement(TimeTableModel model) {
        try {
            repository.save(model);
            return "element updated";
        }catch (Exception e) {
            return "Error updating element";
        }
    }

}
