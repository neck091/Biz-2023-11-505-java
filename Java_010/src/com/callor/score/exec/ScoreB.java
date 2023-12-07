package com.callor.score.exec;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

public class ScoreB {
	public static void main(String[] args) {

		NumberService numService = new NumberService();
		ScoreDto scoreDto = new ScoreDto();

		int num1 = numService.inputNumber("국어 점수를", 50, 100);
		int num2 = numService.inputNumber("영어 점수를", 50, 100);
		int num3 = numService.inputNumber("수학 점수를", 50, 100);

		scoreDto.kor = num1;
		scoreDto.eng = num2;
		scoreDto.math = num3;

		System.out.println("세 과목의 총점은 : " + scoreDto.getTotal());
	}

}

//WwWwWwWwWwWwWwWwWwWwWwWW잔디밭

