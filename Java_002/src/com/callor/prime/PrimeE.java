package com.callor.prime;

public class PrimeE {
	public static void main(String[] args) {


		int i = 0;
		int s = 0;
		//boolean noP = false; 

		System.out.println("================================");
		System.out.println("소수 판별하기");
		System.out.println("--------------------------------");
		
		for (i = 0; i < 5; i++) {

			int num = (int) (Math.random() * 100 + 1);

			for (s = 2; s < num; s++) {
				if ((num % s) == 0) {
					break;
				}
			}

			if (s<num) {
				System.out.printf("%d MOD %d = %d, %d는 소수가 아님\n", num, s, num % s, num);
			} else {
				System.out.printf("%d는 소수임\n", num);
			}

		}

	}
}
