package com.callor.student.service;
/*
 * StudentService*** 클래스를 만드는데 꼭 필요한 method 들은 무엇인가?
 * inputStudent
 * inPutStudents
 * loadStudent
 * printStudent
 * 
 * 인터페이스는 클래스의 설계도 이다
 * 인터페이스를 implements 한 클래스는 인터페이스에 만든
 * method 를 반드시 구현해야한다
 *
 * */

public interface StudentService {
	
	// class를 설계할 때 참조할 method의 prototype 의 정의
	//코드 블록{} 없음
	public boolean inputStudent(); //학생 정보 입력
	public void inputStudents(); //여러 학생 정보입력
	public void loadStudent(); // 파일에 저장된 학생정보 메모리에 보관 
	
	public void saveStudent(); //ㅁ ㅔ모리에 보관된 학생정보 파일 저장
	
	public void printStudent(); // 메모리에 보관된 학생정보 출력
	

}
