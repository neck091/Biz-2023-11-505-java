package com.callor.hello.method;

public class MethodJ {

	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100) + 1;
			isEven(num);

			if (isEven(num)) {
				System.out.println(num + " 짜아아악수");
			} else {
				System.out.println(num + " 홀");
			}
		}
	}

}
