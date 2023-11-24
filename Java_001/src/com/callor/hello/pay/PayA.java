package com.callor.hello.pay;

public class PayA {
	
	public static void main(String[] args) {
		
		/*
		 * 다음 pay 변수에 저장된 정수는 어떤 사람의 급여이다. 
		 * 급여를 현금을 지급하려고 한다.
		 * 현금으로 급여를 지급할때는 최소한의 화폐 매수를 계산하여 지급하는 것이 유리.
		 * 
		 * 대한민국 화폐는 5만원~10원까지 있다. (1원은 제외)
		 * pay 변수에 저장된 값을 최소 화폐단위를 적용한 급여 내역으로 출력하기.
		 */
		
		int pay= 3587960;
		
		System.out.println("5만원권"+pay/50000+ "매");
		System.out.println("5만원권"+pay%50000/10000 + "매");
		System.out.println("5만원권"+pay%50000%10000/5000+ "매");
		
		
		
	}

}
