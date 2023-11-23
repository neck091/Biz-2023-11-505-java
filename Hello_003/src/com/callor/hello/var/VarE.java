package com.callor.hello.var;

public class VarE {
	public static void main(String[] args) {
		String nation ="대한민국";
		int num = 30;
		
		// num (정수형변수)에 저장된 값을 복사하여
		// Nation 문자열형 변수에 저장(할당) 해닿라고 요청
		// 오류가 난다. num 변수에 저장된 값을
		// 먼저 문자열로 바꾸고 그리고 NATION에 저장하면 된다
		// 숫자 + 문자열 연산 결과는 숫자가 문자열로 변환된다.
		// 이때 숫자 + "" : 빈칸이 추가
		// 이럴때 사용하는 값이 ""이다 문자열이지만 문자열이 아니다.
		nation = num + ""; 
		
		
	}

}
