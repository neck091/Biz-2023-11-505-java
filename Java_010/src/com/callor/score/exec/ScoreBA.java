package com.callor.score.exec;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

public class ScoreBA {
	public static void main(String[] args) {

		NumberService numService = new NumberService();
		ScoreDto scoreDto = new ScoreDto();

		int start = 50;
		int end = 100;

		int scoreKor = numService.inputNumber("국어 점수를", start, end);
		int scoreEng = numService.inputNumber("영어 점수를", start, end);
		int scoreMath = numService.inputNumber("수학 점수를", start, end);

		scoreDto.kor = scoreKor;
		scoreDto.eng = scoreEng;
		scoreDto.math = scoreMath;

		System.out.println("총점 : " + scoreDto.getTotal());
	}

}
//                                                    __ / 위이잉ㅇ
//WwWwWwWwWwWwWwWwWwWwWwWW잔디밭WwWwWwWwwwwwwwwwwwww <__ >  잔디깎이 wwwwwwww
