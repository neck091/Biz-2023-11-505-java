package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

public class ScnnerDA {
	
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
	
	keyService.printAlgebra(num1, num2);
	

	}
}
