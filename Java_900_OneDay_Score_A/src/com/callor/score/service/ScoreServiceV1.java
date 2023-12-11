package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.models.ScoreDto;
import com.callor.score.utils.Line;

/*ffffffuck 
 * 움칫땃쥣 쥑쥑
 * 
 * 랭덤값으로 51-100 ㄱ까지 점수 생성,
 * scoreDto 각 과목 요소에 할당
 * lis<scoreDto> 에 추가
 */
public class ScoreServiceV1 {

	/*
	 * ScoreServiceV1 을 상속하고 싶다
	 * 이 때 v1 에 선언된 public method 는 별다른 코드 변경 없이 v2 에서 사용 가능
	 * 하지만 private 로 선언된 변수는 상속 불가
	 * protected 로 변경해준다.
	 */
	
	protected List<ScoreDto> scores = null;

	public ScoreServiceV1() {

		// 생성자에서 아래와 같이 스코어스를 생성하면 생성자를 벗어난 수 scores 는 소멸
		// 클래스 영역에 선언된 스코어스는 여전히 null
		// List<ScoreDto> scores = new ArrayList<ScoreDto>();

		scores = new ArrayList<ScoreDto>();

	}

	// 학생 한 명의 학번, 과목별 점수를 임의 생성하여 scores 에 추가하는 method
	public void makeScore() {
		int kor = (int) (Math.random() * 51) + 50;
		int eng = (int) (Math.random() * 51) + 50;
		int math = (int) (Math.random() * 51) + 50;
		int music = (int) (Math.random() * 51) + 50;
		int art = (int) (Math.random() * 51) + 50;

		// 학번 자동 생성
		// 1. scores 에 추가된 성적표가 있는가
		// 2. 없으면 최초의 성적이므로 230001로 세팅
		// 3. 있으면 가장 마지막 성적표의 학번을 조회하여
		// 학번을 +1 하여 새로운 학번 생성

		String strStdNum = "23001";
		int scoresSize = scores.size();

		if (scoresSize > 0) {

			ScoreDto dto = scores.get(scoresSize - 1);
			strStdNum = dto.stdNum;
			strStdNum = strStdNum.substring(2);

			int intStdNum = Integer.valueOf(strStdNum);

			intStdNum++;
			strStdNum = String.format("23%03d", intStdNum);

		}

		// 성적표 생성
		ScoreDto scoreDto = new ScoreDto();
		scoreDto.stdNum = strStdNum;
		scoreDto.kor = kor;
		scoreDto.eng = eng;
		scoreDto.math = math;
		scoreDto.music = music;
		scoreDto.art = art;

		scores.add(scoreDto);

	}// make scores

	// count 변수에 정수값을 정닥ㄹ받아 count 만큰 makeScore()호출하여 count 만큼 성적데이터를 생성하고 scores 에
	// 추가
	public void makeScore(int count) {

		for (int i = 0; i < count; i++) {
			this.makeScore();
		}
	}

	public void printScore() {

		Line.dLine(100);
		System.out.println("한울 고교 새별반 성적표");
		Line.dLine(100);
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		Line.sLine(100);

		// for(int i=0; i<scores.size(); i++) {
		// ScoreDto dto = score.get(i);

		// scores 에서 index 번째 요소를 get 하여 dto 클래스 변수에 담아주는 일까지 한 번에 처리

		for (ScoreDto dto : scores) {
			System.out.printf("%s\t", dto.stdNum);

			System.out.printf("%4d\t", dto.kor);
			System.out.printf("%4d\t", dto.eng);
			System.out.printf("%4d\t", dto.math);
			System.out.printf("%4d\t", dto.music);
			System.out.printf("%4d\t", dto.art);

			System.out.printf("%4d\t", dto.getTotal());
			System.out.printf("%.2f\n", dto.getAvg());

		}
		Line.sLine(100);

	}// print

}// class
