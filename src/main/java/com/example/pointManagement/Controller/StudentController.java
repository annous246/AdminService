package com.example.pointManagement.Controller;


import com.example.pointManagement.Models.GroupModel;
import com.example.pointManagement.Models.ResponseModel;
import com.example.pointManagement.Models.StudentModel;
import com.example.pointManagement.Services.GroupService;
import com.example.pointManagement.Services.ReservedTimeFrameService;
import com.example.pointManagement.Services.StudentService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/students")
@RequiredArgsConstructor
@Data
@Slf4j
public class StudentController {
    private final ReservedTimeFrameService reservedTimeFrameService;
    private final StudentService studentService;


    @PostMapping("/addStudent")
    public ResponseModel addStudent(@RequestBody StudentModel student){
        log.info("here");
        log.info(student.toString());
        try{

            if(student!=null){
                    if(studentService.addElement(student)!=null){
                        Object ret=(Object)student;

                        //Conncetion
                        //**********


                        return new ResponseModel("student Added ",false,ret);

                    }
                    else{

                        return new ResponseModel("Internal Error ",true,null);
                    }


            }
            else{
                return new ResponseModel("Cant Treat Null ",true,null);

            }
        }
        catch(Exception e){
            return new ResponseModel("Internal Error ",true,null);

        }




    }


    @PostMapping("/deleteStudent")
    public ResponseModel deleteStudent(@RequestBody Long id){
        try{

                StudentModel studentToDelete=studentService.getStudent(id);
                if(studentToDelete!=null){
                    //can add
                    if(studentService.deleteElement(id)!=null){
                        Object ret=(Object)studentToDelete;

                        //Conncetion
                        //**********


                        return new ResponseModel("student deleted ",false,ret);

                    }
                    else{

                        return new ResponseModel("Internal Error ",true,null);
                    }

                }
                else{
                    //already exists

                    return new ResponseModel("Student dosent Exist  ",false,null);

                }

        }
        catch(Exception e){
            return new ResponseModel("Internal Error ",true,null);

        }




    }


    @PostMapping("/updateStudent")
    public ResponseModel updateStudent(@RequestBody StudentModel student){
        try{
            StudentModel studentExistance=studentService.getStudent(student.getId());
            if(studentExistance!=null){
                //can update

                if(studentService.updateElement(student)!=null){

                    //Conncetion
                    //**********

                    Object ret=(Object)student;


                    return new ResponseModel("student updated ",false,ret);

                }
                else{
                    return new ResponseModel("Internal Error ",true,null);

                }

            }
            else{
                //already exists

                return new ResponseModel("Student dosent Exist ",false,null);

            }

        }
        catch(Exception e){
            return new ResponseModel("Internal Error ",true,null);

        }




    }



}
