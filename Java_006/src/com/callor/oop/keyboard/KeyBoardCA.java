package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyBoardCA {
	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		System.out.println("=".repeat(30));
		System.out.println("황금열쇠를 찾아라");
		System.out.println("-".repeat(30));

		int index = 0; 
		int chan = 5;
		int num = 0;
		int arr = 50;

		while(true) {
			int ran = (int) (Math.random() * 50) + 1;
			while (true) {
				System.out.printf("1 ~ %d까지 범위의 정수를 입력하세요\n",arr);
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

				if (num > 50 || num < 1) {
					System.out.printf("1 ~ %d까지 범위의 정수만 입력해주세요\n",arr);
					System.out.println("-".repeat(30));
					continue;
				}
				index++;

				if (num == ran) {
					System.out.println("-".repeat(30));
					System.out.println("축하합니다! 금고를 여셨어요.\n황금열쇠 : " + num);
					System.out.println("도전횟수 : " + index + "번");
					System.out.println("=".repeat(30));
					System.out.println("=".repeat(30));
					break;
				} else if (num > ran) {
					System.out.println("입력한 값이 너무 커요\t");
				} else if (num < ran) {
					System.out.println("입력한 값이 너무 작아요\t");
				}

				System.out.println("다시 한 번 잘 생각해보세요.");
				System.out.printf("%d번째 시도.(%d/%d)\n", index, index, chan);
				System.out.println("-".repeat(30));

				if (index == chan && num != ran) {

					System.out.println("GAME OVER! 기회를 다 써버렸네요.");
					System.out.println("금고 앞을 서성거리던 당신은 경비원에게 걸려\n이내 감옥으로 연행되었습니다.");
					System.out.println("황금열쇠 : " + ran );
					System.out.println("도전횟수 : " + index + "번");
					System.out.println("=".repeat(30));
					break;

					}
				} // 와일 1
			
			System.out.println("게임을 종료할까요?");
			System.out.println("게임을 종료하길 원하시면'예'라고 답하시오.");
			String str2 = scan.nextLine();
			if(str2.equals("예")) break;

			
			index = 0;
		} //와일2
	}
}
