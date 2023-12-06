package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.util.Line;

public class ScannerB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0;
		int num2 = 0;
		Line.dLine(50);
		while (true) {
			System.out.println("첫번째 정수를 입력하세요 >> ");
			String str = scan.nextLine();

			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("** 정수를 정확히 입력하여 주세요 **");
				continue;

			}
			break;
		}

		while (true) {
			System.out.println("두번째 정수를 입력하세요 >> ");
			String str2 = scan.nextLine();

			try {
				num2 = Integer.valueOf(str2);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("** 정수를 정확히 입력하여 주세요 **");
				continue;

			}

			break;

		}
		Line.sLine(50);
		System.out.printf("%d + %d = %d\n", num, num2, num + num2);
		System.out.printf("%d - %d = %d\n", num, num2, num - num2);
		System.out.printf("%d * %d = %d\n", num, num2, num * num2);
		System.out.printf("%d / %d = %d\n", num, num2, num / num2);
		System.out.printf("%d MOD %d = %d\n", num, num2, num % num2);
		Line.dLine(50);

	}

}
