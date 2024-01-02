package com.callor.student.exec;

import com.callor.student.service.StudentServic;
import com.callor.student.service.StudentServiceImplV1;

public class ExecC {
	
	public static void main(String[] args) {
		String stdFile = "src/com/callor/student/service/student.csv";
		StudentServic stdService = new StudentServiceImplV1(stdFile);
		
		stdService.inputStudent();
	}

}
