package com.callor.hello.var;

public class VarA {
	
	public static void main(String[] args) {
		int num1=0;
		double num2 = 0.0;
		String str = "";
		
		
		//double 형 변수에 int 형 변수 값을 복사하기 
		//자동으로 작동되는 코드
		num2 =num1;
		//int 형 변수에 double 형 변수 값을 복사하기 
		//더블형 변수에 저장된 값을 잃어버릴 수 있기 때문에 자동으로 작동되지 않음
		//강제로 적용해야 하는데 변수명 앞에 형 변환 키워드를 붙인다
		num1 = (int)num2;
		
		/*
		 * 문자열 형 변수에 숫자형 정수 실수 값을 복사하기 
		 * 숫자형 값은 문자열 형 변수에 자동으로 할당하지 못함
		 * 그래서 강제로 숫자를 문자열로 변환 시켜야함
		 * 숫자 +"" 형식으로 작성하면 됨
		 */
		str=num1+"";
		str=num2+"";
		
	}

}
