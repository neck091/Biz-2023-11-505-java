package com.callor.oop.exec;

import java.util.Iterator;

import com.callor.oop.service.ScoreService;
import com.callor.oop.utils.Line;

public class ScoreCA {

	public static void main(String[] args) {

		ScoreService[] scores = new ScoreService[10];

		scores[0] = new ScoreService();
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreService();

		}
		
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
