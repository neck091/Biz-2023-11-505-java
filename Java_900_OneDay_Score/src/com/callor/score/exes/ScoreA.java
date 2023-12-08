package com.callor.score.exes;

import com.callor.score.service.ScoreService;

public class ScoreA {

	public static void main(String[] args) {
		ScoreService scoreService = new ScoreService();

		scoreService.inputScore(10);
	
		scoreService.printScore();
	}
}
