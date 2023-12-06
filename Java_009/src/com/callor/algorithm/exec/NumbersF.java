package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

public class NumbersF {

	public static void main(String[] args) {

		NumberService numService = new NumberService();
		
		int num= numService.inputNum("정수를");
		
		Line.sLine(50);
		
		for (int dan = 2; dan < 10; dan++) {

			for (int i = 1; i < 10; i++)
				if ((dan * i) % num == 0) {
					System.out.printf("%d x %d = %d\n", dan, i, dan * i);
				}
		}
	
	}

}
