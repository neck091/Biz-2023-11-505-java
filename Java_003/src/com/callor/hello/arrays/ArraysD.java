package com.callor.hello.arrays;

public class ArraysD {
	public static void main(String[] args) {

		int[] nums = new int[10];
		int sum = 0;
		for (int index = 0; index < 10; index++) {
			nums[index] = (int) (Math.random() * 50) + 51; // 값 분배
		} // for1

		for (int i = 0; i < 10; i++) {
			if (nums[i] % 2 == 0) {
				System.out.printf("index %d 번 요소의 값 : %d\n", i, nums[i]); // 짝수 구분 출력
			}
		} // for2

		// 짝수들 합산
		for (int s = 0; s < 10; s++) {
			if (nums[s] % 2 == 0) {
				sum += nums[s];

			}

		} // for3
		System.out.println("짝수들의 합 : " + sum);
	}
}