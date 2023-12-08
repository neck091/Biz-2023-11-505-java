package com.callor.score.exec.scores;

import com.callor.score.service.ScoreService;

public class ScoreF {

	public static void main(String[] args) {

		ScoreService scoreService = new ScoreService();

		for (int i = 0; i < 3; i++) {
			scoreService.inputScore();
		}

		scoreService.printScore();
	}
}
