package com.callor.oop.input;

public class InputA {
	
	public static void main(String[] args) {
		
		// String nation1 = "";
		String nation1 = new String();
		
		// String nation2 = "대한민국";
		
		/*
		 * String class 에 정의된(선언된) substring() 이라는 method 를 사용하기 위하여
		 * String class 사용하여 nation2 라는 객체(object)를 생성하고 nation2 객체를 통하여(.)
 		 * substring(0 method 를 호출하였다.
		 */
		String nation2 = new String("대한민국");
		
		String result = nation2.substring(1,4);
		
	
		
		System.out.println(result);
		
		String subStr = "우리나라만세 대한민국" .substring(3,4);
		
		int num1 = 30; 
		Integer num2 =30;
		
		long num3= 0;
		Long num4 =0L;
		
		float num5 =0;
		Float num6 =0F;
		
		double num7 =0;
		Double num8=0D;
		
		
		String strNum2 = num2.toString();

	}

}
