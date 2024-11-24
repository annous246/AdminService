package com.example.pointManagement.Helper;

public class ApiConstants {

    //TESTING
    public static final String testIfBackendWork="/public/test/testIfBackendWork";
    public static final String getApplicationSetting="/public/settings/getSettings";
    public static final String updateApplicationSetting="/protected/settings/updateApplicationSetting";

    //ACTIVE MEMBERSHIP

    public static final String startMembership="/gym/activeMembership/startMembership";
    public static final String getActiveMembershipById="/gym/activeMembership/getActiveMembershipById/{id}";
    public static final String deleteActiveMembership="/gym/activeMembership/deleteActiveMembership/{id}";
    public static final String getAllActiveMembership ="/protected/gym/activeMembership/getActiveMembership";
    public static final String getAllActiveMembershipForUser="/user/activeMembership/getAllActiveMembershipByUserId/{id}";
    public static final String getAllActiveMembershipForGym="/gym/activeMembership/getAllActiveMembershipByGymId/{id}";
    public static final String getAllActiveMembershipByMembership="/gym/activeMembership/getAllActiveMembershipByMembershipId/{id}";
    public static final String getAllGymsActiveMembershipsForUser="/gym/activeMembership/getAllGymsActiveMembershipsForUser/{id}";
    public static final String updateActiveMembership="/gym/activeMembership/updateActiveMembership";
    public static final String confirmActiveMembership="/user/activeMembership/confirmActiveMembership/{id}";
    public static final String changeActiveMembershipAvailability="/gym/activeMembership/changeAvailability";



    //CITY
    public static final String createCity="/protected/city/createCity";
    public static final String deleteCity="/protected/city/deleteCity/{id}";
    public static final String getCity="/connected/city/getCity/{id}";
    public static final String updateCity="/protected/city/updateCity";
    public static final String changeCityAvailability="/protected/city/changeAvailability";
    public static final String getAllCityByCountry="/public/city/getAllCityByCountry/{id}";
    public static final String getAllCities="/public/city/getAllCities";

    //COACH
    public static final String getAllCoachesForAdmin="/protected/coach/getAllCoachesForAdmin";
    public static final String getAllCoachesForGym="/gym/coach/getAllCoachesForGym/{id}";
    public static final String getAllUserPersonalCoach="/user/coach/getAllUserPersonalCoach";
    public static final String getCoachById="/connected/coach/getCoachById/{id}";
    public static final String deleteCoach="/protected/coach/deleteCoach/{id}";
    public static final String updateCoach="/coach/updateCoach";
    public static final String updateCoachImage="/coach/updateCoachImage/{id}";
    public static final String changePersonalCoachStatus="/protected/coach/changePersonalCoachStatus/{id}/{status}/{endingDate}";
    public static final String changeCoachAvailability="/protected/coach/changeCoachAvailability/{id}/{status}";
    public static final String updateCoachLastSeen="/coach/updateCoachLastSeen/{id}";

    //COACH USER RELATION
    public static final String getAllCoachUserRelationships ="/protected/coachAndUser/getAllRelationships";
    public static final String getCoachUserRelationshipById ="/protected/coachAndUser/getRelationshipById/{id}";
    public static final String sendCoachUserLinkageRequest ="/coach/coachAndUser/sendLinkageRequest";
    public static final String answerCoachUserLinkageRequest ="/user/coachAndUser/answerLinkageRequest/{id}/{answer}";
    public static final String cancelWorkContractByCoach="/coach/coachAndUser/cancelWorkContractByCoach/{id}";
    public static final String cancelWorkContractByUser="/user/coachAndUser/cancelWorkContractByUser/{id}";
    public static final String updateCoachUserLinkageSettings ="/coachAndUser/updateLinkageSettings";
    public static final String getAllCoachRelationshipsWithUser ="/coach/coachAndUser/getAllCoachRelationships/{id}";
    public static final String getAllUserRelationshipsWithCoach ="/user/coachAndUser/getAllUserRelationships/{id}";

