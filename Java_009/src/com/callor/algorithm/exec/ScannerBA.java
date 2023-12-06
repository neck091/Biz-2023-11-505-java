package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.util.Line;

public class ScannerBA {

	public static int inputNum(String title) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		while (true) {
			System.out.println(title+"를 입력해주세요");
			String str = scan.nextLine();
			try {
				num = Integer.valueOf(str);
			
			} catch (Exception e) {
				System.out.println("** 정수를 정확히 입력해주세요 **");
				continue;
			}
			return num;
		}
		

	}
	
	public static void main(String[] args) {
		Line.dLine(50);
		int num1 = inputNum("첫번째 정수를");
		int num2 = inputNum("두 번째 정수를");
		
		Line.sLine(50);
	
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2);
		Line.dLine(50);

		
	}
	
}