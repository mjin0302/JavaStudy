package com.yedam.java.ch02_01;

public class B implements A {
	@Override
	public void method1() {
		System.out.println("Interface A - Method1()");
	}
	
	//b의 메소드
	public void method2() {
		System.out.println("Class B - Method2()");
	}
}
