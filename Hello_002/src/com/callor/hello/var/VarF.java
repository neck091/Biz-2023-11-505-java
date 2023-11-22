package com.callor.hello.var;

public class VarF { 
	public static void main(String[] args) {
		
		float scoreKor = 0;
		float scoreMath = 0;
		float scoreEng = 0;
		
		float total = 0;
		float avg = 0;
		
		scoreKor = 80.2f;
		scoreMath = 80.3f;
		scoreEng = 70.3f;
		
		total = scoreKor ;
		total = total + scoreEng ;
		total = total +scoreMath ;
	
		avg =  total / 3;
		
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
