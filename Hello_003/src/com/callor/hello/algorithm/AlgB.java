package com.callor.hello.algorithm;

public class AlgB {
	public static void main(String[] args) {
		
		int num1 =30;
		int num2 = 40;
		
		boolean bYes = false;
		
		
		bYes = num1 == num2; //false
		bYes = num1 >= num2; //false
		bYes = num1 <= num2; //true
		bYes = num1 != num2; //true
		
		bYes = num1 > num2; //false
		bYes = num1 < num2; //true
//=============================================
		
		num1 =30;
		num2 =30;
		
		bYes = num1 == num2; // true
		bYes = num1 >= num2; // true
		bYes = num1 <= num2; // true
		bYes = num1 != num2; // false
		
		bYes = num1 > num2; // false
		bYes = num1 < num2; // false
		
				
	}

}
