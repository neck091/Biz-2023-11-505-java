package com.callor.score.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreDto;
import com.callor.score.model.StudentDto;
import com.callor.score.utils.Line;

public class StudentService {

	Scanner scan = null;

	List<StudentDto> student = null;

	public StudentService(String dataFile) {

		InputStream is = null;

		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		scan = new Scanner(is);

		student = new ArrayList<>();
	}// 학생서비스 생성자 끝

	public void loadStudents() {

		while (scan.hasNext()) {
			String line = scan.nextLine();

			String[] lines = line.split(",");
			StudentDto studentDto = new StudentDto();

			try {

				studentDto.num = lines[0];
				studentDto.name = lines[1];
				studentDto.dept = lines[2];
				studentDto.grade = lines[3];
				studentDto.prof = lines[4];
				studentDto.tel = lines[5];
				studentDto.addr = lines[6];

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("데이터 읽는 중 오류 발생");
				System.out.println(line);
				break;
			}

			student.add(studentDto);
		} // 와일 끝
	}// 학생로드끝

	public void printStudent() {

		Line.dLine(150);
		System.out.println("학번\t이름\t학과\t학년\t담임교수\t전화번호\t주소");
		Line.sLine(150);

		for (int i = 0; i < student.size(); i++) {
			StudentDto studentDto = student.get(i);
			System.out.printf("%s\t", studentDto.num);
			System.out.printf("%s\t", studentDto.name);
			System.out.printf("%s\t", studentDto.dept);
			System.out.printf("%s\t", studentDto.grade);
			System.out.printf("%s\t", studentDto.prof);
			System.out.printf("%s\t", studentDto.tel);
			System.out.printf("%s\n", studentDto.addr);
		}

	}

}
