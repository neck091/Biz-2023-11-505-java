package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyBoardC {
	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		System.out.println("=".repeat(30));
		System.out.println("숫자 맞추기 게임");
		System.out.println("-".repeat(30));

		int t = 0;
		int g = 5;
		int num = 0;

		while(true) {
			int ran = (int) (Math.random() * 10) + 1;
			while (true) {
				System.out.println("1 ~ 10까지 범위의 정수를 입력하세요");
				System.out.printf("정수 >>");
				String str = scan.nextLine();

				try {
					num = Integer.valueOf(str);
				} catch (Exception e) {
					System.out.println("-".repeat(30));
					System.out.println("정수를 정확히 입력해주세요");
					System.out.printf("(%s)\n", str);
					System.out.println("-".repeat(30));
					continue;

				}

				if (num > 10 || num < 1) {
					System.out.println("1 ~ 10까지 범위의 정수만 입력해주세요");
					System.out.println("-".repeat(30));
					continue;
				}
				t++;

				if (num == ran) {
					System.out.println("-".repeat(30));
					System.out.println("참 잘했어요! 정답은 : " + num);
					System.out.println("도전횟수 : " + t + "번");
					System.out.println("=".repeat(30));
					System.out.println("=".repeat(30));
					break;
				} else if (num > ran) {
					System.out.println("입력한 값이 너무 커요\t");
				} else if (num < ran) {
					System.out.println("입력한 값이 너무 작아요\t");
				}

				System.out.println("다시 한 번 잘 생각해보세요.");
				System.out.printf("%d번째 시도.(%d/%d)\n", t, t, g);
				System.out.println("-".repeat(30));

				if (t == g && num != ran) {

					System.out.println("GAME OVER! 기회를 다 써버렸네요.");
					System.out.println("정답은 : " + ran + " 입니다.");
					System.out.println("도전횟수 : " + t + "번");
					System.out.println("=".repeat(30));
					System.out.println("");
					break;

					}
				} // 와일 1
			t = 0;
		} // 폴
	}
}
