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
	public boolean inputStudent();
	public void inputStudents();
	public void loadStudent();
	public void printStudent();
	

}
