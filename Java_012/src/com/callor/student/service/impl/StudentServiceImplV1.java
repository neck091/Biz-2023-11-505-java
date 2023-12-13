package com.callor.student.service.impl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StdIndex;
import com.callor.student.models.StudentDto;
import com.callor.student.service.StudentService;
import com.callor.student.utils.Line;
/*
 * StudentServiceImplV1 클래스는 StudentService interface 를 
 * implements(상속, 설계 이어받기) 하였다
 * 이때 interface 정의된 method 들은 반드시 만들어야 한다 그렇지 않으면 코드가 오류가 발생하여 진행이 되지 않는다 
 * interface class 간에 하나의 규칙이 만들어지는 것이다
 * 이렇게 interface 를  implments 한 클래스를 구현체 클래스라고한다
 */

public class StudentServiceImplV1 implements StudentService {

	// 현재 IMPlv1 클래스를 다른 클래스가 상속하였을때 Protected 로 선언된 변수는 같이 상속이 된다
	// 즉 ImplV1을 상속한 클래스에서는 별도로 students 리스트 객체를 선언하지 않아도 됨

	protected List<StudentDto> students = null;
	protected Scanner keyBD = null;

	public StudentServiceImplV1() {

		students = new ArrayList<StudentDto>();
		keyBD = new Scanner(System.in);
	}

	// 학번을 매개변수로 전달받아 students 리스트를 검색 하여 동일한 학번의 요소가 있으면
	// 그 요소를 return, 없으면 null을 return
	//
	protected StudentDto selecStdNUm(String num) {
		for (StudentDto std : students) {
			if (std.num.equals(num)) {
				return std;

			}

		}
		// 여기에 코드가 도달하면 같은 학번이 없는거
		return null;
	}

	@Override
	public boolean inputStudent() {
		// 키보드로 학생의 개별 정보들 (학번,이름 등등)을 입력받고 임시로 저장할 배열
		// StdIndex enum 에 선언된 요소의 개수를 세어서 그 개수를 사용하여 inputStr 배열을 생성하기
		String[] inputStr = new String[StdIndex.values().length];
		for (StdIndex item : StdIndex.values()) {
			while (true) {
				System.out.printf("%s 입력 >> ", item);
				String str = keyBD.nextLine();
				if (str.equals("QUIT"))
					return false;
				// 학번을 입력하는 경우 중복 확인
				if (item.toString().equals("학번") && this.selecStdNUm(str) != null) {
					System.out.println("학번 중복");
					continue;
				}
				inputStr[item.getIndex()]=str;
				break;
			}
		
		}

		StudentDto stDto = new StudentDto();
		stDto.num = inputStr[StdIndex.학번.getIndex()];
		stDto.name = inputStr[StdIndex.이름.getIndex()];
		stDto.dept = inputStr[StdIndex.학과.getIndex()];
		stDto.grade = inputStr[StdIndex.학년.getIndex()];
		stDto.tel = inputStr[StdIndex.전화번호.getIndex()];
		stDto.addr = inputStr[StdIndex.주소.getIndex()];
		
		students.add(stDto);

		return true;
	}

	@Override
	public void inputStudents() {
		// TODO Auto-generated method stub
		boolean result = true;
		while (result) {
			Line.dLine(100);
			result=this.inputStudent();
			Line.dLine(100);
			
		}
		System.out.println("입력 끝");

	}

	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub

		Line.dLine(100);
		System.out.println("한울 고교 학생 정보");
		Line.dLine(100);
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
		Line.sLine(100);
		for (StudentDto dto : students) {

			System.out.printf("%s\t", dto.num);
			System.out.printf("%s\t", dto.name);
			System.out.printf("%s\t", dto.dept);
			System.out.printf("%s\t", dto.grade);
			System.out.printf("%s\t", dto.tel);
			System.out.printf("%s\n", dto.addr);

		}
		Line.dLine(100);

	}

}
