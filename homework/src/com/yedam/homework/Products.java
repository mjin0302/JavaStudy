package com.yedam.homework;

public class Products {
	//필드
	String productName;	//상품 이름 
	int productPrice;	//상품 가격 
	
	//생성자
	Products( ) {
		
	}
	
	Products(String productName, int productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	//메소드
	void getInfo() {
		System.out.println(productName + " : " + productPrice + "원");
	}
	
	
}
