package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

public class ScnnerD {
	
	public static void main(String[] args) {
		
	NumberService keyService = new NumberService();
	
	Line.dLine(50);
	int num1 = keyService.inputNum("첫 번째 정수를");
	int num2 = keyService.inputNum("두 번째 정수를");
	
	
	if(num1<num2) {
		int _temp =num1;
		num1= num2;
		num2=_temp;
	}
	
	Line.sLine(50);
	System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
	System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
	System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
	System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
	System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2);
	Line.dLine(50);
	
	

	}
}
