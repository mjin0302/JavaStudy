package com.yedam.ch03;

public class A {
	// 필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	// 생성자
	public A(boolean b) {}
	A(int b) {}	//default package를 벗어나면 사용 불가능
	private A(String s) {}	//나(class A)를 벗어날 수 없음
	
	// 메소드
}
