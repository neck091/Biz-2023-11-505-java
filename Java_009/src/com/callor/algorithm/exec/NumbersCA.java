package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

public class NumbersCA {
	public static void main(String[] args) {

		NumberService numService = new NumberService();
		Line.dLine(50);
		int num = numService.inputNum("숫자를");
		Line.sLine(50);

		for (int i = 0; i < num; i++) {
			//i = 0 : j = 0 ; j < 7 : 7 - 0
			//i = 0 : j = 0 ; j < 6 : 6 - 0
			//i = 0 : j = 0 ; j < 5 : 5 - 0
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
		
		Line.dLine(50);

		for (int i = 0; i <num ; i++) {

			//j 7~0 : 7개
			//j 7~1 : 6개
			//j 7~2 : 5개
			for (int j = num; j >i ; j--) {
				System.out.print("* ");
			}
			System.out.println();

		}
		
	}
}