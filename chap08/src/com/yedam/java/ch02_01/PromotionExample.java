package com.yedam.java.ch02_01;

public class PromotionExample {

	public static void main(String[] args) {
		D d = new D();
		d.method1();
		d.method2();
		d.method3();
		System.out.println();
		
		B b = new B();
		b.method1();
		b.method2();
		System.out.println();
		
		A a1 = b;	//자동 타입 변환 A=타입 a1=변수명 b = 구현 클래스
		a1.method1();
		System.out.println();
		
		A a2 = d;
		a2.method1();
		System.out.println();
	}

}
