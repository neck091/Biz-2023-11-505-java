package com.callor.hello.arrays;

public class ArraysGB {

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

		for (int i = 0; i < scoreKors.length; i++) {
			System.out.printf("%d\t", scoreKors[i]);
			String G = "F";

			if (scoreKors[i] >= 95 && scoreKors[i]<=100)
				G = "A+";
			
			 if (scoreKors[i] >= 90&& scoreKors[i]<95)
				G = "A";
			 if (scoreKors[i] >= 85&& scoreKors[i]<90)
				G = "B+";
			 if (scoreKors[i] >= 80&& scoreKors[i]<85)
				G = "B";
			 if (scoreKors[i] >= 75&& scoreKors[i]<80)
				G = "C+";
			 if (scoreKors[i] >= 70&& scoreKors[i]<75)
				G = "C+";
			 if (scoreKors[i] >= 65&& scoreKors[i]<70)
				G = "D+";
			 if (scoreKors[i] >= 60 && scoreKors[i]<65)
				G = "D";
			System.out.println(G);

		}

	}
}
