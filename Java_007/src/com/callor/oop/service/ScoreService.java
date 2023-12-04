package com.callor.oop.service;

public class ScoreService {

	// 클래스 영역에 선언한 변수
	public String stdNum = null;
	public int scoreKor =0;
	public int scoreEng =0;
	public int scoreMath =0;
	
	/*
	 * scoreService 클래스에 getScoreTotal(), getScoreAvg method를 선언하고
	 * 총점과 평균을 각각 계산하여 return 하도록 하고있다. 
	 * scoertotal 번수와 scoreAvg 변수는 총점과 평균을 계산하는 용도로 사용중이가
	 * Scoreservice 객체를 통하여 총점과 평균을 참조(읽기)하기 위해서는 fetScoreTotal(), getScoreAvg method 를 통해서만 가능해야 한다.
	 * ScoreTotal. scoreavg 변수에서 직접 값을 참조하면 엉뚱한 데이터를 참조할 수 있음/
	 * 이때 다른곳에서 변수를 참조하기 못하게 하기 위하여 변수에 private 키워드 부착
	 * 
	 * private 키워드는 현재 클래스 내에서만 값을 할당, 읽기가 가능하도록 제한하는 것
	 * 
	 */
	
	private int scoreTotal = 0;
	private float scoreAvg = 0.0f;
	
	
	//정수값을 return 하는 method
	
	public int getScoreTotal() {
	scoreTotal = scoreKor;
	scoreTotal += scoreEng;
	scoreTotal += scoreMath;
	
	return scoreTotal;
	}
	
	public float getScoreAvg() {
		getScoreTotal();
		scoreAvg =(float)(scoreTotal) /3;
		return scoreAvg;
	}
	
}
