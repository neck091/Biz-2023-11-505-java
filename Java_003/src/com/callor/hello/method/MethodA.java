package com.callor.hello.method;

public class MethodA {

	/*
	 * 코드의 분리 
	 * main method 에서 코드를 작성하다 보니, 코드가 많아진다
	 * 또는 같은 코드를 여러곳에서 사용한다. 
	 * 이럴때는 코드를 다른  method 를 선언하여 분리한다
	 * 이러한 코드 분리를 "모듈(module)화" 
	 */
	
	
	/*
	 * add 라는 이름으로 method 를 선언하기(미리 준비해두기)
	 * 이 코드를 부르는 이름은 add() method(메서드, 메소드)
	 * 이 add() method 는 누군가가 호출 해주어야만 코드가 실행.
	 * 주로 main method 에서 호출한다
	 */
	

	/*
	 * void add() : return type 이 void 인 add method
	 */
	
	public static void add() {
		int num1 = 30;
		int num2 = 40;
		System.out.println(num1 + num2);
		
		return;
	}

	public static void main(String[] args) {
		/*
		 * 어딘가에 선언된 method 호출하기
		 * add method 에 작성된 코드를 실행하달란 의미
		 * int result = add();
		 * add() method 는  void return type 이다
		 * add method 가  return 한 결과는 변수에 할당할 수 없음
		 */
		
		add();
		
	}

}
