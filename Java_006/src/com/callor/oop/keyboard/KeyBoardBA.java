package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyBoardBA {
	public static void main(String[] args) {

		int ran = (int) (Math.random() * 10) + 1;

		Scanner scan = new Scanner(System.in);

		System.out.println("=".repeat(30));
		System.out.println("숫자 맞추기 게임");
		System.out.println("-".repeat(30));

	

			while (true) {
				
				System.out.println("1 ~ 10까지 범위의 정수를 입력하세요");
				System.out.printf("정수 >>");
				String str = scan.nextLine();

				int num = 0;
				try {
					num = Integer.valueOf(str);
				} catch (Exception e) {
					System.out.println("정수를 정확히 입력해주세요");
					System.out.printf("(%s)\n",str);
					continue;

				}
				if (num > 10 || num < 1) {
					System.out.println("1 ~ 10까지 범위의 정수만 입력해주세요");
					continue;

				}

				if (num == ran) {
					System.out.println("=".repeat(30));
					System.out.println("참 잘했어요 : "+ num);
					System.out.println("-".repeat(30));
					break;
				}else if (num > ran) {
					System.out.println("입력한 값이 너무 커요\t");
				}else if (num < ran) {
					System.out.println("입력한 값이 너무 작아요\t");
				}

				System.out.println("다시 한 번 잘 생각해보세요.");
				System.out.println("-".repeat(30));
				// 점프스케어 점프스퀘어 둘 중 하나는 점프하는 네모입니다
			} // 와일1
			System.out.println("GAME OVER! 다시하기(F11)");
			System.out.println("=".repeat(30));
	}//메인끝
}
