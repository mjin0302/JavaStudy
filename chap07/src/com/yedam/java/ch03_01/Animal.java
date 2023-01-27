package com.yedam.java.ch03_01;

public abstract class Animal {
	//필드
	public String kind;	//종
	
	//생성자
	
	
	//메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); //abstract가 메소드에 붙으면 추상 메소드
}
