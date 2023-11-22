package com.callor.hello.var;

public class VarCB {
	public static void main(String[] args) {

		// 선언하는 곳
	
		int scoreKor = 90;
		int scoreMath = 80;
		int scoreEng = 70;
	
		int total = scoreKor +scoreMath + scoreEng ;
		int avg =  total / 3;
		
		
		// 출력하는 부분
		System.out.println("====================");
		System.out.println("성적표");
		System.out.println("====================");
		System.out.println("국어 : " + scoreKor);
		System.out.println("영어 : " + scoreEng);
		System.out.println("수학 : " + scoreMath);
		System.out.println("--------------------");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("====================");
		
		
	}

}
