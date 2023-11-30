package com.callor.oop.input;

import java.util.Scanner;

import com.callor.oop.utils.Line;

public class InputF {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = 0;
		String str = "";

		while (true) {
			System.out.print("(QUIT : 끝내기) 정수 입력 >> ");
			str = scan.nextLine();
			if (str.equals("QUIT"))
				break;

			try {
				num = Integer.valueOf(str);
				if (num < 2 || num > 10) {
					System.out.println("2부터 10까지 범위의 정수를 입력바람");
					continue;

				}
				//짝수 구분
				if (num%2 == 0) {
					System.out.printf("%d는 짝수\n", num);

				} else {
					System.out.printf("%d는 짝수가 아님\n", num);

				}
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력바람");
				continue;
			}
		} // 와일 끝

	}
}


