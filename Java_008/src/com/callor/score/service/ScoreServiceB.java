package com.callor.score.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import com.callor.score.model.ScoreDto;
import com.callor.score.utils.Line;

public class ScoreServiceB {

	private Scanner scan = null;
	private List<ScoreDto> scores = null;

	// private List<Integer> nums = null;

	/*
	 * ScoreServiceB 클래스의 생성자 method 어떤 도구들을 미리 준비하는 일을 수행/
	 */

	public ScoreServiceB(String dataFile) {

		// String dataFile = "";

		InputStream is = null;

		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	scan = new Scanner(is);
	

		/*
		 * item(요소) 가 0인 상태의 list 가 준비된다.
		 */
		scores = new ArrayList<>();
		// scores = new LinkedList<>();
		// scores = new Vector<>();

	} // 생성자 끝

	public void loadScores() {
		while (scan.hasNext()) {
			String line = scan.nextLine();
			//System.out.println(line);

			String[] lines = line.split(",");
			ScoreDto scoreDto = new ScoreDto();
			
			try {
				
				scoreDto.stuNum = lines[0];
				
				scoreDto.kor = Integer.valueOf(lines[1]);
				scoreDto.eng = Integer.valueOf(lines[2]);
				scoreDto.math = Integer.valueOf(lines[3]);
				scoreDto.music = Integer.valueOf(lines[4]);
				scoreDto.art = Integer.valueOf(lines[5]);
				scoreDto.sw = Integer.valueOf(lines[6]);
				scoreDto.db = Integer.valueOf(lines[7]);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("데이터 읽는 중 오류 발생");
				System.out.println(line);
				break;
			}

			// 리스트 타입의 데이터 목록에 scoreDto 요소를 추가하기
			// 리스트 타입의 데이터 맨 끝에 추가된다.
			scores.add(scoreDto);

		} // end while

	}// end loadScore()
	
	public void countScore() {
		
		System.out.println(scores.size() );
	}
	
	public void printScore() {
		Line.dLine(100);
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		Line.sLine(100);
		for(int i =0;i<scores.size();i++) {
			ScoreDto scoreDto = scores.get(i);
			System.out.printf("%s\t",scoreDto.stuNum);
	
			System.out.printf("%d\t",scoreDto.kor);
			System.out.printf("%d\t",scoreDto.eng);
			System.out.printf("%d\t",scoreDto.math);
			System.out.printf("%d\t",scoreDto.getTotal());
			System.out.printf("%.2f\n",scoreDto.getAvg());
			
		}

	}

}
