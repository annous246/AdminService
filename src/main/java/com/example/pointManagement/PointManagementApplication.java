package com.example.pointManagement;

import com.example.pointManagement.Helper.Utils;
import com.example.pointManagement.Repositories.StudentRepository;
import com.example.pointManagement.Services.*;
import com.example.pointManagement.Models.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.*;

@SpringBootApplication
@EnableScheduling
public class PointManagementApplication {

	private final GroupService groupService;
	private final SubGroupService subGroupService;
	private final ProfessorService professorService;
	private final StudentRepository studentRepository;
	private final TimeFrameService timeFrameService;
	private final TimeTableService timeTableService;
	private final PointService pointService;
	private final StudentService studentService;

    public PointManagementApplication(GroupService groupService, SubGroupService subGroupService, ProfessorService professorService, StudentRepository studentRepository, TimeFrameService timeFrameService, TimeTableService timeTableService, PointService pointService, StudentService studentService) {
        this.groupService = groupService;
        this.subGroupService = subGroupService;
        this.professorService = professorService;
        this.studentRepository = studentRepository;
        this.timeFrameService = timeFrameService;
        this.timeTableService = timeTableService;
        this.pointService = pointService;
        this.studentService = studentService;
    }

    public static void main(String[] args) {
		SpringApplication.run(PointManagementApplication.class, args);
	}



	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		System.out.println("Application started");
		System.out.println("Initializing database");
		GroupModel groupING03 = new GroupModel(
				null,
				"ING_A1_03",
				Utils.getNowTimeInString(),
				Utils.getNowTimeInString()

		);
		groupService.addGroup(groupING03);
		GroupModel groupING04 = new GroupModel(
				null,
				"ING_A1_04",
				Utils.getNowTimeInString(),
				Utils.getNowTimeInString()

		);
		groupService.addGroup(groupING04);

		List<GroupModel> groups = groupService.getAllGroups();

		SubGroupModel subGroup0301 = new SubGroupModel(
				null,groups.getFirst(),"01", Utils.getNowTimeInString(), Utils.getNowTimeInString()
		);
		subGroupService.addElement(subGroup0301);
		SubGroupModel subGroup0302 = new SubGroupModel(
				null,groups.getFirst(),"02", Utils.getNowTimeInString(), Utils.getNowTimeInString()
		);
		subGroupService.addElement(subGroup0302);
		SubGroupModel subGroup0401 = new SubGroupModel(
				null,groups.getLast(),"01", Utils.getNowTimeInString(), Utils.getNowTimeInString()
		);
		subGroupService.addElement(subGroup0401);
		SubGroupModel subGroup0402 = new SubGroupModel(
				null,groups.getLast(),"02", Utils.getNowTimeInString(), Utils.getNowTimeInString()
		);
		subGroupService.addElement(subGroup0402);

		List<SubGroupModel> subGroupModelList=subGroupService.getAllElements();
		ProfessorModel prof01 = new ProfessorModel(
				null,"Ali","ali@gmail.com","50505050rR", Utils.getNowTimeInString(), Utils.getNowTimeInString()		);

		professorService.addElement(prof01);
		ProfessorModel prof02 = new ProfessorModel(
				null,"Sofie","sofie@gmail.com","50505050rR", Utils.getNowTimeInString(), Utils.getNowTimeInString()		);

		professorService.addElement(prof02);
		ProfessorModel prof03 = new ProfessorModel(
				null,"Ahmed","ahmed@gmail.com","50505050rR", Utils.getNowTimeInString(), Utils.getNowTimeInString()		);
		professorService.addElement(prof03);

		List<ProfessorModel> profs = professorService.getAllElements();

