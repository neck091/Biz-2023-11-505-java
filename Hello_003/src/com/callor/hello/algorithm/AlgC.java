package com.callor.hello.algorithm;

public class AlgC {
	public static void main(String[] args) {
		int num1 =33333;
		boolean bYes = false;
		
		/*
		 * num1 %2 의 연산결과는 0또는 1의 값인 정수형이다 
		 * 이 결과값을 변수에 할당하려면 변수는 int 형이어야 한다
		 * 하지만 num1 % 2 == 0 은 (num1 %2)==0 과 같다
		 * 이 결과값을 변수에 할당하려면 변수는 boolean 형 이어야한다
		 * 이 때 bYes에 할당된 값은 num1의 값이 짝수이면 true
		 * num1 의 값이 홀수이면 false 가 될 것이다. 
		 */
		bYes = num1 % 2 == 0;
		
		if(bYes) {
			System.out.println("짝수"); //조건 , 선택 명령문
		
		
	}
		
		if(num1 % 2 == 0);{
			System.out.println("짝수");
		}
		

}
	}
