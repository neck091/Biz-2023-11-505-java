package com.callor.oop.input;

import java.util.Scanner;

public class InputEC {

	public static void main(String[] args) {
		// nums type 은? 정수형 배열
		int[] nums = new int[3];
		// scan type 은? Scanner 클래스 type Scanner 클래스 type 의 객체(object)
		// Scanner type.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=".repeat(30));
		
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d 번째 값 입력 : ", i + 1);
			
			// str 의 정체는? 문자열형 변수
			// 문자열 클래스의 객체, 문자열형 객체
			String str = scan.nextLine();
			nums[i] = Integer.valueOf(str);
		}
		System.out.println("=".repeat(30));
		for (int i=0; i<nums.length; i++) {
			
			System.out.println(nums[i]);
		}
		System.out.println("=".repeat(30));
		
	
	

	
	}

}
