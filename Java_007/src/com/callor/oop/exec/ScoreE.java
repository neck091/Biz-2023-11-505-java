package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;

public class ScoreE {
	public static void main(String[] args) {

		int ran = 0;

		// 초기화
		ScoreService[] scores = new ScoreService[10];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreService();
		}

		// 랜덤수 만들기
		for (int i = 0; i <scores.length ; i++) {
			
			scores[i].scoreKor = (int) (Math.random() * 50) + 51;
			scores[i].scoreEng = (int) (Math.random() * 50) + 51;
			scores[i].scoreMath = (int) (Math.random() * 50) + 51;
		}
	}
}
//


