package com.callor.hello.arrays;

public class ArraysE {
	public static void main(String[] args) {
		int[] nums = new int[10];

		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}//랜덤숫자

		for (int i = 0; i < 10; i++) {
			if (nums[i] > 80) {
				System.out.printf("index %d 번 요소의 값 : %d\n", i, nums[i]); //80 이상만 출력
				//break; 첫번째만 보게하기

			}
		}
	}
}
