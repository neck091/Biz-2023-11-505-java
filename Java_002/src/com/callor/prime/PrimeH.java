package com.callor.prime;

public class PrimeH {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 100; i++) {
			int num= i+1; //i 값은 1부터 99까지 인데 이 값을 2부터 100까지 변환
			int index = 0;
			for (index = 2; index < num; index++) {
				if ((num) % index == 0) {
					break;
				}
			}//소수검사 끝
			if (index < (num)) {
			} else {
				sum += num;
			}
		} //포 전체 끝
		System.out.printf("2~100까지의 수 중 소수들의 합 : %d",sum);
	} //메인 끝
}




/*
 * 
 * if (indew <num {
 *  prime 아니다. 
 *  }
 *  else {
 *  system ot primtln(mum은 소스\ㅜ)
 *  
 *  
 */

