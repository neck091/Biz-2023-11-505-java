package com.callor.oop.input;

import java.util.Scanner;

import com.callor.oop.utils.Line;

public class InputFA {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
		String str = "";

		while (true) {
			System.out.print("정수(QUIT : 종료) >> ");
			str = scan.nextLine();
			if (str.equals("QUIT"))
				break;
			int num =0;
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력바람");
				System.out.println("입력한 값 : "+str);
				continue;
			}
			if (num < 2 || num > 10) {
				System.out.println("2부터 10까지 범위의 정수를 입력바람");
				System.out.println("입력한 값 : "+str);
				continue;
			}
			// 짝수 구분
			if (num % 2 == 0) {
				System.out.printf("%d는 짝수\n", num);
				
			} else {
				System.out.printf("%d는 짝수가 아님\n", num);
				
			}
		} // 와일 끝
	}
}
