package com.callor.hello.var;

public class VarCC {
	public static void main(String[] args) {

		// 선언하는 곳
		int scoreKor = 0;
		int scoreMath = 0;
		int scoreEng = 0;
		
		int total = 0;
		int avg = 0;

		
		
		// 출력하는 부분
		System.out.println("====================");
		System.out.println("성적표");
		System.out.println("====================");
		scoreKor = 80;
		System.out.println("국어 : " + scoreKor);
		scoreEng = 70;
		System.out.println("영어 : " + scoreEng);
		scoreMath =98;
		System.out.println("수학 : " + scoreMath);
		System.out.println("--------------------");
		total = scoreEng + scoreKor + scoreMath;
		System.out.println("총점 : " + total);
		avg = total /3 ;
		System.out.println("평균 : " + avg);
		System.out.println("====================");
		
		
	}

}
