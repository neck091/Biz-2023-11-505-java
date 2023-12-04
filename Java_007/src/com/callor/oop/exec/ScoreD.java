package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;
import com.callor.oop.utils.Line;

public class ScoreD {
	public static void main(String[] args) {

		int ran = 0;

		// 초기화
		ScoreService[] scores = new ScoreService[10];
		for (int i = 0; i < scores.length; i++) {

			scores[i] = new ScoreService();
		}

		// 랜덤수 만들기
		for (int i = 0; i < scores.length; i++) {

			scores[i].scoreKor = (int) (Math.random() * 50) + 51;
			scores[i].scoreEng = (int) (Math.random() * 50) + 51;
			scores[i].scoreMath = (int) (Math.random() * 50) + 51;
		}

		System.out.println("=".repeat(50));
		System.out.println("국어	영어	수학	총점	평균");
		System.out.println("-".repeat(50));

		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d\t%d\t%d", scores[i].scoreKor, scores[i].scoreEng, scores[i].scoreMath);
			System.out.printf("\t%d\t", scores[i].getScoreTotal());
			System.out.printf("%.2f\n", scores[i].getScoreAvg());
		}
		System.out.println("=".repeat(50));
	//=================================================================================
		//배열에 저장된 점수를 함수로 출력하기
		//LIne.title("성적표");
		
		Line.title(50, "성적표");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		Line.sLine(50);
		
		for(int i=0;i<scores.length;i++) {
			
			System.out.printf("%3d\t",scores[i].scoreKor);
			System.out.printf("%3d\t",scores[i].scoreEng);
			System.out.printf("%3d\t",scores[i].scoreMath);
			
			System.out.printf("%3d\t",scores[i].getScoreTotal());
			System.out.printf("%.2f\n",scores[i].getScoreAvg());
		}
		Line.dLine(50);
	}
}

