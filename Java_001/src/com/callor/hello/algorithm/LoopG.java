package com.callor.hello.algorithm;

public class LoopG {
	public static void main(String[] args) {
		for(int i =0; i <100 ; i++) {
			System.out.printf("%3d " , i+1);
			//i +1 이 10의 배수이면 
			// 10번 출력문으로 실행하고 나면
			if((i+1)%10== 0) {
				System.out.println();
				
			
			}
		}
	}

}