    //COACH GYM RELATION
    public static final String getAllCoachGymRelationships ="/protected/coachAndGym/getAllRelationships";
    public static final String getCoachGymRelationshipById ="/protected/coachAndGym/getRelationshipById/{id}";
    public static final String sendCoachGymLinkageRequest ="/gym/coachAndGym/sendLinkageRequest";
    public static final String answerCoachGymLinkageRequest ="/coach/coachAndGym/answerLinkageRequest/{id}/{answer}";
    public static final String cancelGymContractByCoach="/coach/coachAndGym/cancelWorkContractByCoach/{id}";
    public static final String cancelGymContractByGym="/gym/coachAndGym/cancelWorkContractByGym/{id}";
    public static final String updateCoachGymLinkageSettings ="/coachAndGym/updateLinkageSettings";
    public static final String getAllCoachRelationshipsWithGym ="/coach/coachAndGym/getAllCoachRelationships/{id}";
    public static final String getAllGymRelationshipsWithCoach ="/gym/coachAndGym/getAllGymRelationships/{id}";


    //COOKING STEP
    public static final String createCookingStep="/manager/cookingStep/createCookingStep";
    public static final String deleteCookingStep="/manager/cookingStep/deleteCookingStep/{id}";
    public static final String updateCookingStep="/manager/cookingStep/updateCookingStep";


    //COUNTRY
    public static final String getCountryById="/public/country/getCountryById/{id}";
    public static final String createCountry="/protected/country/createCountry";
    public static final String deleteCountry="/protected/country/deleteCountry/{id}";
    public static final String updateCountry="/protected/country/updateCountry";
    public static final String getAllCountries="/public/countries/getAllCountries";


    //DEAL
    public static final String createDeal="/protected/deal/createDeal";
    public static final String deleteDeal="/protected/deal/deleteDeal/{id}";
    public static final String updateDeal="/protected/deal/updateDeal";
    public static final String getAllDeals="/protected/deal/getAllDeals";
    public static final String getAllDealsForCreator="/connected/deal/getAllDealsForCreator";
    public static final String getAllDealsForUser="/connected/deal/getAllDealsForUser";
    public static final String getDealById="/connected/deal/getDealById/{id}";


    //DIFFICULTY LEVEL
    public static final String createDifficultyLevel="/protected/difficultyLevel/createDifficultyLevel";
    public static final String deleteDifficultyLevel="/protected/difficultyLevel/deleteDifficultyLevel/{id}";
    public static final String getDifficultyLevel="/connected/difficultyLevel/getDifficultyLevel";
    public static final String updateDifficultyLevel="/protected/difficultyLevel/updateDifficultyLevel";
    public static final String getDifficultyLevelByCreator="/connected/difficultyLevel/getDifficultyLevelByCreator";
    public static final String getDifficultyLevelById="/connected/difficultyLevel/getDifficultyLevelById/{id}";


    //ELEMENT REPORT
    public static final String getAllReportsByUsername="/protected/report/getAllReportsByUsername/{username}";
    public static final String getAllReportsByScreen="/protected/report/getAllReportsByScreen/{screen}";
    public static final String getAllReportsByType="/protected/report/getAllReportsByType/{type}";
    public static final String getAllReportsByApplicationElement="/protected/report/getAllReportsByApplicationElement/{element}";
    public static final String deleteReport="/protected/report/deleteReport";
    public static final String createReport="/public/report/createReport";
    public static final String getAllReports="/protected/report/getAllReports";



