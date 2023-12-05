package com.callor.score.model;

/*
 * Dto:data transfer object
 *  data 를 저장하기(옮기기 위한, 이동하기 위한) 위한 클래스
 *  
 *  data.txt 파일에 저장된 데이터의 구조.(header)
 *  학번,국어,영어,수학,음악,미술,소프트웨어공학,데이터베이스
 */

public class ScoreDto {

	// data.txt 파일에 저장된 데이터의 구조를 변수로 선언
		public String stuNum;
		public int kor;
		public int eng;
		public int math;
		public int music;
		public int art;
		public int sw;
		public int db;
		
		//과목의 총점과 평균을 계산하여 저장할 추가 변수
		private int total;
		private float avg;
		
		public int getTotal() {
			total =kor;
			total +=eng;
			total += math;
			total +=music;
		    total +=art;
			total +=sw;
			total += db;
			
			return total;
		}
		
		//리턴하는 변수의 타입이 플로트이므로 메서드의 리턴타입도 플로트여야함WWW
		public float getAvg() {
			
			getTotal();
			avg=(float)total /7;
		
			return avg;
			
		}
		
	


}
