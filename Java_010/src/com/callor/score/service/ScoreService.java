package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;

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
	
	public void inputScore() {
		NumberService numService = new NumberService();

		int start = 50;
		int end = 100;

		int kor = numService.inputNumber("국어 성적");
		int eng = numService.inputNumber("영어 성적");
		int math = numService.inputNumber("수학 성적");

		ScoreDto scoreDto = new ScoreDto();
		scoreDto.kor = kor;
		scoreDto.eng = eng;
		scoreDto.math = math;

		scores.add(scoreDto);

	}
}
