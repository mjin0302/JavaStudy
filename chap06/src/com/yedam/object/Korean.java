package com.yedam.object;

public class Korean {

	// 필드
	String nation = "korea";
	String name;
	String ssn; // 주민등록 번호
	
	// 생성자
	// 생성자를 활용한 필드 초기화
	Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
	
	// 만약 매개변수가 있는 생성자가 있다면 기본 생성자가 필요할때 선언해줘야함 이건 자동생성안해줌
	Korean(){
		
	}
	
	// 메소드
	
	
}
