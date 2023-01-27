package com.yedam.java.ch02_02;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;	//RemoteControl로 자동 타입 변환
		rc.turnOff();
		
		Searchable searchable = tv;	//
		searchable.search("다음");
		
		SmartTV smartTV = tv;
		smartTV.alarm("12:00");
		smartTV.search("구글");
		smartTV.turnOn();
	}

}
