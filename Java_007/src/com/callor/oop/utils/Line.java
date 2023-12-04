package com.callor.oop.utils;

public class Line {
	
	public static void dLine(int length) {
		System.out.println("=".repeat(length));
	}
	
	public static void sLine(int length) {
		System.out.println("-".repeat(length));
	}
	
	public static void title(String title) {
	
		//title 문자열 변수에 할당된 문자열 데이터의 개수
		int length = title.length();
		dLine(length*10);
		System.out.println(title);
		dLine(length*10);
	}
	
	public static void title(int length, String title) {
		dLine(length);
		System.out.println(title);
		dLine(length);
	}

}
