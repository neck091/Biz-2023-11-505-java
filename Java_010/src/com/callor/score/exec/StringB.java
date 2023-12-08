package com.callor.score.exec;

import com.callor.score.service.ScoreService;
import com.callor.score.utils.AnsiConsol;

public class StringB {
	public static void main(String[] args) {
		String str =AnsiConsol.GREEN("대한");
		String str2 =AnsiConsol.BLUE("민국");
		String str3 =AnsiConsol.CYAN("만세");
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);

		
	}
}
