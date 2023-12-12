package com.callor.student.service;

import java.util.Scanner;

import com.callor.student.utils.Line;

public class StartService {
	private StudentServiceV3 stService = null;
	private String[] menuItems = null;
	Scanner scan = null;

	public StartService() {
		scan = new Scanner(System.in);
		menuItems = new String[] { "1. 학생정보 입력", "2. 학생정보 가져오기", "3. 학생정보 조회", "4. 학생정보 출력" };
		stService = new StudentServiceV3();
	}

	public void mainMenu() {
		Line.dLine(50);
		System.out.println("한울고교 학사관리");
		Line.dLine(50);
		Line.dLine(50);
		System.out.println("업무를 선택해 주세요");
		Line.sLine(50);
		/*
		 * System.out.println("1. 학생정보 입력"); System.out.println("2. 학생정보 조회");
		 * System.out.println("3. 학생정보 출력");
		 */
		for (String item : menuItems) {
			System.out.println(item);

		}
		System.out.println("QUIT. 종료");
		Line.sLine(50);
	}

	private int selectMenu() {

		int num = 0;
		while (true) {
			this.mainMenu();
			System.out.print("업무 선택 >>");
			String str = scan.nextLine();
			if (str.equals("QUIT"))
				return -1;

			try {
				num = Integer.valueOf(str);

			} catch (Exception e) {
				System.out.println("정수를 입력해주세요");
				continue;
			}

			if (num < 1 || num > menuItems.length) {
				System.out.printf("업무 선택은 1 ~ %d까지 입니다", menuItems.length);

				continue;

			}
			// 여기까지 오면 코드가 정상 진행됫다는 의미
			return num;
		}
	}

	public void startApp() {
		while (true) {
			int menuId = this.selectMenu();
			if (menuId == -1) {
				break;
			} else if (menuId == 1) {
				stService.inputStudents();
			} else if (menuId == 2) {
				stService.loadStudent();
			} else if (menuId == 4) {
				stService.printStdList();
			}
		}
	}
}
