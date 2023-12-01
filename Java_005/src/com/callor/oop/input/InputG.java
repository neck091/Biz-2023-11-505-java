package com.callor.oop.input;

import java.util.Scanner;

import com.callor.oop.utils.Line;

public class InputG {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = "";

		while (true) {
			System.out.print("\n(QUIT : 끝내기) 정수 입력 >> ");
			str = scan.nextLine();
			if (str.equals("QUIT"))
				break;

			int num = 0;
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력바람");
				continue;
			}
			if (num < 2) {
				System.out.println("2 이상의 정수를 입력바람");
				continue;
			}
			// 짝수 구분
			if (num % 2 == 0) {
				System.out.printf("%d는 짝수\n", num);

			} else {
				System.out.printf("%d는 짝수가 아님\n", num);

			}

			int i = 0;
			for (i = 2; i < num; i++) {
				if (num % i == 0)
					break;
			}
			if(i<num) {
				System.out.printf("%d는 소수가 아님",num);
			} else {
				System.out.printf("%d는 소수임\n",num);
			}
			
			
		}

	} // 와일 끝

}
