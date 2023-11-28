package com.callor.hello.method;

public class MethodCA {
	
	/*
	 * string naiton 문자열 데이터를 필수로 리턴해야함
	 */
	
	public static String nation() {
		String nation= "대한민국";
		//return natinon;
		return "대한민국";
	}

	public static void main(String[] args) {
		
	 String nation = nation();
	 
	 	System.out.println(nation);
	 
	 	// PRITNTLN() 메서드는 화면에 값을 출력만 할 뿐
	 	//RETURN 타입이 VOID임
	 	System.out.println(nation());


}
}