		StudentModel student1=new StudentModel(
				null,"Mohamed","mohamed@gmail.com",subGroupModelList.getFirst(),"50505050rR", Utils.getNowTimeInString(), Utils.getNowTimeInString()
		);
		StudentModel student2=new StudentModel(
				null,"Chtioui","chtioui@gmail.com",subGroupModelList.getFirst(),"50505050rR", Utils.getNowTimeInString(), Utils.getNowTimeInString()
		);
		StudentModel student3=new StudentModel(
				null,"Talel","talel@gmail.com",subGroupModelList.get(2),"50505050rR", Utils.getNowTimeInString(), Utils.getNowTimeInString()
		);
		StudentModel student4=new StudentModel(
				null,"Anas","anas@gmail.com",subGroupModelList.get(2),"50505050rR", Utils.getNowTimeInString(), Utils.getNowTimeInString()
		);

		String[] firstNames = {
				"Ali", "Ahmed", "Hassan", "Omar", "Yusuf", "Ibrahim", "Mohammed",
				"Fahd", "Salem", "Khalid", "Nasser", "Hamza", "Tariq", "Mustafa",
				"Saif", "Rashid", "Adil", "Mahmoud", "Jamal", "Sami", "Bassam",
				"Rami", "Zaid", "Walid", "Hani", "Firas", "Anas", "Bilal", "Salman",
				"Younes"
		};

		Random random = new Random();
		List<StudentModel> fakeStudents=new ArrayList<>();
		for (int i = 0; i < firstNames.length; i++) {
			StudentModel student=new StudentModel(
					null,firstNames[i],firstNames[i]+ "@gmail.com",subGroupModelList.get(random.nextInt(4)),"50505050rR", Utils.getNowTimeInString(), Utils.getNowTimeInString()
			);
			fakeStudents.add(student);
		}
		studentRepository.saveAll(fakeStudents);


		TimeFrame timeFrame1=new TimeFrame(
				null,8.30,10.00
		);
		timeFrameService.addElement(timeFrame1);
		TimeFrame timeFrame2=new TimeFrame(
				null,10.10,11.40
		);
		timeFrameService.addElement(timeFrame2);
		TimeFrame timeFrame3=new TimeFrame(
				null,11.50,13.20
		);
		timeFrameService.addElement(timeFrame3);
		TimeFrame timeFrame4=new TimeFrame(
				null,13.50,15.20
		);
		timeFrameService.addElement(timeFrame4);

		TimeFrame timeFrame5=new TimeFrame(
				null,15.30,17.00
		);
		timeFrameService.addElement(timeFrame5);

		TimeFrame timeFrame6=new TimeFrame(
				null,17.10,18.40
		);
		timeFrameService.addElement(timeFrame6);


		List<TimeFrame> listOfTimeFrames=timeFrameService.getAllElements();

		TimeTableModel timeTableModel1=new TimeTableModel(
				null, WeekType.A,subGroupModelList.getFirst(),"MONDAY",listOfTimeFrames
		);
		timeTableService.addElement(timeTableModel1);
		TimeTableModel timeTableModel2=new TimeTableModel(
				null, WeekType.B,subGroupModelList.getFirst(),"MONDAY",listOfTimeFrames
		);
		timeTableService.addElement(timeTableModel2);


		TimeTableModel timeTableModel3=new TimeTableModel(
				null, WeekType.A,subGroupModelList.get(1),"MONDAY",listOfTimeFrames
		);
		timeTableService.addElement(timeTableModel3);

		TimeTableModel timeTableModel4=new TimeTableModel(
				null, WeekType.B,subGroupModelList.get(1),"MONDAY",listOfTimeFrames
		);
		timeTableService.addElement(timeTableModel4);

		List<StudentModel> group0301Students=studentService.getStudentBySubGroupId(subGroupModelList.getFirst().getId());
		List<StudentModel> group0302Students=studentService.getStudentBySubGroupId(subGroupModelList.get(1).getId());


		Date date=new Date(2024, Calendar.NOVEMBER,26);



		PointModel pointModel2=new PointModel(
				null,group0301Students.getLast(),2000,null,null,listOfTimeFrames.getFirst(), PointType.gifts,"added by admin", Utils.getTimeInMillisecond(date), PointStatus.BINDING, Utils.getNowTimeInString(), Utils.getNowTimeInString()
		);
		pointService.addPointToStudentByAdmin(pointModel2);





















	}


}