    //EVENT
    public static final String getAllEventsByCreatorId="/connected/event/getAllEventsByCreatorId/{username}";
    public static final String getAllEventsByGymId="/connected/event/getAllEventsByGymId/{id}";
    public static final String getEventById="/connected/event/getEventById/{id}";
    public static final String getEventsByGymIdAndDate="/connected/event/getEventsByGymIdAndDate/{id}/{date}";
    public static final String getAllEventsByCoachIdAndDate="/connected/event/getAllEventsByCoachIdAndDate/{id}";
    public static final String getAllEventsForAdminByDate="/protected/event/getAllEventsForAdminByDate/{date}";
    public static final String createEvent="/private/gym/event/createEvent";
    public static final String deleteEvent="/private/gym/event/deleteEvent/{id}";
    public static final String updateEvent="/private/gym/event/updateEvent";
    public static final String changeEventAvailability="/protected/gym/event/changeEventAvailability/{id}/{status}";
    public static final String updateEventImage="/private/gym/event/updateEventImage";
    public static final String changeEventReservableStatus="/private/gym/event/changeEventReservableStatus/{id}/{status}";


    //EVENT RESERVATION

    public static final String createReservation="/connected/event/createReservation";
    public static final String getAllReservationsByEventId="/private/event/getAllReservationsByEventId/{id}";
    public static final String getAllReservationByUserId="/connected/event/getAllReservationByUserId/{id}";
    public static final String deleteReservation="/connected/event/deleteReservation/{id}";


    //EXERCISE

    public static final String getAllExercisesByCreatorId="/connected/exercise/getAllExercisesByCreatorId";
    public static final String getAllExercises="/protected/exercise/getAllExercises";
    public static final String getExerciseById="/connected/exercise/getExerciseById/{id}";
    public static final String getAllExercisesByGymId="/connected/exercise/getAllExercisesByGymId/{id}";
    public static final String getAllExercisesByCoachId="/connected/exercise/getAllExercisesByCoachId/{id}";
    public static final String getAllExercisesByDoctorId="/connected/exercise/getAllExercisesByDoctorId/{id}";
    public static final String getAllExercisesByUserId="/connected/exercise/getAllExercisesByUserId/{username}";
    public static final String createExercise="/manager/exercise/createExercise";
    public static final String deleteExercise="/manager/exercise/deleteExercise/{id}";
    public static final String updateExercise="/manager/exercise/updateExercise";
    public static final String changeExerciseAvailability="/protected/exercise/changeExerciseAvailability{id}/{status}";
    public static final String updateExerciseImage="/manager/exercise/updateExerciseImage";
    public static final String changeExerciseRecommendedStatus="/protected/exercise/changeExerciseRecommendedStatus/{id}/{status}";
    public static final String getAllExercisesForUser="/connected/exercise/getAllForUser";



    //GYM
    public static final String getGymById="/connected/gym/getGymById/{id}";
    public static final String getAllGyms="/protected/gym/getAllGyms";
    public static final String updateGymMondayTime="/gym/updateGymMondayTime/{id}";
    public static final String updateGymTuesdayTime="/gym/updateGymTuesdayTime/{id}";
    public static final String updateGymWednesdayTime="/gym/updateGymWednesdayTime/{id}";
    public static final String updateGymThursdayTime="/gym/updateGymThursdayTime/{id}";
    public static final String updateGymFridayTime="/gym/updateGymFridayTime/{id}";
    public static final String updateGymSundayTime="/gym/updateGymSundayTime/{id}";
    public static final String updateGymSaturdayTime="/gym/updateGymSaturdayTime/{id}";
    public static final String searchForGym="/connected/gym/searchForGym/{name}";
    public static final String deleteGym="/protected/gym/deleteGym/{id}";
    public static final String updateGymImage="/gym/updateGymImage";
    public static final String updateGymLogo="/gym/updateGymLogo";
    public static final String updateGymSettings="/protected/gym/updateGymSettings";
    public static final String changeGymAvailability="/protected/gym/changeGymAvailability/{id}/{status}";
    public static final String changeGymContractStatus ="/protected/gym/changeContractStatus/{id}/{status}/{endingDate}";
    public static final String updateContract="/protected/gym/updateContract";
    public static final String updateGymBlockedCountries="/protected/gym/updateGymBlockedCountries";
    public static final String updateGym="/gym/updateGym";


