package com.example.pointManagement.Services;


import com.example.pointManagement.Models.GroupModel;
import com.example.pointManagement.Models.ProfessorModel;
import com.example.pointManagement.Repositories.ProfessorRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@RequiredArgsConstructor
@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;


    List<ProfessorModel> getAllElements() {
        return professorRepository.findAll();
    }

    public String deleteElement(Long id) {
        try {


            professorRepository.deleteById(id);
            return "element deleted";
        }
        catch (Exception e) {
            return "Error deleting element";
        }
    }

    public String addElement(ProfessorModel model) {
        try {
            professorRepository.save(model);
            return "element added";
        }catch (Exception e) {
            return "Error adding element";
        }
    }


    public String updateElement(ProfessorModel model) {
        try {
            professorRepository.save(model);
            return "element updated";
        }catch (Exception e) {
            return "Error updating element";
        }
    }

}
