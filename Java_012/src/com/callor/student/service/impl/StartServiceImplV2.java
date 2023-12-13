package com.callor.student.service.impl;

import com.callor.student.models.MenuIndex;
import com.callor.student.utils.Line;

public class StartServiceImplV2 extends StartServiceImplV1 {
	public StartServiceImplV2() {

		// V1의 생성자를 추출하여 V1 생성자에 있는 코드를 그대로 실행하겠다
		super();
		//V1에서는 St... ServiceImplV1 을 사용하여 stService 를 초기화
		//하지만 여기서는 InmplV2 를 사용하고 싶다
		//그럴때는 다시 stService를 V2 로 초기화 하면 됨.
		//stService = new StudentServiceImplV2();
	}

	@Override
	public void mainMenu() {
		Line.dLine(50);
		System.out.println("한울고교 학생정보 관리");
		Line.dLine(50);
		System.out.println("업무를 선택해 주세요");
		Line.sLine(50);

		for (MenuIndex menu : MenuIndex.values()) {
			String item = menu.toString();
			item = item.replace("_", " ");
			System.out.printf("%d, %s\n", menu.getIndex(), menu);
		}
		System.out.println("QUIT. 종료");
	}// end main

	@Override
	public Integer selectMenu() {
		Integer selectMenu = 0;
		while (true) {
			this.mainMenu();
			Line.sLine(50);
			System.out.print("업무 선택 >> ");
			String str = scan.nextLine();
			if (str.equals("QUIT"))
				return null;

			try {
				selectMenu = Integer.valueOf(str);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("업무 선택은 정수값을 입력하세요");
				continue;
			}
			if (selectMenu < 1 || selectMenu > MenuIndex.values().length) {
				System.out.printf("업무 선택은 1부터 %d 범위의 값입니다\n", MenuIndex.values().length);
				continue;
			}
			return selectMenu;
		}

	}//end select
	
	@Override
	public void startApp() {
		while(true) {
			Integer selectMenu = this.selectMenu();
			if(selectMenu==null) break;
			else if(selectMenu==MenuIndex.학생정보_입력.getIndex()) {
				stService.inputStudents();

			}else if(selectMenu==MenuIndex.학생정보_조회.getIndex()) {
				System.out.println("학생정보조회");
			}else if(selectMenu==MenuIndex.학생정보_가져오기.getIndex()) {
				System.out.println("학생정보가져오기");
			}else if(selectMenu==MenuIndex.학생정보_출력.getIndex()) {
				stService.printStudent();
			}
			
		}
		System.out.println("업무 종료");
	
	}
}
