package com.yedam.object;

public class Score {

	
	// 필드
	int kor; // 국어
	int math; // 수학
	int eng; // 영어
	
	// 생성자
	Score(int kor, int math, int eng){
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	// 메소드
	// 총 합
	int getSum() {
		return kor+math+eng;
	}
	
	// 평균
	double getAvg() {
//		int sum = kor + math + eng; // 이렇게 안하고 만들어진 함수 호출하면됨
		int sum = getSum(); // 총합 메소드 호출
		return sum/3.0;
	}
	
	void getInfo() {
		int sum = getSum(); // 함수안에서 함수를 호출 가능
		double avg = getAvg();
		
		System.out.println("성적 합계: " + sum);
		System.out.println("성적 평균: " + avg);
	}
	
}
