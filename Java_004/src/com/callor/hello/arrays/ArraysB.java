package com.callor.hello.arrays;

public class ArraysB {
	public static void main(String[] args) {

		int scoreKors = 10;

		int[] nums = new int[scoreKors];

		for (int i = 0; i < nums.length; i++) {
			int ran = (int) (Math.random() * 50) + 51;
			nums[i] = ran;
			//System.out.println((i + 1) + "번째 학생의 국어 점수 : " + nums[i]);
		}
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];

		}
		double avg = (double) sum / nums.length;
		System.out.println("=====================================");
		System.out.printf("국어 점수 총점 : %d, 평균: %.2f\n", sum, avg);
		System.out.println("=====================================");
	}
}
