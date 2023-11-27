package com.callor.prime;

public class PrimeB {
	public static void main(String[] args) {

		int index = 0;
		int num = 15;
//비이성적
		System.out.println("=======================");
		System.out.println(num + "는 Prime Number 인가?");
		System.out.println("-----------------------");
		for (index = 2; index < num; index++) {
			if ((num % index) == 0) {
				System.out.printf("%d MOD %d = %d, %d는 소수가 아님\n", num, index, num % index, num);
				break;//조건에 맞는 값을 구하면 계산 중단 명령어
			}
		}

		System.out.println("=======================");

	}

}


