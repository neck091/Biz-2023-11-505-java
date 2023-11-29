package com.callor.hello.arrays;

public class ArraysGA {

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
			
			
			/*
			 *if(조건1){실행1}else{실행2}
			 *만약 조건이 참이면 실행 1이 수행, 그렇지 않으면 실행2가 수행
			 *
			 *if(조건1){실행1}
			 *else if(조건2){실행2}
			 *else {실행3}
			 *
			 *먼저 조건1이 참인지 검사, 참이면 실행 1 수행
			 *그렇지 않으면 조건2 가 참인지 다시 검사, 참이면 실행 2 수행
			 *두 조건이 모두 참이 아니면 실행 3
			 *
			 */
			
			if (scoreKors[i] >= 95) G="A+";
			else if (scoreKors[i] >= 90) G="A";
			else if (scoreKors[i] >= 85) G="B+";
			else if (scoreKors[i] >= 80) G="B";
			else if (scoreKors[i] >= 75) G="C+";
			else if (scoreKors[i] >= 70) G="C+";
			else if (scoreKors[i] >= 65) G="D+";
			else if (scoreKors[i] >= 60) G="D";
			System.out.println(G);
		
			
			
			
			
				}
		
	}
}
