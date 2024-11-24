package com.example.pointManagement.Helper;/*
package com.bma.monClubByWigo.Helper;


import com.bma.monClubByWigo.AppConstants;
import com.bma.monClubByWigo.Controllers.ActiveMembershipController;
import com.bma.monClubByWigo.Controllers.AuthenticationController;
import com.bma.monClubByWigo.Controllers.CityController;

import com.bma.monClubByWigo.Models.*;
import com.bma.monClubByWigo.Models.Enumurations.Continent;
import com.bma.monClubByWigo.Models.Enumurations.ErrorCode;
import com.bma.monClubByWigo.Repositories.MainAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping(AppConstants.API_BASE_URL)
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class ApiHandler {
    private final AuthenticationController authenticationController;
    private final CityController cityController;
    private final ActiveMembershipController activeMembershipController;
    private final MainAccountRepository mainAccountRepository;


    ResponseModel response=new ResponseModel();



    //

    //debug
    @PostMapping("/debug")
    public String debug() {

        return "Api connected successfully";

    }

    @PostMapping("/testResponse")
    public ResponseModel testApiResponse() {
        CountryModel countryModel=new CountryModel();
        countryModel.setName("tunis");
        countryModel.setContinent(Continent.AFRICA);
        ResponseModel responseModel=new ResponseModel();
        responseModel.setObject(countryModel);

        return responseModel;

    }

    @PostMapping("/onlyAdmin/debug")
    public String onlyAdminDebug() {

        return "Api connected successfully by admin";

    }


    @PostMapping("/onlyGym/debug")
    public String onlyGymDebug() {

        return "Api connected successfully by a gym";

    }
    @PostMapping("/onlyUser/debug")
    public String onlyUserDebug() {

        return "Api connected successfully by a user";

    }
    @PostMapping("/test/debug")
    public String postDebug() {

        return "Api connected successfully by a user";

    }
    @GetMapping("/test/debug")
    public String getDebug() {

        return "Api connected successfully by a user";

    }


    @PostMapping("/test")
    public ResponseModel testPostApi() {
        response.setMessage("api tested Successfully ; " +
                "APP BUILD VERSION="+AppConstants.APPLICATION_BUILD_VERSION+" Date: "+ LocalDateTime.now());
        response.setErrorCode(ErrorCode.success.getCode());
        response.setThereIsAnError(false);

        return response;
    }


    @PostMapping("/testApi/test")
    public ResponseModel testApi() {
        response.setMessage("api tested Successfully ; " +
                "APP BUILD VERSION="+AppConstants.APPLICATION_BUILD_VERSION+" Date: "+ LocalDateTime.now());
        response.setErrorCode(ErrorCode.success.getCode());
        response.setThereIsAnError(false);

        return response;
    }


    @PostMapping("/protected/justAdmin/test")
    public ResponseModel justAdminPostApi() {
       response.setMessage("api justAdmin Successfully");
       response.setErrorCode(ErrorCode.success.getCode());
       response.setThereIsAnError(true);
        return response;
    }

    @PostMapping("/getServerInfo")
    public ResponseModel getServerInfo() {
        response.setMessage("api tested Successfully ; " +
                "APP BUILD VERSION="+AppConstants.APPLICATION_BUILD_VERSION+" APP VERSION="+AppConstants.APPLICATION_VERSION+" Date: "+ LocalDateTime.now());
        response.setErrorCode(ErrorCode.success.getCode());
        response.setThereIsAnError(false);
        return response;
    }






    @PostMapping("/auth/createSubGym")
    public ResponseModel subGymSignUp(@RequestBody GymModel mainAccount,@RequestBody MainAccountModel subAccount) {

        return authenticationController.createSubGym(mainAccount,subAccount);
    }
    @PostMapping("/auth/createCoach")
    public ResponseModel coachSignUp(@RequestBody MainAccountModel request) {

        return authenticationController.createCoach(request);
    }
    @PostMapping("protected/auth/createDoctor")
    public ResponseModel doctorSignUp(@RequestBody MainAccountModel request) {

        return authenticationController.createDoctor(request);
    }
    @PostMapping("protected/auth/createGym")
    public ResponseModel gymSignUp(@RequestBody MainAccountModel request) {

        return authenticationController.createGym(request);
    }
    @PostMapping("/auth/createAdmin")
    public ResponseModel adminSignUp(@RequestBody MainAccountModel request) {
        return authenticationController.createAdmin(request);
    }




    //AUTH




    //CITY


    //ACTIVE MEMBERSHIP


    //COACH













}
*/
