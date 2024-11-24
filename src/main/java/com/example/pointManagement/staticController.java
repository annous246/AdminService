package com.example.pointManagement;


import com.example.pointManagement.Models.GroupModel;
import com.example.pointManagement.Models.ProfessorModel;
import com.example.pointManagement.Models.ResponseModel;
import com.example.pointManagement.Models.TimeFrame;
import com.example.pointManagement.Services.GroupService;
import com.example.pointManagement.Services.ProfessorService;
import com.example.pointManagement.Services.ReservedTimeFrameService;
import com.example.pointManagement.Services.TimeFrameService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
@RequiredArgsConstructor
@Data
public class staticController {
    private final ReservedTimeFrameService reservedTimeFrameService;
    private final TimeFrameService timeFrameService;
    private final ProfessorService professorService;


    @PostMapping("/addtf")
    public ResponseModel addGroup(@RequestBody TimeFrame tf){
        try{
            timeFrameService.addElement(tf);
            return new ResponseModel("tf added ",false,(Object) tf);


        }
        catch(Exception e){
            return new ResponseModel("Internal Error ",true,null);

        }




    }
    @PostMapping("/addprof")
    public ResponseModel addGroup(@RequestBody ProfessorModel tf){
        try{
            professorService.addElement(tf);
            return new ResponseModel("prof added ",false,(Object) tf);


        }
        catch(Exception e){
            return new ResponseModel("Internal Error ",true,null);

        }




    }






}
