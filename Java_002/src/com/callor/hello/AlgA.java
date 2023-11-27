package com.callor.hello;

public class AlgA {
	public static void main(String[] args) {
		/*
		 * 1~100Rkwl 숫자 중의 3의 배수의 합
		 */
		
		
		int i = 0;
		int sum= 0;
		
		for(i=0; i<100; i++) {
			if((i+1)%3==0) {
				//num의 값이3배수인 경우만 실행되는 코드
				sum+=i+1;
			}
			
		}
		System.out.println("3의 배수의 합 : "+sum);
		
			
	
	}

}
