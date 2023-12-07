package com.callor.score.exec;

public class NumberB {
	
	/*
	 * 자바는 완벽한 객체지향 언어이다
	 * 자바에서는 같은 클래스 내에서 method(함수)의 이름을
	 * 중복하여 정의(선언)할 수 있다.
	 * 
	 * 단, method 의 매개변수(arguments)의
	 * 		1. 개수가 다르거나
	 * 		2. type 이 달라야 한다
	 * 
	 *  method 를 호출하는 곳에서 method 에 정의된 매개변수의 type, 
	 *  개수와 일치하는 데이터를 전달하면 자동으로 method 와 호출하는 코드가 연결된다
	 *  
	 *  이것을 객체지향에서 "다형성"이라고 한다
	 */
	public static void add() {
	
	}
	
	public static void add(int num1, int num2) {
		System.out.println("두 정수의 합 :"+(num1+num2));
		
	}
	
	public static void add(float num1, float num2) {
		System.out.println("두 실수의 합 :"+(num1+num2));
		
	}
	
	public static void add(String str, int num) {
		
	}
	/*
	 * 아래의 코드는 코드의 실체가 없다({}안에 코드가 없다)
	 * 코드는 아직 만들지 않았지만, method 는 선언(정의) 된 상태 
	 * 이러한 method 를 method 원형 (기본형, prototype) 이라고 한다.
	 */
	public static void add(int num, String str) {
		
	}
	
	//method 원형이 갖춰진 상태
	//return type 이 class type 일때는 null; 을 return 함
	
	public static String add(String str1, String str2) {
		return null;
		
	}
	
	//return type 이 클래스가 아닌 경우는 
	//null 을 return 할 수 없음. 이때는 적절한 값을 return 해준다.
	//숫자형일 때는 보통 0을 return.
	public static int add(int num) {
		return 0;
		
	}
	
	//불린인경우 트루 펄스 중에 리턴을 해야하고 보통은 거짓을 리턴/
	public static boolean add(boolean byes) {
		return false;
	}		
	
	
	/*
	 * main method 에서 객체를 통해서 호출하는 method 는 static 이 부착되지 않아야한다.
	 * main method 에서 직접 호출하는 method 는 
	 * 반드시 static 이 부착되어 있어야 한다.
	 * 
	 * class 를 통해서 호출하는 method 는 
	 *   static 이 부착되어 있어야 한다. 
	 *   예) Line.dline(5);
	 */
	
	public static void main(String[] args) {
		
		add(30,40);
		add(30.0f,40.0f);
		add();
		
		/*
		 * add(double num1, double num2)
		 * add(String str1, String str2)
		 * 와 같은 코드로 정의된 method 가 없어서 
		 * 아래의 코드는 오류가 발생한다
		 */
		
		//add(30.0, 40.0);
		//add("대한민국","우리나라");
	}

}
