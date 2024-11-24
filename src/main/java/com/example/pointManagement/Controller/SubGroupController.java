package com.example.pointManagement.Controller;


import com.example.pointManagement.Models.GroupModel;
import com.example.pointManagement.Models.ResponseModel;
import com.example.pointManagement.Models.SubGroupModel;
import com.example.pointManagement.Services.GroupService;
import com.example.pointManagement.Services.ReservedTimeFrameService;
import com.example.pointManagement.Services.SubGroupService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/subGroups")
@RequiredArgsConstructor
@Data
public class SubGroupController {
    private final ReservedTimeFrameService reservedTimeFrameService;
    private final SubGroupService subGroupService;


    @PostMapping("/addSubGroup")
    public ResponseModel addSubGroup(@RequestBody SubGroupModel subGroup){
        try{

            if(subGroup!=null){
                    subGroupService.addElement(subGroup);


                    //Conncetion
                    //**********

                    Object ret=(Object)subGroup;

                    return new ResponseModel("subGroup Added ",false,ret);
                }
                else{
                    //already exists

                    return new ResponseModel("SubGroup Exists Already ",false,null);

                }

        }
        catch(Exception e){
            return new ResponseModel("Internal Error ",true,null);

        }




    }



    @PostMapping("/deleteSubGroup")
    public ResponseModel deleteSubGroup(@RequestBody Long id){
        try{
            SubGroupModel subGroup=subGroupService.getSubGroupById(id);
                if(subGroup!=null){
                    //can delete

                    subGroupService.deleteElement(id);

                    Object ret=(Object)subGroup;

                    //Conncetion
                    //**********


                    return new ResponseModel("subGroup deleted ",false,ret);
                }
                else{
                    //already exists

                    return new ResponseModel("SubGroup dosent Exist ",false,null);

                }

        }
        catch(Exception e){
            return new ResponseModel("Internal Error ",true,null);

        }




    }



    @PostMapping("/updateSubGroup")
    public ResponseModel updateSubGroup(@RequestBody SubGroupModel subGroup){
        try{
            SubGroupModel subGroupExistance=subGroupService.getSubGroupById(subGroup.getId());
            if(subGroupExistance!=null){
                //can update

                if(subGroupService.updateElement(subGroup)!=null){

                    //Conncetion
                    //**********

                    Object ret=(Object)subGroup;


                    return new ResponseModel("subGroup updated ",false,ret);

                }
                else{
                    return new ResponseModel("Internal Error ",true,null);

                }

            }
            else{
                //already exists

                return new ResponseModel("SubGroup dosent Exist ",false,null);

            }

        }
        catch(Exception e){
            return new ResponseModel("Internal Error ",true,null);

        }




    }



}
