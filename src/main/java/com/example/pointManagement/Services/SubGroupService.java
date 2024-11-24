package com.example.pointManagement.Services;



import com.example.pointManagement.Models.GroupModel;
import com.example.pointManagement.Models.SubGroupModel;
import com.example.pointManagement.Repositories.SubGroupRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
@RequiredArgsConstructor
public class SubGroupService {

    private final SubGroupRepository repository;


    public List<SubGroupModel> getAllElements() {
        return repository.findAll();
    }

    public String deleteElement(Long id) {
        try {


            repository.deleteById(id);
            return "element deleted";
        }
        catch (Exception e) {
            return null;
        }
    }

    public String addElement(SubGroupModel model) {
        try {
            repository.save(model);
            return "element added";
        }catch (Exception e) {
            return null;
        }
    }


    public String updateElement(SubGroupModel model) {
        try {
            repository.save(model);
            return "element updated";
        }catch (Exception e) {
            return null;
        }
    }
    public SubGroupModel getSubGroupById(Long id){
        return repository.findById(id).orElse(null);

    }


}
