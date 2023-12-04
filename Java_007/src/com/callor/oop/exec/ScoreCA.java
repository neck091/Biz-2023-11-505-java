package com.callor.oop.exec;

import java.util.Iterator;

import com.callor.oop.service.ScoreService;

public class ScoreCA {

	public static void main(String[] args) {

		ScoreService[] scores = new ScoreService[10];

		scores[0] = new ScoreService();
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreService();

		}
	}
}
