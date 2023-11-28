package com.callor.hello.method;

public class MethodI {

	public static int isPrime(int num) {
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				return 0;// 소수가 아님
			}
		}

		return num; // 소수임

	}

	public static void main(String[] args) {

		int sum = 0;
		System.out.println("===================");
		System.out.println("소수 합 구하기");
		System.out.println("-------------------");
		for (int i = 0; i < 5; i++) {
			int ran = (int) (Math.random() * 100) + 2;
			int index = isPrime(ran);
			if (index>0) {
				System.out.println(ran+" 소수임");
			}else {
				System.out.println(ran+" 소수 아님");
			}
			
			sum += index;
		}
		System.out.println("===================");
		System.out.println("소수의 합 : "+sum);
		

	}

}
