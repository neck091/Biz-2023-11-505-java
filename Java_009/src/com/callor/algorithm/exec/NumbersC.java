package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

public class NumbersC {
	public static void main(String[] args) {

		NumberService numService = new NumberService();
		Line.dLine(50);
		int num = numService.inputNum("숫자를");
		Line.sLine(50);

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < num - i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		Line.dLine(50);

		for (int i = num; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		Line.dLine(50);
	}
}