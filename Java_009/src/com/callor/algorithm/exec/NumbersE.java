package com.callor.algorithm.exec;

import com.callor.algorithm.util.Line;

public class NumbersE {

	public static void main(String[] args) {

		for (int dan = 2; dan < 10; dan++) {
			Line.dLine(50);
			System.out.println(dan+"단 구구단");
			Line.dLine(50);
			for (int i = 1; i < 10; i++)
				if ((dan * i) % 2 == 0) {
					System.out.printf("%d x %d = %d\n", dan, i, dan * i);
				}
		}
		Line.dLine(50);
	}

}
