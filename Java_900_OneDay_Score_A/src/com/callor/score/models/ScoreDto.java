package com.callor.score.models;

/*
 * 이 프로젝트에서 주요 사용할 데이터는 성적처리를 위한 최소한의 데이터이다. 
 * 학번, 국어, 영어, 수학, 음악 ,미술 의 데이터가 필요
 * 이 데이터는 코드에서 임의 값으로 생성할 예정
 * 
 * 성적 데이터를 기초로 하여 총점과 평균을 계산할텐데 
 * 이 총점과 평균도 데이터로 생성을 할 예정
 */

public class ScoreDto {
	
	
	public String stdNum;
	public 	int kor;
	public int eng;
	public int math;
	public int music;
	public int art;
	
	
	//private 변수느 다른 곳에서 직접변수에 접근 금지 변수에 값ㅇ르 할당, 읽기 금지 정보의 은닉
	private int total;
	private float avg;
	
	public int getTotal() {
		total = kor;
		total += eng;
		total += math;
		total += music;
		total += art;
		
		return total;
		
	}
	
	public float getAvg() {
		this.getTotal();
		avg = (float)total / 5;
		
		return avg;
		
	}
	
	
	
	

}
