package com.yedam.java.ch03_example;

public abstract class PlayerLevel  {
	
	//생성자
	public PlayerLevel() {
		
	}
	
	//추상 메소드(레벨 마다 값이 달라지기 때문)
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	//일반 메소드(필살기) 프로세스가 일정하기 때문
	//한번 run하고 매개변수로 전달된 count만큼 jump하고, 한번 turn한다
	public final void go(int count) {
		run();
		for(int i=0; i < count; i++) {
			jump();
		}
		turn();
	}
	
	//필드
	
	
	//생성자
}
