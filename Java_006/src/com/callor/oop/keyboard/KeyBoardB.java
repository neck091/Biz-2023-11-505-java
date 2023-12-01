package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyBoardB {
	public static void main(String[] args) {

		int ran = (int) (Math.random() * 10) + 1;
		int num = 0;

		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("=".repeat(30));
			System.out.println("랜덤 수 맞추기 게임");
			System.out.println("-".repeat(30));

			while (true) {
				System.out.printf(">>");
				String str = scan.nextLine();

				try {
					num = Integer.valueOf(str);
				} catch (Exception e) {
					System.out.println("-".repeat(30));
					System.out.println("정수를 제대로 입력해주세요");
					System.out.println("-".repeat(30));
					continue;

				}
				if (num > 10 || num<1) {
					System.out.println("1 ~ 10까지의 값을 입력해주세요");
					continue;

				}

				if (num == ran) {
					System.out.println("=".repeat(30));
					System.out.printf("%d!정답입니다!\n참 잘했어요.\n",num);
					System.out.println("-".repeat(30));
					break;
				}
				
				if(num>ran){ System.out.println("값이 너무 커요\t"); } 
				
				if(num<ran){ System.out.println("값이 너무 작아요\t"); }
				
					System.out.println("다시 한 번 잘 생각해보세요.");
					System.out.println("-".repeat(30));
					continue;
			//점프스케어 점프스퀘어 둘 중 하나는 점프하는 네모입니다
			} // 와일1
			System.out.println("게임 다시하기(F11)");
			System.out.println("=".repeat(30));
			break;
		} //와일 2
	}
}
