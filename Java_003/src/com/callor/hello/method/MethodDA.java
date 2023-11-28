package com.callor.hello.method;

public class MethodDA {
	
	/*
	 * 30과 40을 덧셈하여 결과를 냄ㅁㅁ
	 */
	public static int add() {
		int num1= 30;
		int num2 = 40;
		int result = num2+num1;
		return result;
	}
	
	public static void main(String[] args) {
		/*
		 * add method 가 return 값은 int type 이므로 int type 변수를 선언하고 return 값을 할당 
		 */
		
		int sum = add();
		
		System.out.println("함수 return 값 : "+sum);
	}

}
