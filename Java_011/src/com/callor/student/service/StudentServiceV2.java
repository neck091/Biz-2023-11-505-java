package com.callor.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StudentDto;

public class StudentServiceV2 {

	private int 학번 = 0;
	private int 이름 = 1;
	private int 학과 = 2;
	private int 학년 = 3;
	private int 전화번호 = 4;
	private int 주소 = 5;

	private Scanner scan = null;
	private List<StudentDto> students = null;

	// 각 입력항목에 보여줄 제목을 ㄷ담을 문자열 배열 선언
	private String[] stdTitle = null;

	public StudentServiceV2() {
		scan = new Scanner(System.in);
		stdTitle = new String[] { "학번", "이름", "학과", "학년", "전화번호", "주소" };
		students = new ArrayList<StudentDto>();

	}

	public boolean inputStudent() {
		// 키보드로 입력한 문자열을 저장할 배열
		// 각 입력항목에 보여줄 제목을 담을 문자열 배열 생성

		String[] inputStr = new String[stdTitle.length];

		// 반복문을 이용하여 입력받기 코드 줄임

		for (int index = 0; index < stdTitle.length; index++) {
			System.out.println("종료하려면 QUIT 입력");
			System.out.println(stdTitle[index] + "입력");
			// inputStr[index] = scan.nextLine();
			String str = scan.nextLine();
			if (inputStr.equals("QUIT")) {
				return false;

			}
			inputStr[index] = str;

			StudentDto stDto = new StudentDto();

			stDto.num = inputStr[학번];
			stDto.name = inputStr[이름];
			stDto.dept = inputStr[학과];
			stDto.grade = inputStr[학년];
			stDto.tel = inputStr[전화번호];
			stDto.addr = inputStr[주소];

			students.add(stDto);

		}
		return true;
	}// input student

	public void inputStudents() {
		boolean result = true;
		while (result) {
			result = inputStudent();
		}
		System.out.println("입력 종료");
	}

	public void printStudent() {
		for (StudentDto dto : students) {
			System.out.println();

		}

	}
}
