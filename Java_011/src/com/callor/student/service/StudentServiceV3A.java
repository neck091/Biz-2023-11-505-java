package com.callor.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StudentDto;
import com.callor.student.utils.Line;


public class StudentServiceV3A {

	private Scanner scan = null;
	private List<StudentDto> students = null;

	public StudentServiceV3A() {
		scan = new Scanner(System.in);
		students = new ArrayList<StudentDto>();
	}

	public String itemInput(String title) {

		while (true) {
			System.out.println(title + " 입력(QUIT:종료) >> ");
			String inputStr = scan.nextLine();

			if (inputStr.isBlank()) {

				System.out.printf("*** %s 값은 반드시 입력", title);
				continue;
			}

			if (inputStr.equals("QUIT")) {
				return null;

			}
			return inputStr;
		}
	}

	
	/*
	 * 학번을 매개변수로 전달받아 students 리스트에서 검색하여 
	 * 일치하는 학생정보가 있으면 그 정보를 통째로 return
	 */
	
	private StudentDto selectStdNum(String num) {
		// students 는 list 타입
		// students 요소는 StudentDto 타입
		// 이 명령은 students 리스트 개수만큼 반복
		// 반복하면서 students 리스트의 개별 요소를 get(읽기) 하여
		// studentDto type 인 dto 에 할당하여 코드블럭에 전달하라

		for(StudentDto dto: students) {
			if(dto.num.equals(num)) return dto;
		}
		return null;
	}
	
	public boolean inputStudent() {

		StudentDto stdDto = new StudentDto();

		while (true) {
			stdDto.num = this.itemInput("학번");
			if (stdDto.num == null) return false;
			
			//select 에 학번을 보내고 리턴값을 받아서 널이 아니면 중복임을 판단
			//if(this.selectStdNum(stdDto.num)!= null;) {
			StudentDto dto = this.selectStdNum(stdDto.num);
				if(dto!=null) {
				System.out.println("** 학번 중복");
				continue;
			}else {
				break;
			}
		}
			
		
			
			/*
			 * for(StudentDto dto: students) {
			 * 
			 * if(dto.num.equals(stdDto.num)) { System.out.println("*** 학번 중복"); continue; }
			 * 
			 * }
			 */

	

		stdDto.name = this.itemInput("이름");
		if (stdDto.name == null)
			return false;

		stdDto.dept = this.itemInput("학과");
		if (stdDto.dept == null)
			return false;

		stdDto.grade = this.itemInput("학년");
		if (stdDto.grade == null)
			return false;

		stdDto.tel = this.itemInput("전화번호");
		if (stdDto.tel == null)
			return false;

		stdDto.addr = this.itemInput("주소");
		if (stdDto.addr == null)
			return false;

		students.add(stdDto);
		return true;

	}// end input student()

	public void inputStudents() {
		while (true) {
			boolean bYes = this.inputStudent();

			if (!bYes) {
				break;
			}
		}
		System.out.println("입력 종료@@");

	}
	
	public void printStd() {
		Line.dLine(100);
		System.out.println("학번	이름	학과	학년	전화번호	주소");
		System.out.println("-".repeat(100));
		for (StudentDto dto : students) {
			System.out.printf("%s\t", dto.num);
			System.out.printf("%s\t", dto.name);
			System.out.printf("%s\t", dto.dept);
			System.out.printf("%s\t", dto.grade);
			System.out.printf("%s\t", dto.tel);
			System.out.printf("%s\n", dto.addr);
		}
		System.out.println("=".repeat(100));
	
	
	
	}//print 끝
}
