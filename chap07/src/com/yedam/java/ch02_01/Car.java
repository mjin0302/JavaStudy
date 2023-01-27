package com.yedam.java.ch02_01;

public class Car {
	// 필드
	Tire frontLeftTire = new Tire("앞 왼쪽", 6);
	Tire frontRightTire = new Tire("앞 오른쪽",2);
	Tire backLeftTire = new Tire("뒤 왼쪽", 3);
	Tire backRightTire = new Tire("뒤 오른쪽",4);
	
	// 생성자
	
	// 메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;	//타이어의 위치
		}
		if(frontRightTire.roll() == false) {
			stop();
			return 2;	//타이어의 위치
		}
		if(backLeftTire.roll() == false) {
			stop();
			return 3;	//타이어의 위치
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;	//타이어의 위치
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