    //INBOX
    public static final String createInbox="/protected/inbox/createInbox";
    public static final String deleteInbox="/protected/inbox/deleteInbox";
    public static final String getAllByReceiverUsername="/connected/getAllByReceiverUsername";
    public static final String getAllBySenderUsername="/connected/getAllBySenderUsername";

/*

    //MEDIA FILE
    public static final String uploadImage="/gallery/uploadImage";
    public static final String changeImageAvailability="/protected/gallery/changeImageAvailability/{id}/{status}";
    public static final String getAllMediaFileByCreatorId="/gallery/getAllMediaFileByCreatorId/{username}";
    public static final String deleteMediaFile="/gallery/deleteMediaFile/{id}";
    public static final String updateMediaFile="/gallery/updateMediaFile";
    public static final String getAllImages="/protected/getAllImages";
    public static final String getImageLinkById="/protected/getImageLinkById/{id}";
*/


    //ACCOUNT
    public static final String loginCoachMobile="/public/account/loginCoachMobile";
    public static final String loginMobile="/public/account/loginUserMobile";
    public static final String getAccount="/connect/account/getAccount";
    public static final String loginDashboard="/public/account/loginDashboard";
    public static final String createGymAccount="/protected/account/createGymAccount";
    public static final String deleteAccount="/protected/account/deleteAccount/{id}";
    public static final String updateAccount="/manager/account/updateAccount";
    public static final String createDoctorAccount="/protected/account/createDoctorAccount";
    public static final String createCoachAccount="/gym/account/createCoachAccount";
    public static final String createUserAccount="/public/account/createUseAccount";
    public static final String createSubGymAccount="/gym/account/createSubGymAccount";
    public static final String restorePassword="/connected/account/restorePassword";
    public static final String updatePassword="/connected/account/updatePassword/{id}";
    public static final String updateAccountEnableStatus="/protected/account/updateAccountEnableStatus";
    public static final String updateAccountExpirationStatus="/protected/account/updateAccountExpirationStatus";
    public static final String updateAccountLockingStatus="/protected/account/updateAccountLockingStatus";
    public static final String updateAccountTokenExpirationStatus="/protected/account/updateAccountTokenExpirationStatus";
    public static final String updateAccountBalance="/account/updateAccountBalance";
    public static final String confirmAccountEmail="/public/account/confirmAccountEmail/{id}";
    public static final String getCreatorNameByCreatorUserName="/public/account/getCreatorName/{username}";


    //MEMBERSHIP
    public static final String createMembership="/gym/membership/createMembership";
    public static final String updateMembership="/gym/membership/updateMembership";
    public static final String deleteMembership="/gym/membership/deleteMembership/{id}";
    public static final String updateMembershipImage="/gym/membership/updateMembershipImage/{id}";
    public static final String getMembershipById="/gym/membership/getMembershipById/{id}";
    public static final String getAllMemberships="/protected/membership/getAllMemberships";
    public static final String getAllMembershipsByGymId="/connected/membership/getAllMembershipsByGymId/{id}";
    public static final String getAllMembershipsByDoctorId="/connected/membership/getAllMembershipsByDoctorId/{id}";
    public static final String changeMembershipAvailability="/protected/membership/changeMembershipAvailability/{id}/{status}";



    //MESSAGES
    public static final String createMessage="/connected/conversations/createMessage/{id}";
    public static final String reportMessage="/connected/conversations/reportMessage/{id}";
    public static final String deleteMessage="/connected/protected/conversations/deleteMessage/{id}";
    public static final String deleteConversation="/connected/protected/conversations/deleteConversation/{id}";
    public static final String changeMessageSeenStatus="/connected/conversations/changeMessageSeenStatus/{id}";
    public static final String getAllReportedMessages="/protected/conversations/getAllReportedMessages";
    public static final String getAllConversationsMessages="/connected/conversations/getAllConversationMessages";
    public static final String changeConversationAvailability="/protected/conversations/changeConversationsAvailability/{id}/{status}";
    public static final String changeConversationsClosingReason="/protected/conversations/changeConversationsClosingReason/{id}";


