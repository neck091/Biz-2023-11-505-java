package com.callor.student.exec;

import com.callor.student.service.StudentServiceV3;

public class StudentExecA {
	public static void main(String[] args) {
		StudentServiceV3 studentService = new StudentServiceV3();

		studentService.inputStudents();

	}

}
