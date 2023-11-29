package com.callor.hello.arrays;

public class ArraysD {

	public static void main(String[] args) {

		int STUDENT_LENGTH = 10;
		int[] scoreK = new int[STUDENT_LENGTH]; // 국
		int[] scoreE = new int[STUDENT_LENGTH]; // 영
		int[] scoreM = new int[STUDENT_LENGTH]; // 수

		for (int i = 0; i < scoreK.length; i++) {
			int rnd = (int) (Math.random() * 50) + 51;
			scoreK[i] = rnd;
		} // 국

		for (int i = 0; i < scoreE.length; i++) {
			int rnd = (int) (Math.random() * 50) + 51;
			scoreE[i] = rnd;
		} // 영

		for (int i = 0; i < scoreM.length; i++) {
			int rnd = (int) (Math.random() * 50) + 51;
			scoreM[i] = rnd;
		} // 수

		int[] sum = new int[STUDENT_LENGTH];

		for (int i = 0; i < STUDENT_LENGTH; i++) {

			sum[i] = scoreK[i] + scoreE[i] + scoreM[i];

		}

		float[] avg = new float[STUDENT_LENGTH];

		for (int i = 0; i < STUDENT_LENGTH; i++) {

			avg[i] = (float) sum[i] / 3;
		}

		System.out.println("=".repeat(50));
		System.out.println("국어     영어      수학      총점     평균");
		System.out.println("-".repeat(50));

		for (int i = 0; i <STUDENT_LENGTH; i++) {
			System.out.printf("%3d       %3d         %3d        %3d     %5.2f \n", scoreK[i], scoreE[i], scoreM[i], sum[i],
					avg[i]);//출력

		}

	}

}
