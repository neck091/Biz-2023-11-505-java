package com.callor.var;

import com.callor.hello.service.NumberService;

public class VarA {
	
	public static void main(String[] args) {
		// numberService의 add라는 메서드에게 두개의 정수를 전달하고 결과를 리턴받아서 콘솔에 출력하고 싶ㄷ가
		
		//numbrtservice 클래스에 있는 add 메서드를 사용하려고 하는데
		//add메서드는 static이 없음.
		//그래서 이 메서드는 NumberService.add() 처럼 사용 불가.
		//int result = NumberService.add(30,40);
		
		//NumberService 의 add.method를 사용하려면 준비를 해야함
		
		/*
		 * Numbersrvice 클래스(설계도)를 가지고
		 * numberService 객체(Object, 집)을
		 * 새로(new) 만들어줘(Numberservice())
		 */
		
		NumberService numberService1 = new NumberService();
		NumberService numberService2 = new NumberService();
		
		int result = numberService1.add(30,40);
		
		String nation = "대한민국";
		
		String nation2 = new String("대한민국");
		
		String nation3 = new String();
		
		System.out.println(result);
		
		System.out.println(nation);
		System.out.println(nation2);
		
	}
}
