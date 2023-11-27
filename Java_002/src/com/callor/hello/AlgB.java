package com.callor.hello;

public class AlgB {
	public static void main(String[] args) {

		/*
		 * 1부터 100까지 수 중에서 3의 배수의 합과 5의 배수의 합
		 */

		int i = 0;
		int sum3 = 0;
		int sum5 = 0;

		for (i = 0; i < 100; i++) {
			// i+1 연산을 여러번 수행해야 하는데 이연산을 미리 한 번 수행화여 결과를 변수에 보관, 재활용하자
			int num = i + 1;
			if (num % 3 == 0) {
				sum3 += num;
			}

			if (num % 5 == 0) {
				sum5 += num;
			}
		}

		System.out.printf("%d + %d = %d\n", sum3, sum5, sum3 + sum5);
		System.out.printf("%d - %d = %d\n", sum3, sum5, sum3 - sum5);
		System.out.printf("%d x %d = %d\n", sum3, sum5, sum3 * sum5);
		System.out.printf("%d / %d = %d", sum3, sum5, sum3 / sum5);

	}
}
