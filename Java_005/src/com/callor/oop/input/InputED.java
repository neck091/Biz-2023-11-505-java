package com.callor.oop.input;

import java.util.Scanner;

import com.callor.oop.utils.Line;

public class InputED {

	public static void main(String[] args) {

		int[] nums = new int[3];

		Scanner scan = new Scanner(System.in);
		/*
		 * 와일 반복문을 사용할 때 인덱스 값이 필요하면 
		 * 와일 반복문 시작전에 영으로 초기화된 변수 선언
		 * 와잉ㄹ 문 내에서 인덱스++ 실행.
		 */
		

		int index = 0;
		while (index <nums.length) {
			System.out.printf("정수 %d >> ",index+1);
			String str = scan.nextLine();
			try {
				nums[index] = Integer.valueOf(str);
				
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력바람");
				continue;
			}
		
			index++;
		}//end while
			Line.dLine(30);
			
			int sum =0;
			for(int num : nums) {
				System.out.println(num);
			sum += num ;
			}
			Line.dLine(30);
			System.out.println("합계 : "+ sum);

	}//end main
}//end class
