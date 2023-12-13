package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.service.StartService;
import com.callor.student.service.StudentService;
import com.callor.student.utils.Line;

public class StartServiceImplV1 implements StartService {
	protected Scanner scan = null;
	protected StudentService stService = null;
	
	public StartServiceImplV1() {
		scan = new Scanner(System.in);
		stService = new StudentServiceImplV1();

	}

	@Override
	public void mainMenu() {
		Line.dLine(100);
		System.out.println("한울고교 학사관리");
		Line.dLine(100);
		System.out.println("업무를 선택해주세요");
		Line.sLine(100);
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 조회");
		System.out.println("3. 학생정보 출력");
		System.out.println("QUIT 종료");
		Line.sLine(100);
		// TODO Auto-generated method stub

	}

	@Override
	public Integer selectMenu() {
		int num = 0;
		while (true) {
			this.mainMenu();
			System.out.println("업무 선택 >> ");
			String str = scan.nextLine();
			if (str.equals("QUIT"))
				return null;

			try {
				num = Integer.valueOf(str);

			} catch (Exception e) {
				System.out.println("정수를 입력해주세요");
				// TODO: handle exception
				continue;
			}

			if (num < 1 || num > 3) {
				System.out.println("업무 선택은 1 ~ 3 까지 있습니다.");
				continue;
			}
			

		}

	}

	@Override
	public void startApp() {
		// TODO Auto-generated method stub

	}

}
