package com.callor.student.service.impl;

import com.callor.student.models.MenuIndex;
import com.callor.student.models.StdIndex;
import com.callor.student.service.StartService;
import com.callor.student.service.StudentService;

public class StartServiceImplV3 extends StartServiceImplV2 {

	public StartServiceImplV3(StudentService stService) {
		
		super(stService);
		
		//stService = new StudentServiceImplV2();
		this.stService = stService;
		//new StudentServiceImplV3();
	}
	
	//앱이 시작되면 student.tst 파일에 저장된 학생정보를 가져오기
	//가져온 학생정보는 students에 보관하기
	
	@Override
	public void startApp() {
		stService.loadStudent();
		
		 while(true) {
			Integer selectMenu = this.selectMenu();
			if(selectMenu==null) break;
			else if(selectMenu==MenuIndex.학생정보_입력.getIndex()) {
				stService.inputStudents();
				stService.saveStudent();

			}else if(selectMenu==MenuIndex.학생정보_조회.getIndex()) {
				System.out.println("학생정보조회");
			}else if(selectMenu==MenuIndex.학생정보_가져오기.getIndex()) {
				//System.out.println("학생정보가져오기");
				stService.loadStudent();
			}else if(selectMenu==MenuIndex.학생정보_출력.getIndex()) {
				stService.printStudent();
			}
			else if(selectMenu==MenuIndex.학생정보_저장.getIndex()) {
				//System.out.println("학생정보 저장하기");
				stService.saveStudent();
			}
			
		}
		 
		 System.out.println("업무 종료");
		
	}
	
	@Override
	public Integer selectMenu() {
		// TODO Auto-generated method stub
		return super.selectMenu();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
