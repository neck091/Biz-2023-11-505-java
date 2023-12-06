package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

public class NumbersH {

	public static void main(String[] args) {

		NumberService numService = new NumberService();
		
		
		Line.dLine(50);
		System.out.println("세 과목의 점수를 입력하세요");
	
		
		int score = numService.inputNum("첫 번째 과목점수");
		int score1 = numService.inputNum("두 번째 과목점수");
		int score2 = numService.inputNum("세 번째 과목점수");

		int sum = score + score1 + score2;
		float avg = (float) sum / 3;

		if (avg > 59) {
			System.out.printf("평균 %.2f점\n: 축하합니다 합격입니다", avg);
		} else {
			System.out.printf("평균 %.2f점\n: 아쉽지만 낙제입니다", avg);
		}

	}

}
