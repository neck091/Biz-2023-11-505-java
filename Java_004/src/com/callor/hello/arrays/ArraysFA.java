package com.callor.hello.arrays;
//이거 깃허브에서 선생님 거 갖고와라 민선아
public class ArraysFA {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int SUBJECT_COUNT = 3;

		int[] scoreK = new int[STUDENT_LENGTH]; // 국
		int[] scoreE = new int[STUDENT_LENGTH]; // 영
		int[] scoreM = new int[STUDENT_LENGTH]; // 수

		int[] tsum = new int[SUBJECT_COUNT];
		float[] tavg = new float[SUBJECT_COUNT];

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

		System.out.println("=".repeat(50));
		System.out.println("학번	국어	영어     수학      총점     평균");
		System.out.println("-".repeat(50));

		for (int i = 0; i < STUDENT_LENGTH; i++) {
			int sum = scoreK[i] + scoreE[i] + scoreM[i];
			float avg = (float) sum / 3;

			System.out.printf("%3d\t", i + 1);
			System.out.printf("%3d\t", scoreK[i]);
			System.out.printf("%3d\t", scoreE[i]);
			System.out.printf("%3d\t", scoreM[i]);
			System.out.printf("%3d\t", sum);
			System.out.printf("%.2f\n", avg);

		}

		int sumK = 0;
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			sumK += scoreK[i];

		}
		int sumE = 0;
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			sumE += scoreE[i];

		}

		int sumM = 0;
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			sumM += scoreM[i];

		}

		System.out.println("=".repeat(50));
		System.out.printf("총점");
		System.out.printf("\t%3d", sumK);
		System.out.printf("\t%3d", sumE);
		System.out.printf("\t%3d", sumM);
		System.out.printf("\t%4d\n", (sumM + sumE + sumK));

		System.out.printf("평균");
		System.out.printf("\t%3d", sumK / STUDENT_LENGTH);
		System.out.printf("\t%3d", sumE / STUDENT_LENGTH);
		System.out.printf("\t%3d", sumM / STUDENT_LENGTH);

		int totalOfTotalsum = 0;
		// 총점의 총점 계산
		for (int i = 0; i < SUBJECT_COUNT; i++) {

		}
		// 평균 계산
		for (int i = 0; i < SUBJECT_COUNT; i++) {
		
		}


	}
}
