package com.yedam.java.test01;

public class Person {
	// 필드
	private int ssn; // 주민등록번호
	private String name; // 이름
	private String address; // 주소

	// 기본 생성자
	Person() {
	}

	// 생성자를 통한 필드 초기화
	Person(int ssn, String name, String address) {
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}

	// 메소드
	// getter setter
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
