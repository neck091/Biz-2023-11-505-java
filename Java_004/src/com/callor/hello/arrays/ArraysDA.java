package com.callor.hello.arrays;

public class ArraysDA {
		
	
	
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
		
		


		for (int i = 0; i < STUDENT_LENGTH; i++) {

		int sum= scoreK[i];
		sum += scoreE[i];
		sum += scoreM[i];

		}
	}
}



