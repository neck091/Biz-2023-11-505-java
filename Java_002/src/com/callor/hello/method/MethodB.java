package com.callor.hello.method;

public class MethodB {
	
	public static void main(String[] args) {
		double num1 =0;
		
		for(int i =0; i<10; i++) {
			
			num1 = Math.random();
			num1= num1*100;
			
			int num2 = (int)num1; //틀렷어,,,,,,,,,,,
			
			System.out.println(num2);
		}
		
	}

}
