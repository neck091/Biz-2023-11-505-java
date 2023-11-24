package com.callor.hello.algorithm;

public class AlgF {
	public static void main(String[] args) {
		
		/*
		 * 우리나라 화폐는 5만, 1만, 5천, 1천, 5백, 1백, 50, 10 단위이다
		 * 아래 pay 에 저장된 값에서 
		 * 각각 화폐단위만큼 몇개 식이 포함되는지 출력하시오
		 * 
		 */
		
		int pay = 3587964;
	
		
		System.out.println("5만원 "+ pay / 50000 + "매");
		System.out.println("1만원 "+pay % 50000 / 10000+ "매" );
		System.out.println("5천원 "+pay % 50000 % 10000 / 5000 + "매");
		System.out.println("1천원 "+pay % 50000 % 10000 % 5000 / 1000 + "매");
		System.out.println("5백원 "+pay % 50000 % 10000 % 5000 % 1000 / 500+ "매" );
		System.out.println("1백원 "+pay % 50000 % 10000 % 5000 % 1000 % 500  / 100+ "매" );
		System.out.println("5십원 "+pay % 50000 % 10000 % 5000 % 1000 % 500 % 100 / 50+ "매" );
		System.out.println("1십원 "+pay % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50 / 10 + "매");

		//======================================================================================================
		
		//KTX를 표현해보았습니다
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}
