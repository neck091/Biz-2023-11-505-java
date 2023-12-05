package com.callor.score.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.score.model.ScoreDto;
import com.callor.score.utils.Line;

public class ScoreServiceA {
	
	

	ScoreDto[] scores = null;
	//변수의 scope 가 class 영역
	//이 변수는 Score Service 클래스의 소유
	//class 영역에는 여러가지 method 가 들어있다
	
	Scanner scan = null;
	String dataFile = null;

	/*
	 * 생성자 method(constructor) 클래스를 사용하여 객체를 선언하고 객체를 (사용하기 위해)초기화할 때 호출(실행)하는
	 * method
	 * 
	 * 클래스 이름과 같고(첫글자 대문자), return type 이 없ㄷ아 static 도 붙일 수 없음
	 * 
	 * 보통은 비어있는 (blank) 코드가 자동으로 생성되지만 필요에 따라 변수, 객체 등을 만드는 코드를 추가할 수 있다.
	 * 
	 */

	public ScoreServiceA() {
		dataFile = "src/com/callor/score/service/data.txt";
		InputStream is = null;

		try {
			is = new FileInputStream(dataFile);

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		scan = new Scanner(is);
		scores = new ScoreDto[100];
	}// end scoreservice()

	// data.txt 파일에서 성적을 읽어 score 배열에 저장하기
	// 생성자에서 이미 data txt 파일을 open 하고
	// 읽어들일 준비가 되어있다
	// 생성자에서 만들어둔 scan 객체를 사용하여
	// 데이터를 읽고 처리를 수행하면 된다.

	public void loadScores() {

		int index = 0;

		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			// System.out.println(line);
			// 읽어들인 한 라인의 데이터를 각
			// 항목별로 분해하여 lines 배열에 담기
			String[] lines = line.split(",");

			ScoreDto scoreDto = new ScoreDto();

			scoreDto.stuNum = lines[0];

			scoreDto.kor = Integer.valueOf(lines[1]);
			scoreDto.eng = Integer.valueOf(lines[2]);
			scoreDto.math = Integer.valueOf(lines[3]);
			scoreDto.music = Integer.valueOf(lines[4]);
			scoreDto.art = Integer.valueOf(lines[5]);
			scoreDto.sw = Integer.valueOf(lines[6]);
			scoreDto.db = Integer.valueOf(lines[7]);

			scores[index++] = scoreDto;

		}

	}// end load scores()

	/*
	 * loadScores() method 가 data.txt 파일에서 학생의 성적 data 를 읽어서 scores 배열에 저장해둔 상태
	 * scores 배열에 저장된 데이터를 화면에 성적표로 출력하기
	 */
	public void printScores() {

		Line.dLine(80);
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t공학\tDB\t총점\t평균");
		Line.sLine(80);
		
		/*
		 * scores 의 type 이 무엇인가?
		 * scores 라는 배열을 선언할 때  어떤 명령(도구)를 사용하여 선언했는가?
		 * ScoreDto[]를 사용하여 score 선언했음.
		 * = scores 는 ScoreDto 배열 type 이다.
		 * scores[index] 의 type 은 무언인가
		 * scores 배열의 개별 요소의 type 이 무엇인가>
		 * scores 개별 요소의 type ScoreDto
		 */

		for (int i = 0; i < scores.length; i++) {
			//변수를 만들어 쓰는 방법 ScoreDto scoreDto = scores[i];
			
			
			System.out.printf("%s\t%3d\t%3d\t%3d\t%3d\t%3d\t%3d\t%3d\t", scores[i].stuNum, scores[i].kor, scores[i].eng,
					scores[i].math, scores[i].music, scores[i].art, scores[i].sw, scores[i].db);
			System.out.printf("%3d\t", scores[i].getTotal());
			System.out.printf("%.2f\n", scores[i].getAvg());
		}
		Line.dLine(80);

	}//end printScore()

}
