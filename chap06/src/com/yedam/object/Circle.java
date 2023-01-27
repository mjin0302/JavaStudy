package com.yedam.object;

//클래스 선언 순서
/* static 필드 : public
 * instance 필드 : private
 * 생성자 : public
 * getter, setter : public
 * 메서드 : public (일부는private를 쓰지만 주로 public사용)
 * */

public class Circle {
	
	//필드
	static final double pi = 3.14;	//메모리상에 구조만 변함	//final = 고정값(변경 못함)
	private double r;
	
	//r read/write를 제어할 수 있음(변경가능, 조회 불가능)
	public void setR(double r) {
		this.r = r;
	}
	//생성자
	public Circle() {
		
	}
	//r필드 초기화 생성자
	public Circle(double r) {
		this.r = r;
	}
	public double getR() {
		return r;
	}
	public double area() {
		double result = pi * r * r;
		return result;
	};
	
	//메소드
}
