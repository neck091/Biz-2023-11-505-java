package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

public class NumbersDA {
	public static void main(String[] args) {

		NumberService numService = new NumberService();
		int sum = 0;
		int count = 0;
		Line.dLine(50);
		while (sum < 1000) {
			int num = numService.inputNum("숫자를");
			sum += num;
			count++;
			
			if(sum>=1000) break;
		}
		Line.sLine(50);
		System.out.println(count +" 번 입력한 숫자 총 합 = "+sum);
		Line.dLine(50);
	}
}