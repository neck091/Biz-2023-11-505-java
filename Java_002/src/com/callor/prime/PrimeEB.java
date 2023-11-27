package com.callor.prime;

public class PrimeEB {
	public static void main(String[] args) {
		
		System.out.println("소수 판별하기");

		for (int i = 0; i < 5; i++) {

			int num = (int) (Math.random() * 100) + 2;
			int index = 0;

			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					break;

				}

			}
			if (index < num) {
				System.out.printf("%3d MOD %3d = %3d, %3d는 소수가 아님\n", num, index, num % index, num);
			} else {
				System.out.printf("3%d는 소수임\n", num);
			}
		}
	} // 포

} //메인
