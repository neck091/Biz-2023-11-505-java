package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyBoardAB {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 0;

		System.out.println("=".repeat(50));
		System.out.println("10 이상의 정수 입력");
		System.out.println("정수 >> ");

		String str = scan.nextLine();

		try {
			num = Integer.valueOf(str);
		} catch (Exception e) {

			System.out.println("정수를 제대로 입력해주세요");
			System.out.println("프로젝트를 다시 실행해주세요");
			return;

		}

		if (num < 10) {
			System.out.println("10 이상의 정수를 입력해주세요");
			return;
		}

		System.out.printf("1 ~ %d 까지 범위에서 짝수는?\n", num);
		for (int i = 0; i < num; i++) {

			if ((i + 1) % 2 == 0) {
				System.out.print((i+1) + " ");
			}
		}
	}// 메인
}
