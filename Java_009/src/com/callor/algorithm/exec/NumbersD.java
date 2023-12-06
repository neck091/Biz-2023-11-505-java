package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

public class NumbersD {
	public static void main(String[] args) {

		int sum = 0;
		int i = 0;
		Line.dLine(50);
		while (sum < 1000) {
			NumberService numService = new NumberService();
			int num = numService.inputNum("숫자를");
			sum += num;
			i++;
		}
		Line.sLine(50);
		System.out.println(i+" 번 입력한 숫자 총 합 = "+sum);
		Line.dLine(50);
	}
}