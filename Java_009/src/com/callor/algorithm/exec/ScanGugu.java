package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

public class ScanGugu {

	public static void main(String[] args) {

		NumberService numService = new NumberService();

		Line.dLine(50);

		int dan = numService.inputNum("원하는 구구단 단수를");
		Line.dLine(50);

		System.out.println(dan + " 단 구구단");
		Line.sLine(50);

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}
		Line.dLine(50);
	}
}
