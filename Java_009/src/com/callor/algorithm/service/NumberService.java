package com.callor.algorithm.service;

import java.util.Scanner;

import com.callor.algorithm.util.Line;

public class NumberService {
	
/*
 * 현재 클래스의 여러 method 에서 scanner 를 사용하며
 * 키보드 입력을 받아야한다. 
 * Scanner scan = null 코드에 의해서 scanner 를 선언을 했다
 * 하지만 아직 사용할 준비가 되지 않아 scan.nextLine 등의 코드를 실행하면 Nullpointerexception 이 발생한다
 * exception 발생을 방지하기 위해 scan.nextline 코드를 실행하기 전에 
 * 스캔 초기화 코드 "scan = new Scanner (system.in)" 을 실행하여
 * scan 을 사용할 준비를 해줘야함.
 * 
 * 하지만 각각의 method 에서  scan 초기화코드를 사용하면 코드의 중복이 발생하고 
 * 여러번 키보드를 연결,단절하는 현상이 발생한다
 * 
 * 이럴때는 현재 클래스(KeyInputService) 생성자 method 에서 scan 초기화 코드를 작성해야 한다.
 */
	
	
	private Scanner scan = null;
	
	public NumberService() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
	}
	
	
	public int inputNum(String title) {
		
		
		System.out.printf(title +" 입력해 주세요 >> ");
		
		String str= scan.nextLine();
		int num =0;
		
		try {
			num = Integer.valueOf(str);
		} catch (Exception e) {
			System.err.println("** 정수를 정확히 입력해주세요 **");
			// TODO: handle exception
		}
		return num;
	}
	
	public void printAlgebra(int num1, int num2) {
		Line.sLine(50);
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d ÷ %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2);
		Line.dLine(50);
		
	}

}
