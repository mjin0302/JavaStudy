package com.yedam.object;

public class CircleSingle {
	
	//싱글톤
	static CircleSingle instance = new CircleSingle();
	static CircleSingle getInstance() {
		return instance;
	}
	
	//생성자
	private CircleSingle() {
		
	}
	
	//필드
	static final double pi = 3.14;	//메모리상에 구조만 변함	//final = 고정값(변경 못함)
	double r;
	
	//생성자
	//r필드 초기화 생성자
	CircleSingle(double r) {
		this.r = r;
	}
	
	double area() {
		double result = pi * r * r;
		return result;
	};
	
	//메소드
}
