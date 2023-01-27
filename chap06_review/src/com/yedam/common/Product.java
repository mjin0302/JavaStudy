package com.yedam.common;

public class Product {
	// 상품의 정보를 담는 클래스
	
	// 필드 - 해당 클래스가 가지는 모든 정보
	private String proName;	//상품명
	private int proPrice;	//상품가격
	
	// 생성자 - 클래스를 기반으로 해서 인스턴스를 생성할 때 필요한 프로세스를 담은 메소드
	public Product(String proName, int proPrice) {
		this.proName = proName;	//this는 해당 인스턴스를 지칭함, 반드시 new연산자를 통해 접근 해야함
		this.proPrice = proPrice;
	}
	
	// 메소드 - 해당 클래스가 가지는 모든 기능
	// set는 리턴값이 void임 (setting설정)
	// 필드의 첫글자는 대문자 이어야 함
	// 클래스 인터페이스 무조건 대문자
	// 
	public void setProName(String proName) {
		this.proName = proName;
	}
	
	public String getProName() {
		return this.proName;
	}
	
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	
	public int getProPrice() {
		return this.proPrice;
	}
}
