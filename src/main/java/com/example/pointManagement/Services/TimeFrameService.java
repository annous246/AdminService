package com.example.pointManagement.Services;



import com.example.pointManagement.Models.SubGroupModel;
import com.example.pointManagement.Models.TimeFrame;
import com.example.pointManagement.Repositories.SubGroupRepository;
import com.example.pointManagement.Repositories.TimeFrameRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
@RequiredArgsConstructor
public class TimeFrameService {

    private final TimeFrameRepository repository;


    public List<TimeFrame> getAllElements() {
        return repository.findAll();
    }

   public  String deleteElement(Long id) {
        try {


            repository.deleteById(id);
            return "element deleted";
        }
        catch (Exception e) {
            return "Error deleting element";
        }
    }

   public  String addElement(TimeFrame model) {
        try {
            repository.save(model);
            return "element added";
        }catch (Exception e) {
            return "Error adding element";
        }
    }


   public  String updateElement(TimeFrame model) {
        try {
            repository.save(model);
            return "element updated";
        }catch (Exception e) {
            return "Error updating element";
        }
    }

}
