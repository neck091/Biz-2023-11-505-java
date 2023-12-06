package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;

public class ScannerBB {
	
	public static void main(String[] args) {
		NumberService keyService = new NumberService();
		
	
		int num1 = keyService.inputNum("첫 번째 정수를");
		int num2 = keyService.inputNum("두 번째 정수를");
		
		
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
	}

}
