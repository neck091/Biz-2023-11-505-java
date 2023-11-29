package com.callor.hello.arrays;

public class ArraysG {

	public static void main(String[] args) {

		int STU = 10;
		int[] scoreKors = new int[STU];

		for (int i = 0; i < scoreKors.length; i++) {
			int ran = (int) (Math.random() * 50) + 51;
			scoreKors[i] = ran;
		}

		System.out.println("=".repeat(30));
		System.out.println("국어\t평점");
		System.out.println("-".repeat(30));

		String G = "F";

		for (int i = 0; i < scoreKors.length; i++) {
			System.out.printf("%d\t", scoreKors[i]);
			if (scoreKors[i] >= 60) G="D";
			else if (scoreKors[i] >= 65) G="D+";
			else if (scoreKors[i] >= 70) G="C+";
			else if (scoreKors[i] >= 75) G="C+";
			else if (scoreKors[i] >= 80) G="B";
			else if (scoreKors[i] >= 85) G="B+";
			else if (scoreKors[i] >= 90) G="A";
			else if (scoreKors[i] >= 95) G="A+";
			System.out.println(G);
			
			
			
			
				}
		
	}
}
