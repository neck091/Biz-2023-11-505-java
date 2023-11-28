package com.callor.hello.method;

public class MethodC {

	public static String nation() {
		String con= "대한민국";
		//return ""; 옘~~병 이게 안된단다
		return "대한민국";
	}

	public static void main(String[] args) {

		String nation = nation();
		System.out.println(nation);

		System.out.println(nation());

	}

}
