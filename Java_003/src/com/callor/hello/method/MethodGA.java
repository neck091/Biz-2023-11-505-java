package com.callor.hello.method;

public class MethodGA {
	public static boolean isPrime(int num) {

		int i = 0;
		boolean isPrime = true;
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false ;
				break;
			}
		}
		return isPrime;

	}

	public static void main(String[] args) {
		int num =(int)(Math.random() *100) +2;

		if (isPrime(num) == true) {
			System.out.printf("%d는 소수임", num);
		} else {
			System.out.printf("%d는 소수가 아님", num);

	}

}
}
