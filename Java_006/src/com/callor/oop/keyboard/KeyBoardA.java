package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyBoardA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;

		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("10 이상의 정수 입력 >> ");

			String str = scan.nextLine();

			if (str == "QUIT") {
				System.out.println("중단");
				break;
			}

			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {

				System.out.println("정수를 제대로 입력해주세요");
				continue;

				// TODO: handle exception
			}

			if (num < 10) {
				System.out.println("10 이상의 정수를 입력해주세요");
				continue;
			}

			System.out.printf("1 ~ %d 까지 범위에서 짝수는?", num);
			for (int i = 1; i < num + 1; i++) {

				if (i % 2 == 0) {
					System.out.println(i);
				}
			}

		} // 와일 끝

	}// 메인

}
