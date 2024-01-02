package com.callor.student.exec;

import com.callor.student.service.StudentServic;
import com.callor.student.service.StudentServiceImplV2;

public class ExecD {
	public static void main(String[] args) {
		String stdFile = "src/com/callor/student/service/student.csv";
		StudentServic stdService2 = new StudentServiceImplV2(stdFile);
		
		stdService2.loadStudent();
		stdService2.inputStudent();
	}

}
