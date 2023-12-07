package com.callor.score.exec;

public class StringA {
	public static void main(String[] args) {
		for(int i=0; i<10 ;i++){
			int num =i+1;
			
			// 정수를 사용하여 규격에 맞는 학번을 
			//CODE로 만들고자 함
			//그러나 printf() 는 return type 이 void 이기 때문에 결과 값을 변수에 할당할 수 없음.
			//String Num =System.out.printf("%05d\n", num);
			
			String strNum = String.format("S%05d", num);
			
			System.out.println(strNum);
		}
	}
}
