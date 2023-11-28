package com.callor.hello.method;

public class MethodJA {

	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100) + 1;
			boolean is = isEven(num);

			if (is) {
				System.out.println(num + " 짜아아악수");
			} else {
				System.out.println(num + " 짜악수가 아님");
			}
		}
	}
}
