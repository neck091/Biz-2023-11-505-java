package com.callor.score.exec.scores;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;
import com.callor.score.utils.Line;

public class ScoreD {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		List<ScoreDto> scores = new ArrayList<ScoreDto>();

		int start = 50;
		int end = 100;

		for (int i = 0; i < 3; i++) {
			String stu = String.format("S%04d", i + 1);
			int kor = numService.inputNumber(stu + "번 국어 성적", start, end);
			int eng = numService.inputNumber(stu + "번 영어 성적", start, end);
			int math = numService.inputNumber(stu + "번 수학 성적", start, end);

			ScoreDto scoreDto = new ScoreDto();
			scoreDto.stdNum = stu;
			scoreDto.kor = kor;
			scoreDto.eng = eng;
			scoreDto.math = math;

			scores.add(scoreDto);
		}

		Line.dLine(50);
		System.out.println("성적 리스트");
		Line.dLine(50);
		System.out.println("학번	국어	영어	수학	총점");
		Line.sLine(50);
		for (int i = 0; i < scores.size(); i++) {

			ScoreDto dto = scores.get(i);
			System.out.printf("%s\t", dto.stdNum);
			System.out.printf("%d\t", dto.kor);
			System.out.printf("%d\t", dto.eng);
			System.out.printf("%d\t", dto.math);
			System.out.printf("%d\n", dto.getTotal());

		}

	}
}
