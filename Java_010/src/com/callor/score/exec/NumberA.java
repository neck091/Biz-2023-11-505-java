package com.callor.score.exec;

import com.callor.score.service.NumberService;

public class NumberA {
	public static void main(String[] args) {
	NumberService nService = new NumberService();
		
		int num=nService.inputNumber("점수를");
		System.out.println(num);
		
		num = nService.inputNumber("정수를", 50, 100);
				System.out.println(num);

	}

}
