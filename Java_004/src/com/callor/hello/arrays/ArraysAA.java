package com.callor.hello.arrays;

public class ArraysAA {
	public static void main(String[] args) {

		int[] nums = new int[10];

		for (int i = 0; i < 10; i++) {
			int ran = (int) (Math.random() * 50) + 51;
			nums[i] = ran;
		}

		System.out.println("80보다 큰 최초의 값은 ");
		for (int i = 0; i < 10; i++) {
			if (nums[i] > 80) {
				System.out.printf("index %d 번 요소의 값 : %d", i, nums[i]);
				break;
			}

		}

	}

}
