package com.callor.hello.arrays;

public class ArraysA {
	
	public static void main(String[] args) {
		
		int i= 1;
		
		int num1 = (int)(Math.random()*50)+1;
		int num2= (int)(Math.random()*50)+1;
		int num3= (int)(Math.random()*50)+1;
		int num4= (int)(Math.random()*50)+1;
		int num5= (int)(Math.random()*50)+1;
		
		System.out.println("================");
		System.out.printf("%d 번째 값 : %d \n", i++, num1);		
		System.out.printf("%d 번째 값 : %d \n", i++, num2);		
		System.out.printf("%d 번째 값 : %d \n", i++, num3);		
		System.out.printf("%d 번째 값 : %d \n", i++, num4);		
		System.out.printf("%d 번째 값 : %d \n", i++, num5);		
		System.out.println("합산결과 : "+ (num1+num2+num3+num4+num5));
		}

}


