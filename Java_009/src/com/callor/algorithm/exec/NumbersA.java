package com.callor.algorithm.exec;

import com.callor.algorithm.util.Line;

public class NumbersA {
	public static void main(String[] args) {
		int i = 0;
		Line.dLine(80);
		while (i < 10) {
			System.out.printf("%d\t", i + 1);
			i++;
		}
		System.out.println();
		Line.dLine(80);

		i = 0;
		Line.dLine(80);
		while (true) {
			System.out.printf("%d\t", i + 1);
			i++;
			if(i>=10) break;
		}
		System.out.println();
		Line.dLine(80);
		
		Line.dLine(80);
		i = 0;
		while (i < 10) {
			System.out.printf("%d\t", i++ + 1);
		}
		System.out.println();
		Line.dLine(80);
		
	}
}