    //MUSCLES
    public static final String createMuscle="/protected/muscle/createMuscle";
    public static final String updateMuscle="/protected/muscle/updateMuscle";
    public static final String deleteMuscle="/protected/muscle/deleteMuscle/{id}";
    public static final String getAllMuscles="/connected/muscle/getAllMuscles";
    public static final String getMuscleById="/connected/muscle/getMuscleById/{id}";
    public static final String getAllMuscleByCreatorId="/connected/muscle/getAllMuscleByCreatorId/{username}";
    public static final String updateMuscleImage="/protected/muscle/updateMuscleImage/{id}";


    //NEWS
    public static final String createNews="/manager/news/createNews";
    public static final String updateNews="/manager/news/updateNews";
    public static final String deleteNews="/manager/news/deleteNews/{id}";
    public static final String getAllNewsForUser="/connected/news/getAllNewsForUser";
    public static final String getAllNews="/connected/news/getAllNews";
    public static final String getNewsById="/connected/news/getNewsById/{id}";
    public static final String changeNewsAvailability="/protected/news/changeNewsAvailability/{id}/{status}";
    public static final String getAllNewsByGymId="/connected/news/getAllNewsByGymId/{id}";
    public static final String getAllNewsByDoctorId="/connected/news/getAllNewsByDoctorId/{id}";
    public static final String getAllNewsByCoachId="/connected/news/getAllNewsByCoachId/{id}";
    public static final String getAllNewsByAdminId="/connected/news/getAllNewsByAdminId";
    public static final String updateNewsImage="/manager/news/updateNewsImage/{id}";



    //NOTIFICATIONS
    public static final String createNotification="/private/notification/createNotification";
    public static final String deleteNotification="/private/notification/deleteNotification/{id}";
    public static final String getAllNotifications="/connected/notification/getAllNotifications";
    public static final String getAllNotificationsForUser="/connected/notification/getAllForUser/{username}";
    public static final String getAllNotificationsForCoach="/connected/notification/getAllForCoach/{username}";
    public static final String getAllNotificationsByCreatorId="/connected/notification/getAllByCreatorId/{username}";
    public static final String getNotificationById="/connected/notification/getNotificationById/{id}";


    //PRODUCTS
    public static final String createProduct="/manager/product/createProduct";
    public static final String updateProduct="/manager/product/updateProduct";
    public static final String deleteProduct="/manager/product/deleteProduct/{id}";
    public static final String getAllProducts="/connected/product/getAllProducts";
    public static final String getProductById="/connected/product/getProductById/{id}";
    public static final String updateProductImage="/manager/product/updateProductImage";
    public static final String getAllProductsByGymId="/connected/product/getAllProductsByGymId/{id}";
    public static final String getAllProductsByDoctorId="/connected/product/getAllProductsByDoctorId/{id}";
    public static final String getProductsByCoachId="/connected/product/getProductsByCoachId/{id}";
    public static final String getProductsByAdmin="/connected/product/getProductsByAdmin";
    public static final String changeProductAvailability="/protected/product/changeProductAvailability/{id}/{status}";
    public static final String changeProductRecommendedStatus="/protected/product/changeProductRecommendedStatus/{id}/{status}";
    public static final String getAllProductsByCreatorId="/connected/product/getAllProductsByCreatorId";
    public static final String getAllProductsForUser="/connected/product/getAllForUser";


    //PRODUCT CATEGORY
    public static final String createProductCategory="/private/product/category/createProductCategory";
    public static final String updateProductCategory="/private/product/category/updateProductCategory";
    public static final String deleteProductCategory="/private/product/category/deleteProductCategory/{id}";
    public static final String getProductCategoryById="/connected/product/category/getProductCategoryById/{id}";
    public static final String getAllProductCategories="/connected/product/category/getAllProductCategories";
    public static final String changeProductCategoryAvailability="/protected/product/category/changeProductCategoryAvailability/{id}/{status}";
    public static final String getAllProductCategoriesByCreatorId="/connected/product/category/getAllProductCategoriesByCreatorId/{username}";



