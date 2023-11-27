package com.callor.prime;

public class PrimeC {
	public static void main(String[] args) {

		int index = 0;
		int num = 9;
		boolean noPrime = false;
		System.out.println("=======================");
		System.out.println(num + "는 Prime Number 인가?");
		System.out.println("-----------------------");
		for (index = 2; index < num; index++) {
			//소수가 아님
			if ((num % index) == 0) {
				noPrime = true;
				break;// 조건에 맞는 값을 구하면 계산 중단 명령어
			}

		}
		if(noPrime) {
			System.out.printf("%d MOD %d = %d, ", num, index, num%index);
			System.out.println(num +"는 소수가 아님");}
		else {
			System.out.println(num +"는 소수임");
		}
		System.out.println("=======================");

}
}
