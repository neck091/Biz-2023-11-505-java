package com.callor.score;

public class ScoreDto {
	
	String StdNum = null;
	
	public String stdNum;
	
	public int kor;
	public int eng;
	public int math;
	public int music;
	public int art;
	
	private int total;
	private float avg;
	
	public int getTotal() {
		total += kor;
		total += eng;
		total += math;
		total += music;
		total += art;
		
		return total;
	}
	
	public float getAvg() {

		avg = (float)total/ 5 ; 
				
		return avg;
	}
	
}
