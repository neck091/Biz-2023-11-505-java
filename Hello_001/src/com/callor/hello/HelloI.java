package com.callor.hello;

public class HelloI {
	public static void main(String[] args) {

		// 연산자와 큰 따옴표 또는 연산자와 영문자는 빈칸 구분이 없어도 문법오류가 나지
		// 않는다 다만 코드 가독성 문제로 적절한 빈간을 사용하는 것이 좋음
		System.out.println("hello korea");
		System.out.println("hello    korea");
		System.out.println("hello" + "korea");
		System.out.println("hello" + " korea");
		System.out.println("hello" + " korea");
	}

} 