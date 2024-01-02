package com.callor.student.service;

import com.callor.student.model.StudentDto;

//* 파일에서 학생 정보를 읽어서 메모리에 저장
//* 키보드 통해 학생이름입력 입력받은 학생이름 
//* 리스트에서 검색
//* 검색된 학생정보화면에 보여주기;

public interface StudentServic {
	
	public void loadStudent();
	public void inputStudent();
	//학생 이름을 매개변수로 전달받아 학생 정보 검색하기
	//검색된 학생정보를 Dto 에 담아 리턴하기
	public StudentDto searchStudent(String name);
	
	//학생 정보를 매개변수로 전달받아 화면에 출력하기 
	
	public void printStudent(StudentDto stdDto);

}
