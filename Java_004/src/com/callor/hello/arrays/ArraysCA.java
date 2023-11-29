package com.callor.hello.arrays;

public class ArraysCA {
	public static void main(String[] args) {


		int STUDENT_LENGTH = 10;

		int[] scoreKors = new int[STUDENT_LENGTH];

		for (int i = 0; i < scoreKors.length; i++) {
			int rndScore = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndScore;
		} // 점수분배


		int sum = 0;

		for (int i = 0; i < scoreKors.length; i++) {
			sum += scoreKors[i];
		} // 합산

		System.out.println("=".repeat(30));
		System.out.println("샛별반 국어점수");
		System.out.println("-".repeat(30));

		for (int i = 0; i < scoreKors.length; i++) {
			System.out.printf("%2d번 : %3d점\n", (i + 1), scoreKors[i]);
		} // 학생 점수 출력

		float avg = (float) sum / scoreKors.length;
		
		System.out.println("-".repeat(30));
		System.out.printf("국어 점수 총점 : %d, 평균: %5.2f\n", sum, avg);
		System.out.println("=".repeat(30));
		//총점,평균 출력
	}

}
