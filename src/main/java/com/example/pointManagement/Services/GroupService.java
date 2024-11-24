package com.example.pointManagement.Services;


import com.example.pointManagement.Models.GroupModel;
import com.example.pointManagement.Repositories.GroupRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
@RequiredArgsConstructor
public class GroupService {

    private final GroupRepository groupRepository;


    List<GroupModel> getAllGroups() {
        return groupRepository.findAll();
    }

    public String deleteGroup(Long id) {
        try {


         groupRepository.deleteById(id);
         return "Group deleted";
    }
    catch (Exception e) {
            return "Error deleting group";
    }
    }

    public String addGroup(GroupModel groupModel) {
        try {
            groupRepository.save(groupModel);
            return "Group added";
        }catch (Exception e) {
            return "Error adding group";
        }
    }


    public String updateGroup(GroupModel groupModel) {
        try {
            groupRepository.save(groupModel);
            return "Group updated";
        }catch (Exception e) {
            return null;
        }
    }
    public  GroupModel getGroupById(Long id){
        return groupRepository.findById(id).orElse(null);

    }

}
