package com.callor.student.exec;

import com.callor.student.service.StartService;
import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StartServiceImplV2;
import com.callor.student.service.impl.StudentServiceImplV2;

public class MainExA {
	public static void main(String[] args) {
		String studentDataFile ="src/com/callor/student/data/Student.txt";
		StudentService start = new StudentServiceImplV2();
	//StartService startService = new StartServiceImplV3(stService);
		
		//start.startApp();
	
	}
}
