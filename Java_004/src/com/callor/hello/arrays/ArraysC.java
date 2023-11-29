package com.callor.hello.arrays;

public class ArraysC {
	public static void main(String[] args) {

		System.out.println("=".repeat(30));
		System.out.println("샛별반 국어점수");
		System.out.println("-".repeat(30));

		int STUDENT_LENGTH = 10;

		int[] scoreKors = new int[STUDENT_LENGTH];

		for (int i = 0; i < scoreKors.length; i++) {
			int rndScore = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndScore;
		} // 점수분배

		for (int i = 0; i < scoreKors.length; i++) {
			System.out.printf("%2d번 : %3d점\n", (i + 1), scoreKors[i]);
		} // 출력

		int sum = 0;

		for (int i = 0; i < scoreKors.length; i++) {
			sum += scoreKors[i];
		} // 합산

		float avg = (float) sum / scoreKors.length;

		System.out.println("-".repeat(30));
		System.out.printf("국어 점수 총점 : %d, 평균: %.2f\n", sum, avg);
		System.out.println("=".repeat(30));
	}

}
