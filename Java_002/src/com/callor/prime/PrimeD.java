package com.callor.prime;

public class PrimeD { 
	
	public static void main(String[] args) {
		//임의 숫자 생성
		int raNum = (int)(Math.random()*10 + 1);
		
		int i =0;	
		
		//소수인지 판별
		for(i=2; i<raNum; i++) {
			if(raNum%i ==0 ) {
				break;
			} 
		}
		//판별결과 출력
		System.out.println("=======================");
		System.out.println(raNum+ "는 Prime Number 인가?");
		System.out.println("-----------------------");
		if (i<raNum) {
			System.out.printf("%d MOD %d = %d, %d는 소수가 아님\n",raNum, i, raNum%i, raNum );
			} else {
				System.out.printf("%d는 소수임\n", raNum);
			}
		System.out.println("========================");
	}
}
