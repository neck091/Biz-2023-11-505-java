package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;

public class ScoreB {
	
	public static void main(String[] args) {
		/*
		 * 5명 학생의 성적 처리를 하기 위하여 
		 * ScoreService 클래스를 (설계도로 하여) 사용하여
		 * 5개의 scores 배열을 "선언만" 한다.
		 */
		ScoreService[] scores =new ScoreService[5];
		
		//0은 철수 1은 영희 2는 민수 3은 길동 4는 꺽정
		//객체 배열은 선언만 되어 있을 때는
		// 내부에 포함되는 변수 method 를 사용할 수 없음
		//각각의 배열 요소를 다시 한 번 객체로 생성(new)해줘야 함
		scores[0] =new ScoreService();
		scores[0].scoreKor = 100;
		scores[0].scoreEng = 100;
		scores[0].scoreMath = 100;
		
		scores[1] = new ScoreService();
		scores[1].scoreKor = 90;
		scores[1].scoreEng = 70;
		scores[1].scoreMath = 95;
		
		scores[2] = new ScoreService();
		scores[2].scoreKor = 80;
		scores[2].scoreEng = 70;
		scores[2].scoreMath = 60;
		//scoreTotal은 private 로 설정되어 있어서
		//변수에 값을 직접 참조할 수 없음
		//scoreTotal 변수의 값을 사용하려면 반드시 getscoreTotal method 를 통해서만 가능
		//System.out.println(scores[1].ScoreTotal());
		System.out.println(scores[1].getScoreAvg());
		System.out.println(scores[1].getScoreTotal());
		
		
	}

}
