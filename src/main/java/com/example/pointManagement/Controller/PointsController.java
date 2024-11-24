package com.example.pointManagement.Controller;


import com.example.pointManagement.Models.*;
import com.example.pointManagement.Services.PointService;
import com.example.pointManagement.Services.ReservedTimeFrameService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/points")
@RequiredArgsConstructor
@Data
public class PointsController {
    private final ReservedTimeFrameService reservedTimeFrameService;
    private final PointService pointService;
    /****************** mahish de5la !!!!!!!!!!!!!!!*/
    @PostMapping("/addPoints")
    public ResponseModel addPoints(@RequestBody PointModel points){
        try{
             if(pointService.addPointToStudentByAdmin(points)!=null){
                  Object ret=(Object) points;

                  return new ResponseModel("Points added to db",false,ret);
             }
             else{
                 return new ResponseModel("Internal Error ",true,null);

             }
        }
        catch(Exception e){
            return new ResponseModel("Internal Error ",true,null);

        }
    }
    //******************************
    @PostMapping("/acceptPoints")
    public ResponseModel acceptPointsAction(@RequestBody  Long id){
        try{
           PointModel points=pointService.getPointModelById(id);
            if(points!=null){
                if(pointService.getPointModelById(points.getId())!=null){
                    points.setStatus(PointStatus.ACCEPTED);
                    pointService.updatePoint(points);
                }

                //Conncetion
                //**********
                Object ret=(Object)points;
                return new ResponseModel("Points Added ",false,ret);
            }
            else{
                return new ResponseModel("Cant Treat Null ",true,null);

            }
        }
        catch(Exception e){

            return new ResponseModel("Internal Error ",true,null);
        }




    }

    @PostMapping("/declinePoints")
    public ResponseModel declinePointsAction(@RequestBody  Long id){
        try{

            PointModel points=pointService.getPointModelById(id);
            if(points!=null){
                if(pointService.getPointModelById(points.getId())!=null){
                    points.setStatus(PointStatus.REFUSED);
                    pointService.updatePoint(points);
                }

                //Conncetion
                //**********
                Object ret=(Object)points;
                return new ResponseModel("Points decline ",false,ret);
            }
            else{
                return new ResponseModel("Cant Treat Null ",true,null);

            }
        }
        catch(Exception e){
            return new ResponseModel("Internal Error ",true,null);

        }




    }

}
