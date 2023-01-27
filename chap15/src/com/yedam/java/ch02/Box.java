package com.yedam.java.ch02;

public class Box<T> { // 제네릭 타입 클래스(타입) 자체를 값으로 받는 일종의 변수

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}
