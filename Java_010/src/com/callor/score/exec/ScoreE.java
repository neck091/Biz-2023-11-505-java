package com.callor.score.exec;

import com.callor.score.service.ScoreService;

public class ScoreE {
	public static void main(String[] args) {
		ScoreService scoreService = new ScoreService();
		
		for(int i=0; i<100; i++) {
			scoreService.inputScore(0, 100);
		}
	}

}
