package com.callor.hello.var;

public class VarCA {
	public static void main(String[] args) {

		// 선언하는 곳
		int scoreKor = 0;
		int scoreMath = 0;
		int scoreEng = 0;
		
		int total = 0;
		int avg = 0;
		
		// 데이터를 변수에 할당하는 곳
		scoreKor = 90;
		scoreMath = 80;
		scoreEng = 70;
		
		// 계산하는 부분
		total = scoreKor +scoreMath + scoreEng ;
		avg =  total / 3;
		
		
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
