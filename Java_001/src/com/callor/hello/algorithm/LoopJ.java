package com.callor.hello.algorithm;

public class LoopJ {
	public static void main(String[] args) {
		/*
		 * sum 변수를 어디에서 선언할 것인가
		 * 
		 */
		
		int sum= 0;
		for(int i =0; i<10; i++) {
		System.out.println(i+1);
			//sum = sum+(i+1);
			sum += (i+1);
			}
		
		//결과 출력은 어디에서 할 것인가
		System.out.println("결과 : "+ sum);
			
		}
	}

