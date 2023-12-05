package com.callor.score.exec;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.ScoreServiceA;

public class ScoreB {
	
	public static void main(String[] args) {
		
		ScoreServiceA scoreService = new ScoreServiceA();
		ScoreDto score = new ScoreDto();
		scoreService.loadScores();
		scoreService.printScores();
	}

}