    //PRODUCT ORDER
    public static final String createProductOrder="/connected/product/order/createProductOrder";
    public static final String updateProductOrder="/manager/product/order/updateProductOrder";
    public static final String getAllProductOrders="/protected/product/getAllProductOrders";
    public static final String getAllOrdersForProduct="/manager/product/getAllOrdersForProduct";
    public static final String  getAllProductOrdersForUser="/user/product/getAllProductOrdersForUser";
    public static final String  changeProductOrderStatus="/manager/product/changeProductOrderStatus";
    public static final String  getProductOrderById="/connected/product/getProductOrderById";
    public static final String  deleteProductOrderById="/manager/product/deleteProductOrderById";




    //PROGRAM
    public static final String createProgram="/manager/program/createProgram";
    public static final String updateProgram="/manager/program/updateProgram";
    public static final String deleteProgram="/manager/program/deleteProgram/{id}";
    public static final String getAllPrograms="/protected/program/getAllPrograms";
    public static final String getProgramById="/connected/program/getProgramById/{id}";
    public static final String updateProgramImage="/manager/program/updateProgramImage/{id}";
    public static final String updateProgramAvailability="/protected/program/updateProgramAvailability/{id}/{status}";
    public static final String getAllProgramsByCreatorId="/connected/program/getAllProgramsByCreatorId/{username}";
    public static final String getAllProgramsByGymId="/connected/program/getAllProgramsByGymId/{id}";
    public static final String getAllProgramsByDoctorId="/connected/program/getAllProgramsByDoctorId/{id}";
    public static final String getAllProgramsByCoachId="/connected/program/getAllProgramsByCoachId/{id}";
    public static final String getAllProgramsByAdmin="/connected/program/getAllProgramsByAdmin";
    public static final String getAllProgramsByUserId="/connected/program/getAllProgramsByUserId/{id}";
    public static final String updateProgramRecommendedStatus="/protected/program/updateProgramRecommendedStatus/{id}/{status}";
    public static final String getAllProgramsForUser="/connected/program/getAllForUser";



    //QUESTION
    public static final String createQuestion="/manager/question/createQuestion";
    public static final String deleteQuestion="/manager/question/deleteQuestion/{id}";
    public static final String getQuestionById="/manager/question/getQuestionById/{id}";
    public static final String getAllQuestions="/manager/question/question/getAll";
    public static final String getAllQuestionsForQuestionnaire="/connected/question/getAllQuestions/{id}";



    //QUESTIONNAIRE
    public static final String createQuestionnaire="/manager/questionnaire/createQuestionnaire";
    public static final String updateQuestionnaire="/manager/questionnaire/updateQuestionnaire";
    public static final String deleteQuestionnaire="/manager/questionnaire/deleteQuestionnaire/{id}";
    public static final String getAllQuestionnaireByCreatorId="/connected/questionnaire/getAllQuestionnaireByCreatorId/{username}";
    public static final String getAllQuestionnaires="/protected/questionnaire/getAllQuestionnaires";
    public static final String getQuestionnaireById="/manager/questionnaire/getQuestionnaireById/{id}";
    public static final String getAllQuestionnairesForUser="/connected/questionnaire/getAllQuestionnairesForUser";
    public static final String getAllQuestionnaireByGymId="/connected/questionnaire/getAllQuestionnaireByGymId/{id}";
    public static final String getAllQuestionnaireByCoachId="/connected/questionnaire/getAllQuestionnaireByCoachId/{id}";
    public static final String getAllQuestionnaireByAdmin="/connected/questionnaire/getAllQuestionnaireByAdmin";
    public static final String getAllQuestionnaireByDoctorId="/connected/questionnaire/getAllQuestionnaireByDoctorId/{id}";
    public static final String updateQuestionnaireAvailability="/protected/questionnaire/updateQuestionnaireAvailability/{id}/{status}";


