package com.example.pointManagement.Services;



import com.example.pointManagement.Models.PresenceModel;
import com.example.pointManagement.Models.ReservedTimeFrame;
import com.example.pointManagement.Models.SubGroupModel;
import com.example.pointManagement.Repositories.ReservedTimeFrameRepository;
import com.example.pointManagement.Repositories.SubGroupRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@RequiredArgsConstructor
@Service
public class ReservedTimeFrameService {

    private final ReservedTimeFrameRepository repository;


  public   List<ReservedTimeFrame> getAllElements() {
        return repository.findAll();
    }

    public String deleteElement(Long id) {
        try {


            repository.deleteById(id);
            return "element deleted";
        }
        catch (Exception e) {
            return "Error deleting element";
        }
    }

    public String addElement(ReservedTimeFrame model) {
        try {
            repository.save(model);
            return "element added";
        }catch (Exception e) {
            return "Error adding element";
        }
    }


    public String updateElement(ReservedTimeFrame model) {
        try {
            repository.save(model);
            return "element updated";
        }catch (Exception e) {
            return "Error updating element";
        }
    }

}
