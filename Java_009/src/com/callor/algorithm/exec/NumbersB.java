package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.util.Line;

public class NumbersB {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 0;
		Line.dLine(50);
		System.out.printf("숫자를 입력해주세요 >> ");
		String str = scan.nextLine();

		num = Integer.valueOf(str);
		Line.sLine(50);

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		Line.dLine(50);
	}
}