    //QUESTIONNAIRE ANSWER
    public static final String createQuestionnaireAnswer="/connected/questionnaire/createQuestionnaireAnswer";
    public static final String getAllQuestionnaireAnswer="/protected/questionnaire/getAllQuestionnaireAnswer";
    public static final String getAllAnswersForQuestionnaire="/manager/questionnaire/getAllAnswersForQuestionnaire/{id}";
    public static final String deleteQuestionnaireAnswer="/connected/questionnaire/delete/{id}";
    public static final String getQuestionnaireAnswerByUserId="/connected/questionnaire/getByUserId/{id}";

    //RECIPE
    public static final String createRecipe="/manager/recipe/createRecipe";
    public static final String updateRecipe="/manager/recipe/updateRecipe";
    public static final String deleteRecipe="/manager/recipe/deleteRecipe/{id}";
    public static final String getAllRecipes="/protected/recipe/getAllRecipes";
    public static final String getAllRecipesForUser="/connected/recipe/getAllRecipesForUser";
    public static final String getRecipeById="/connected/recipe/getRecipeById/{id}";
    public static final String updateRecipeImage="/manager/recipe/updateRecipeImage/{id}";
    public static final String updateRecipeAvailability="/protected/recipe/updateRecipeAvailability/{id}/{status}";
    public static final String getAllRecipesByCreatorId="/connected/recipe/getAllRecipesByCreatorId/{username}";
    public static final String getAllRecipesByGymId="/connected/recipe/getAllRecipesByGymId/{id}";
    public static final String getAllRecipesByDoctorId="/connected/recipe/getAllRecipesByDoctorId/{id}";
    public static final String getAllRecipesByCoachId="/connected/recipe/getAllRecipesByCoachId/{id}";
    public static final String getAllRecipesByAdmin="/connected/recipe/getAllRecipesByAdmin";
    public static final String getAllRecipesByUserId="/connected/recipe/getAllRecipesByUserId/{id}";
    public static final String updateRecipeRecommendedStatus="/protected/recipe/updateRecipeRecommendedStatus/{id}/{status}";




    //REMINDER
    public static final String createReminder="/manager/reminder/createReminder";
    public static final String updateReminder="/manager/reminder/updateReminder";
    public static final String deleteReminder="/manager/reminder/deleteReminder/{id}";
    public static final String getAllReminders="/protected/reminder/getAllReminders";
    public static final String getAllRemindersForUser="/connected/reminder/getAllRemindersForUser";
    public static final String getAllRemindersByCreatorId="/connected/reminder/getAllRemindersByCreatorId/{username}";
    public static final String updateReminderAvailability="/protected/reminder/updateReminderAvailability/{id}/{status}";
    public static final String getAllRemindersByGymId="/connected/reminder/getAllRemindersByGymId/{id}";
    public static final String getAllRemindersByCoachId="/connected/reminder/getAllRemindersByCoachId/{id}";
    public static final String getAllRemindersByAdmin="/connected/reminder/getAllRemindersByAdmin";
    public static final String getAllRemindersByDoctorId="/connected/reminder/getAllRemindersByDoctorId/{id}";
    public static final String getReminderById="/connected/reminder/getReminderById/{id}";



    //SAVED PROGRAMS
    public static final String getAllSavedProgramsForUser="/connected/program/getAllSavedProgramsForUser/{id}";
    public static final String getAllUsersWhoCompleteThisProgram="/manager/program/getAllUsersWhoCompleteThisProgram/{id}";
    public static final String deleteSavedProgram="/connected/program/deleteSavedProgram/{id}";
    public static final String saveProgram="/connected/program/saveProgram";


    //SAVED SESSION
    public static final String getAllSavedSessionsForUser="/connected/session/getAllSavedSessionsForUser/{id}";
    public static final String getAllUsersWhoCompleteThisSession="/manager/session/getAllUsersWhoCompleteThisSession/{id}";
    public static final String deleteSavedSession="/connected/session/deleteSavedSession/{id}";
    public static final String saveSession="/connected/session/saveSession";


