package com.yedam.java.ch02_02;

public interface RemoteControl {
	
	// 상수 (static final = 상수(변경되지 않는 값))
	public int MAX_VALUE = 10;	//= public static final int MAX_VALUE = 10;
	public int MIN_VALUE = 0;	//상수는 무조건 초기 값이 존재 해야 함
	
	// 추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
