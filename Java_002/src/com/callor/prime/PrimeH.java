package com.callor.prime;

public class PrimeH {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 100; i++) {

			int index = 0;
			for (index = 2; index < i + 1; index++) {
				if ((i + 1) % index == 0) {
					break;
				}
			}
			if (index < (i + 1)) {
			} else {
				sum += i + 1;
			}
		}
		System.out.println(sum);
	}
}