    //SELECTED GYM FOR USER
    public static final String selectGym="/user/selectGym";
    public static final String getSelectedGym="/user/getSelectedGym/{id}";
    public static final String getAllUsersWhoSelectThisGym="/gym/user/getAllUsersWhoSelectThisGym/{id}";



    //SESSION
    public static final String getAllSessionsByCreatorId="/connected/session/getAllSessionsByCreatorId/{username}";
    public static final String getAllSessions="/protected/session/getAllSessions";
    public static final String getAllSessionsByGymId="/connected/session/getAllSessionsByGymId/{id}";
    public static final String getSessionById="/connected/session/getSessionById/{id}";
    public static final String getAllSessionsByCoachId="/connected/session/getAllSessionsByCoachId/{id}";
    public static final String getAllSessionsByAdmin="/connected/session/getAllSessionsByAdmin";
    public static final String getAllSessionsByUserId="/connected/session/getAllSessionsByUserId/{id}";
    public static final String updateSession="/manager/session/updateSession";
    public static final String deleteSession="/manager/session/deleteSession/{id}";
    public static final String createSession="/manager/session/createSession";
    public static final String updateSessionAvailability="/protected/session/updateSessionAvailability/{id}/{status}";
    public static final String changeSessionImage="/manager/session/changeSessionImage/{id}";
    public static final String updateSessionRecommendedStatus="/protected/session/updateSessionRecommendedStatus/{id}/{status}";
    public static final String getAllSessionsByDoctorId="/connected/session/getAllSessionsByDoctorId/{id}";
    public static final String getAllSessionsForUser="/connected/session/getAllForUser";


    //SUPPLEMENT
    public static final String createSupplement="/manager/supplement/createSupplement";
    public static final String updateSupplement="/manager/supplement/updateSupplement";
    public static final String getAllSupplements="/connected/supplement/getAllSupplements";
    public static final String getAllSupplementsByCreatorId="/connected/supplement/getAllSupplementsByCreatorId/{username}";
    public static final String getAllSupplementsByType="/connected/supplement/getAllSupplementsByType/{type}";
    public static final String deleteSupplement="/manager/supplement/deleteSupplement/{id}";
    public static final String getSupplementById="/connected/supplement/getSupplementById/{id}";
    public static final String updateSupplementImage="/manager/supplement/updateSupplementImage/{id}";


    //TAG
    public static final String createTag="/manager/tag/createTag";
    public static final String updateTag="/manager/tag/updateTag";
    public static final String deleteTag="/manager/tag/deleteTag/{id}";
    public static final String getAllTags="/connected/tag/getAllTags";



    //TIMETABLE
    public static final String createTimeTable="/manager/timeTable/createTimeTable";
    public static final String updateTimeTable="/manager/timeTable/updateTimeTable";
    public static final String deleteTimeTable="/manager/timeTable/deleteTimeTable/{id}";
    public static final String getAllTimeTables="/connected/timeTable/getAllTimeTables";
    public static final String getTimeTableById="/connected/timeTable/getTimeTableById/{id}";



    //USER
    public static final String getAllUsers="/private/user/getAllUsers";
    public static final String getUserById="/manager/user/getUserById/{id}";
    public static final String updateUserByAdmin="/protected/user/updateUser";
    public static final String updateUserFirstName="/user/updateUserFirstName/{id}/{name}";
    public static final String updateUserLastName="/user/updateUserLastName/{id}/{name}";
    public static final String updateUserImage="/user/updateUserImage/{username}";
    public static final String updateUserPhone="/user/updateUserPhone/{id}/{phone}";
    public static final String updateUserSettings="/user/updateUserSettings/{id}";
    public static final String changeUserAvailability="/protected/user/changeUserAvailability/{id}/{status}";
    public static final String getUserByCreatorUsername="/manager/user/getUser/{username}";
    public static final String updateUserLastSeen="/user/updateUserLastSeen/{username}";
    public static final String updateUserProfile="/user/updateUserProfile";





}

