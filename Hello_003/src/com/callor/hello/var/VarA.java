package com.callor.hello.var;

public class VarA {
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 40;
		
		System.out.print(num1);
		System.out.println("+");
		System.out.print(num2);
		System.out.println("=");
		System.out.println(num1 + num2);
		
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		
		
		//자바에서 사용하는 소수점이 부착된 숫자는 기본형 double형이다
		// double형으로 된 값을 플로트 형 변수에 보관하려고하면 오류.
		//명시적으로 이 숫자는 플로트 형이다 라고 알려줘야한다 .
		//숫자 뒤에 f문자열 부착
		//
		//
		float num3 = 30.2f;
		float num4 = 40.3f;
		
		System.out.println(num3 + num4);
		System.out.println(num3 - num4);
		System.out.println(num3 * num4);
		System.out.println(num3 / num4);
		
	}

}
