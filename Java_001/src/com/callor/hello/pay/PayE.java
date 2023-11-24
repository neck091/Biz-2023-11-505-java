package com.callor.hello.pay;

public class PayE {
	public static void main(String[] args) {
		
	int pay= 3587960;
		
		System.out.println("=================");
		System.out.println("5만원권 :"+pay/50000);
		pay=pay%50000;
		
		System.out.println("만원권 :"+pay/10000);
		pay=pay%10000;
		
		System.out.println("5천원권 :"+pay/5000);
		pay=pay%5000;
		
		System.out.println("천원권 :"+pay/1000);
		pay=pay%1000;
		
		
		
	}

}
