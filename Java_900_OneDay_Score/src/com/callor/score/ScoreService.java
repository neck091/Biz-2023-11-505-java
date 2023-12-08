package com.callor.score;

import java.util.ArrayList;
import java.util.List;

public class ScoreService {

	List<ScoreDto> scores = new ArrayList<ScoreDto>();

	public void inputScore() {
		int stuNum = 10;

		int scoreKor = stuNum;
		int scoreEng = stuNum;
		int scoreMath = stuNum;
		int scoreMusic = stuNum;
		int scoreArt = stuNum;

		for (int i = 0; i < stuNum; i++) {
			scoreKor = (int) (Math.random() * 50) + 51;
			scoreEng = (int) (Math.random() * 50) + 51;
			scoreMath = (int) (Math.random() * 50) + 51;
			scoreMusic = (int) (Math.random() * 50) + 51;
			scoreArt = (int) (Math.random() * 50) + 51;
		}

		String strStdNum = "230000";
		if (scores.size() > 0) {
			strStdNum = scores.get(scores.size() - 1).stdNum;
		}
		int intStdNum = Integer.valueOf(strStdNum.substring(2));
		intStdNum++;

		strStdNum = String.format("23%04d", intStdNum);

		ScoreDto scoreDto = new ScoreDto();
		scoreDto.stdNum = strStdNum;
		scoreDto.kor = scoreKor;
		scoreDto.eng = scoreEng;
		scoreDto.math = scoreMath;
		scoreDto.music = scoreMusic;
		scoreDto.art = scoreArt;

		scores.add(scoreDto);

	}

	public void printScore() {

		Line.dline(100);
		System.out.println("* 한울 고교 새별 반 성적 리스트 *");
		Line.dline(100);
		System.out.println("학번\t\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		Line.sline(100);

		int kSum = 0;
		int eSum = 0;
		int mSum = 0;
		int msSum = 0;
		int aSum = 0;
		int totalSum =0;
		float avgSum =0;

		for (ScoreDto dto : scores) {
			System.out.printf("%s\t\t", dto.stdNum);
			System.out.printf("%d\t", dto.kor);
			System.out.printf("%d\t", dto.eng);
			System.out.printf("%d\t", dto.math);
			System.out.printf("%d\t", dto.music);
			System.out.printf("%d\t", dto.art);
			System.out.printf("%d\t", dto.getTotal());
			System.out.printf("%.2f\n", dto.getAvg());

			kSum += dto.kor;
			eSum += dto.eng;
			mSum += dto.math;
			msSum += dto.music;
			aSum += dto.art;
			totalSum += dto.getTotal();
		}
		Line.sline(100);
	
		System.out.printf("총점\t\t");
		System.out.printf("%d\t", kSum);
		System.out.printf("%d\t", eSum);
		System.out.printf("%d\t", mSum);
		System.out.printf("%d\t", msSum);
		System.out.printf("%d\t", aSum);
		System.out.printf("%d\n", totalSum);

		
		float avgAll = (float) (kSum/10+ eSum/10 + mSum/10 +msSum/10 +aSum/10);
		System.out.printf("평균\t\t");
		System.out.printf("%.2f\t", (float) kSum / 10);
		System.out.printf("%.2f\t", (float) eSum / 10);
		System.out.printf("%.2f\t", (float) mSum / 10);
		System.out.printf("%.2f\t", (float) msSum / 10);
		System.out.printf("%.2f\t", (float) aSum / 10);
		System.out.printf("\t%.2f\n",avgAll/5);
		Line.dline(100);
	}
}
