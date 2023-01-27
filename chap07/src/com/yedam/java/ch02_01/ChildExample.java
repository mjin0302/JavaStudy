package com.yedam.java.ch02_01;

public class ChildExample {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		
		Parent parent = child;	//child가 Parent 타입으로 자동변환
		parent.method1();
		parent.method2();
		//parent.method3();
	}

}
