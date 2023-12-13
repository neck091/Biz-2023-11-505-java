package com.callor.student.exec;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV1;

public class StudentExD {
	public static void main(String[] args) {
		//인터페이스를 사용하여 객체 선언
		//구현체 클래스를 사용하여 객체를 생성한다
		StudentService stService = new StudentServiceImplV1();
		//stService.printStudent();
		stService.inputStudents();
		stService.printStudent();
	}

}
