package com.yedam.java.ch03_01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone("홍길동");	
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		//Phone phone = new SmartPhone("홍길동");	//자동 타입 변환은 가능함
		//SmartPhone smartPhone1 = (SmartPhone)new Phone("홍길동");	//new연산자를 통해 Phone를 만들수 없음
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
	}

}
