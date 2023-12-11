package com.callor.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StudentDto;

public class StudentServiceV1 {
	private Scanner scan = null;
	private List<StudentDto> students = null;

	public StudentServiceV1() {
		scan = new Scanner(System.in);
		students = new ArrayList<StudentDto>();
	}

	public boolean inputStudent() {

		String stdNum = "";
		String stdName = "";
		String stdDept = "";
		String stdGrade = "";
		String stdTel = "";
		String stdAddr = "";
	
			
		

		System.out.println("이름을 입력하세요");
		stdName = scan.nextLine();
		if(stdName.equals("QUIT")) return false;
		
		System.out.println("학과를 입력하세요");
		stdDept = scan.nextLine();
		if(stdDept.equals("QUIT")) return false;

		System.out.println("학년을 입력하세요");
		stdGrade = scan.nextLine();
		if(stdGrade.equals("QUIT")) return false;
		
		System.out.println("전화번호를 입력하세요");
		stdTel = scan.nextLine();
		if(stdTel.equals("QUIT")) return false;

		System.out.println("주소를 입력하세요");
		stdAddr = scan.nextLine();
		if(stdAddr.equals("QUIT")) return false;

		
		StudentDto studentDto = new StudentDto();
		studentDto.num += stdNum;
		studentDto.name += stdName;
		studentDto.dept += stdDept;
		studentDto.grade += stdGrade;
		studentDto.tel += stdTel;
		studentDto.addr += stdAddr;
		
		students.add(studentDto);
		
		
		return true;

		
	}
	
	
	/*public boolean check(String str) {
		
		int Size = students.size();
		
		int index =0;
		for(index=0;index<Size; index++) {
			if(students.get(index).equals(str)) {
				
			}
			
		}*/
		
		
	
	
	

}
