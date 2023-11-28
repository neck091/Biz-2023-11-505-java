package com.callor.hello.method;

public class MethodH {

	public static boolean isPrime(int num) {
		int i = 0;
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				break;
			}
		}
		if (i < num) {
			return false;
		} else {
			return true;
		}
	
	
	
	}
	

	public static void main(String[] args) {
		int num = 0;
		isPrime(num);
		for (int i = 0; i < 5; i++) {
			num = (int) (Math.random() * 100) + 1;
			
			if (isPrime(num)) {
				System.out.printf("%d는 소수임\n", num);
			} else {
				System.out.printf("%d는 소수가 아님\n", num );
		}

		}
	}
}
