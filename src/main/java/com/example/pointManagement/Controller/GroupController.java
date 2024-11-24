package com.example.pointManagement.Controller;


import com.example.pointManagement.Models.GroupModel;
import com.example.pointManagement.Models.PointModel;
import com.example.pointManagement.Models.PointStatus;
import com.example.pointManagement.Models.ResponseModel;
import com.example.pointManagement.Services.GroupService;
import com.example.pointManagement.Services.PointService;
import com.example.pointManagement.Services.ReservedTimeFrameService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/groups")
@RequiredArgsConstructor
@Data
public class GroupController {
    private final ReservedTimeFrameService reservedTimeFrameService;
    private final GroupService groupService;


    @PostMapping("/addGroup")
    public ResponseModel addGroup(@RequestBody GroupModel group){
        try{

            if(group!=null){
                    groupService.addGroup(group);

                    Object ret=(Object)group;

                    //Conncetion
                    //**********


                    return new ResponseModel("group Added ",false,ret);

            }
            else{
                return new ResponseModel("Cant Treat Null ",true,null);

            }
        }
        catch(Exception e){
            return new ResponseModel("Internal Error ",true,null);

        }




    }



    @PostMapping("/deleteGroup")
    public ResponseModel deleteGroup(@RequestBody Long id){
        try{
            GroupModel group=groupService.getGroupById(id);
                if(group!=null){
                    //can delete

                    groupService.deleteGroup(id);

                    Object ret=(Object)group;

                    //Conncetion
                    //**********


                    return new ResponseModel("group deleted ",false,ret);
                }
                else{
                    //already exists

                    return new ResponseModel("Group dosent Exist ",false,null);

                }

        }
        catch(Exception e){
            return new ResponseModel("Internal Error ",true,null);

        }




    }



    @PostMapping("/updateGroup")
    public ResponseModel updateGroup(@RequestBody GroupModel group){
        try{
            GroupModel groupExistance=groupService.getGroupById(group.getId());
            if(groupExistance!=null){
                //can update

                if(groupService.updateGroup(group)!=null){

                    //Conncetion
                    //**********

                    Object ret=(Object)group;


                    return new ResponseModel("group updated ",false,ret);

                }
                else{
                    return new ResponseModel("Internal Error ",true,null);

                }

            }
            else{
                //already exists

                return new ResponseModel("Group dosent Exist ",false,null);

            }

        }
        catch(Exception e){
            return new ResponseModel("Internal Error ",true,null);

        }




    }



}
