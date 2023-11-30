package com.callor.oop.input;

import java.util.Scanner;

public class InputE {

	public static void main(String[] args) {

		int[] nums = new int[3];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < nums.length; i++) {

			while (true) {
				System.out.printf("%d 번째 값 입력 : ", i + 1);
				String str = scan.nextLine();

				try {

					nums[i] = Integer.parseInt(str); // 입력한 값 배열에 분배.
					
				} catch (Exception e) { 
					System.out.println("정수 값으로 정확히 입력해야 합니다.");
					continue;
					// TODO: handle exception
				}
				break;

			}
		}
		System.out.println("============================");
		System.out.print("입력하신 값은 차례대로 : ");
		for (int i = 0; i < 3; i++) {

			System.out.printf("%d ", nums[i]); // 저장된 값을 순서대로 출력

		}
		System.out.print("입니다.");
//싫어요 문장 안고칠게요
	}

}
