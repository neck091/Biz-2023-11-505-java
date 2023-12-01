package com.callor.oop.input;

import java.util.Scanner;

import com.callor.oop.utils.Line;

public class InputGA {
	
	
	public static boolean isPrime(int num) {
		for(int i=2 ; i<num; i++) {
			if(num%i ==0) {
				return true;
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 0 ;
		
		//멈추고 싶을 때까지 반복화기
		while(true) {
			
			Line.dLine(50);
			System.out.println("소수 찾기 프로젝트");
			Line.dLine(50);
			System.out.println("2보다 큰 정수값을 입력해 주세요");
			System.out.print("정수 >> ");
			
			//키보드에서 입력되길 기다리다가 입력이 완료되면(enter) 입력된 문자열을 str 변수에 할당한다
			String str = scan.nextLine();		
			
			
			
			if (str.equals("QUIT")) {
				break;
				
			}
			
			//입력한 문자열을 먼저 정수로 변환하기
			try {
				num = Integer.valueOf(str);
				
			} catch (Exception e) {
				
				System.out.println("정수로 정확히 입력해주세요");
				System.out.printf("입력한 값 : (%s)\n",str);
				// 다시 와일 처음으로 점프
				continue;
			}
			//정수로 정확히 입력했구나
			// 값의 ㅇ효성 검사 2이상의 정수가 정확히 입력되었나
			if (num<2) {
				System.out.println("2이상의 정수를 입력해야 합니다.");
				System.out.printf("입력한 값 : %d\n",num);
				continue;
			}
			
			if (isPrime(num)) {
				System.out.println(num+"은 소수이다");
			}else {
				System.out.println(num+"은 소수가 아니다");
			}
			
		
		
		}//와일 끝
		System.out.println("종료합니다.");
		
	}
}
