package com.callor.student.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.callor.student.models.StdIndex;
import com.callor.student.models.StudentDto;

public class StudentServiceImplV2 extends StudentServiceImplV1 {
	
	protected String stDataFile =null;
	
	public StudentServiceImplV2() {
		//두번째 생성자에게 파일의 정보를 전달하는 실행
		this("src/com/callor/student/data/Student.txt");
	}
	
	public StudentServiceImplV2(String stDataFile) {
		
		//V1의 생성자를 호출하여 키보드 scan 을 사용할 수 있도록 준비
		super();
		this.stDataFile = stDataFile;
		
	}

	@Override
	public void loadStudent() {
		
		// 파일을 읽기 위한 준비를 하는 곳 
		Scanner fileScan = null;
		InputStream is =null;
		try {
			is = new FileInputStream(stDataFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		fileScan = new Scanner(is);
		
		//파일에서 데이터를 읽어서 계속해서 add  실행하면 데이터가 계속 쌓이는 현상 발생 
		//load 할 때는 기존의 리스트를 새로 생성해서 초기화 해야함
		students = new ArrayList<StudentDto>();
		
		// 텍스트 파일에서 학생정보 읽어오기
		
		
		while(fileScan.hasNext()) {
			String line = fileScan.nextLine();
			String[] student = line.split(",");
			
			StudentDto stdDto = new StudentDto();
			stdDto.num = student[StdIndex.학번.getIndex()];
			stdDto.name = student[StdIndex.이름.getIndex()];
			stdDto.dept = student[StdIndex.학과.getIndex()];
			stdDto.grade = student[StdIndex.학년.getIndex()];
			stdDto.tel = student[StdIndex.전화번호.getIndex()];
			stdDto.addr = student[StdIndex.주소.getIndex()];
			students.add(stdDto);
			
		}//end while
		fileScan.close();
	}
	
	// 리스트에 보관중인 학생정보 리스트를 텍스트 파일에 영구보관
	
	@Override
	public void saveStudent() {
		
		//데이터를 저장할 파일을 연결하기 위한 도구
		OutputStream fos = null;
		
		/*
		 * Sustem.out 과 형제간
		 * system.out 에는  print**() method 들이 있고 이method 를 사용하여 화면에 메모리 내용을 출력
		 * 
		 * PrintWriter 는 Outputstream 과 연결되어 print method 들을 사용하여
		 * 파일에 데이터를 기록 할 수 있다(저장)
		 * 
		 */
		PrintWriter fileOut =null;
		
		try {
			//어떤 파일에 기록을 할 것인지 연결하는 절차
			fos = new FileOutputStream(stDataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//기록할 파일을 PrintWriter에 연결
		fileOut = new PrintWriter(fos);
		
		//PrintWriter 가 준비되면 System.outprint 처럼
		//같은 방식으로 파일에 문자열을 기록할 수 있다
		for(StudentDto dto : students) {
			
			fileOut.printf("%s, ", dto.num);
			fileOut.printf("%s, ", dto.name);
			fileOut.printf("%s, ", dto.dept);
			fileOut.printf("%s, ", dto.grade);
			fileOut.printf("%s, ", dto.tel);
			fileOut.printf("%s\n", dto.addr);
		}
		//파일 내용 기록이 끝나면  반드시 PrintWriter 을 닫아야 한다
		//이 과정을 생략하면 파일이 계속 열린 상태가 되고 기록한 내용은 완전 저장되지 않는다
		//또한 이 상태의 파일은 삭제도 할 수 없게 된다 다만 윈도우를 재시작하기 전까지
		fileOut.close();
	}

}