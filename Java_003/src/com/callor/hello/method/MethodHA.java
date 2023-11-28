package com.callor.hello.method;

public class MethodHA {

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		int num = 0;
		isPrime(num);
		
		System.out.println("===================");
		System.out.println("소수 판별하기");
		System.out.println("------------------");
		for (int i = 0; i < 5; i++) {
			num = (int) (Math.random() * 100) +2;
			boolean isPrime= isPrime(num);

			if (isPrime) {
				System.out.println(num +"는 소수임\n");
			} else {
				System.out.printf(num+ "소수가 아님\n");
			}

		}
	}
}
