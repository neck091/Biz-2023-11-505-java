package com.callor.student.exec;

public class ArraysA {
	public static void main(String[] args) {
		String[] nation1 = new String[3];

		nation1[0] = "대한민국";
		nation1[1] = "우리나라";
		nation1[2] = "코리아";

		//배열의 요소에 저장될 값이 정ㅇ해져있을때
		//배열 요소를 지정하여 배열 생성하기
		String[] nation2 = { "대한민국", "우리나라", "korea" };
		int[] age = { 10, 20, 30, 40, 50, 60, 70 };

		System.out.println(age.length);
		String[] nation3 = new String[] { "a", "b", "c" };
	}

}
