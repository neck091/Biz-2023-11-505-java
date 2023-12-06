package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

public class NumbersG {

	public static void main(String[] args) {

		NumberService numService = new NumberService();

		int score = numService.inputNum("점수를");
		String num = ""; 
		
		if(score >= 95) num="A+";
		else if(score >= 90) num="A";
		else if(score >= 85) num="B+";
		else if(score >= 80) num="B";
		else if(score >= 75) num="C+";
		else if(score >= 70) num="C";
		else if(score >= 65) num="D+";
		else if(score >= 60) num="D";
		else num="F" ;
		
		
		System.out.println(num+" 입니다");
		if(score >79) System.out.println("축하한다");
		else if(score >69) System.out.println("더 분발하세요");
		else if(score <60) System.out.println("낙제입니다");
	
		//WWWWWWWWWWWWWWWWWWWWWW잔디밭WWWWWWWWWWWWWWWWWWWWWWWWWW
		//WWWWWWWWWWWWWWWWWWWWWWWWW 아무리봐도화이트가더조음 WWWWWWWWWWWWWWWWWWWWWWWWWW
	}

}
