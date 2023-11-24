package com.callor.hello.pay;

public class PayB {
	public static void main(String[] args) {
		int pay= 3587960;
		int num= 0;
		
		num=pay%100;
		
		System.out.println("10원권 : " +(num-50)/10);
		System.out.println("50원권 : " +(num-50));
				
		num= pay%1000;
		System.out.println("100원권 : " +(num-500)/100);
		System.out.println("500원권 : " +(num-500));
				
		System.out.println("1000원권 : " +(num-5000)/1000);
		System.out.println("5000원권 : " +(num-5000));
		
		System.out.println("1000원권 : " +(num-1000)/500);
		System.out.println("5000원권 : " +(num-500));
		
		

				
	}

}
