package com.callor.student.exec;

public class StringEmpty {
	public static void main(String[] args) {
		String str1 = null;
		String str2 = "";
		String str3 = " ";
		
		if( str1==null ) {
			System.out.println(str1);}
		else {
		//String type 의 변수가 null 일때는 어떠한 변수도 쓸 수 없음
			str1.substring(0,0);
			
		}
		
		System.out.println(str2.isEmpty());
		System.out.println(str2.isBlank());
		
		/*
		 * 문자열 isEmpty 는 "" 일 경우 트루이고 따옴표 사이에 빈칸 등 어더한 문자열이 있어도 값이 있다고 봐서 거짓이 된다
		 * 
		 *  문자열. isBlank 는 "" " " 은 true, "가", "a" 등은 모두 거짓
		 */
		
		
		System.out.println(str3.isEmpty());
		System.out.println(str3.isBlank());
		
		
		
	}
		
	}
