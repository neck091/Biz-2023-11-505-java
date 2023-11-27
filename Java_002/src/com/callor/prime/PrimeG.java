package com.callor.prime;

public class PrimeG {

	public static void main(String[] args) {

		for (int i = 2; i < 100; i++) {

			int index = 0;
			for (index = 2; index < i + 1; index++) {
				if ((i + 1) % index == 0) {
					break;
				}
			}
			if (index >= i +1) {
				System.out.println(i+1 + "는 소수");

			}
		}
	}
}