package com.callor.prime;

public class PrimeA {
	public static void main(String[] args) {
		//어떤 수가 소수인가를 판별하기 위하여 선언한 변수
		int num = 9;
		int i = 0;
		System.out.println("=======================");
		System.out.println(num+"는 Prime Number 인가?");
		System.out.println("-----------------------");
		for (i = 2; i < num ; i++) {
			System.out.printf("%d MOD %d = %d\n", num, i, num % i);

		}
		System.out.println("=======================");
	}

}
