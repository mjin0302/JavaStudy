package com.yedam.java.ch02_01;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		driver.drive(new Taxi()); // taxi인스턴스 생성 -> run메소드 실행 방법 -> Vehicle은 매개변수
		driver.drive(new Bus());
	}

}
