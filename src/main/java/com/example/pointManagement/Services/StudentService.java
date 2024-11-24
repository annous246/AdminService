package com.example.pointManagement.Services;


import com.example.pointManagement.Models.StudentModel;
import com.example.pointManagement.Repositories.StudentRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;


    public List<StudentModel> getAllElements() {
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

    public StudentModel getStudent(Long id) {


            return repository.findById(id).orElse(null);
    }

    public String addElement(StudentModel model) {
        try {
            repository.save(model);
            return "element added";
        }catch (Exception e) {
            return null;
        }
    }


    public String updateElement(StudentModel model) {
        try {
            repository.save(model);
            return "element updated";
        }catch (Exception e) {
            return null;
        }
    }

}
