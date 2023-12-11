package com.callor.student.exec;

import com.callor.student.service.StudentServiceV2;

public class StudentExecA {
	public static void main(String[] args) {
		StudentServiceV2 studentService =new StudentServiceV2();
		
		studentService.inputStudent();
		
	}

}
