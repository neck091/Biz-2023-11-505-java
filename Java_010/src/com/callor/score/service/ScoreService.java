package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.utils.Line;

public class ScoreService {

//	클래스 영역에서는 선언만 하고
	private List<ScoreDto> scores = null;
	private NumberService numService = null;
	
	//생성자에서 초기화. 사용할 준비하기
	public ScoreService()
	{
		scores = new ArrayList<ScoreDto>();
		numService = new NumberService();
	}
	/*
	 * inputScore method를 매개변수 없이 호출하면 method 내부에서 start 값과 end 값 임의로 생성하고
	 * 현재 class 에 있는 inputScore(int start int end) method 에게 전달
	 */
	public void inputScore() {
		NumberService numService = new NumberService();

		int start = 0;
		int end = 100;
		// this. : scoreService 클래스를 나타내는 특별한 변수
		this.inputScore(start,end);

		
	}//intput
	
	public void inputScore(int start, int end) {
		
		/*
		 * 점수를 저장할 때 학번을 자동생성하여 저장하고 싶다
		 * 우리의 학번은 230001 형식으로 만들고 싶다.  
		 */
		
		NumberService numService = new NumberService();
		
		// socres 리스트에 저장되어 있는 데이터 중 가장 마지막 요소
		//(제일끝 index) 요소 에서 학번을 가져와서 strStdNum 변수에 할당하라
		//String strStdNum = "";
		//if(scores.size()>0) {
		//	strStdNum = scores.get(scores.size()-1).stdNum;
		//}else{ strStdNum = "230001";}
		//만약 스코어스 리스트에 데이터가 한개라도 있으면 마지막요소의 학번은ㄹ  에 할당하고 그렇지 않은면 초기값인 23000을 유지하라
		
		String strStdNum = "230000";
		if(scores.size()>0) {
			strStdNum = scores.get(scores.size()-1).stdNum;
		}
		
		int intStdNum = Integer.valueOf(strStdNum.substring(2));
		intStdNum++;
		
		strStdNum = String.format("23%04d",intStdNum);
		
		int kor = numService.inputNumber(strStdNum+"번의 국어 점수", start, end);
		int eng = numService.inputNumber(strStdNum+"번의 영어 점수", start, end);
		int math = numService.inputNumber(strStdNum+"번의 수학 점수", start, end);

		ScoreDto scoreDto = new ScoreDto();
		scoreDto.stdNum = strStdNum;
		scoreDto.kor = kor;
		scoreDto.eng = eng;
		scoreDto.math = math;

		scores.add(scoreDto);

	}
	
	public void printScore() {
		
		Line.dLine(50);
		System.out.println("국어	영어	수학	총점");
		Line.sLine(0);
		
		for(ScoreDto dto : scores) {
		System.out.printf("%s",dto.stdNum);
		System.out.printf("%d\t", dto.kor);
		System.out.printf("%d\t", dto.eng);
		System.out.printf("%d\t", dto.math);
		System.out.printf("%d\n", dto.getTotal());
		}
	}
}
