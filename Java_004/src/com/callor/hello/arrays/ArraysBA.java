package com.callor.hello.arrays;

public class ArraysBA {
	public static void main(String[] args) {

		/*
		 * 매직스트링을 대신하는 변수는 모두 대문자로 _로 구분하는 snack case 로 작성
		 */

		int STUDENT_LENGTH = 10;

		int[] scoreKors = new int[STUDENT_LENGTH];

		for (int i = 0; i < scoreKors.length; i++) {
			int rndScore = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndScore;
			// System.out.println((i + 1) + "번째 학생의 국어 점수 : " + nums[i]);
			}
		int sum = 0;

		for (int i = 0; i < scoreKors.length; i++) {
			sum += scoreKors[i];
		}

		/*
		 * 평균을 실수값(float)으로 계산하기 위하여 정수형인 총점이나 length 중의 하나를 실수(float)로 형변환 한 후 나눗셈을
		 * 수행한다 명시적인, 강제적인 형 변환이라고 한다
		 */
		float avg = (float) sum / scoreKors.length;

		System.out.println("=".repeat(50));
		System.out.printf("국어 점수 총점 : %d, 평균: %.2f\n", sum, avg);
		System.out.println("=".repeat(50));
	}
}

//ISEEYOU_♥ 
