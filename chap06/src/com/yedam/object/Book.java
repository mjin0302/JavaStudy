package com.yedam.object;

public class Book {
	// 책의 종류 , 가격, 출판사, 도서번호의 정보
	String bookName; // 책이름
	String genre = "학습서"; // 종류
	int price; // 가격
	String publish = "한빛미디어"; // 출판사
	String isbn; // 도서번호
	
	// 생성자 오버로딩 : 매개변수 타입, 개수 , 순서가 다르게 선언
	Book(String bookName, int price, String isbn){
		this.bookName = bookName;
		this.price = price;
		this.isbn = isbn;
	}
	
	// 생성자 오버로딩 : 매개변수 타입, 개수 , 순서가 다르게 선언
	// 매개변수의 타입에 따른 생성자 오버로딩
	Book(String bookName, String genre, String isbn){
		this.genre = genre;
		this.isbn = isbn;
	}  
	
	// 매개 변수 순서에 따른 생성자 오버로딩
	// 데이터 타입 기준으로 순서를 따진다.
	Book(String bookName, String isbn, int price){
		this.price = price;
		this.isbn = isbn;
	}
	
	// 매개 변수 갯수
	Book(int price){
		this.price = price;
	}
	
	// 기본 생성자 : 사용할 일이 있으면 반드시 선언해줘야함 , 이것도 하나의 생성자 오버로딩중 하나임
	Book(){
		
	}
	
	void getInfo() {
		System.out.println(bookName);
		System.out.println("# 내용");
		System.out.println("1) 종류 : " + genre);
		System.out.println("2) 가격 : " + price + "원");
		System.out.println("3) 출판사 : " + publish);
		System.out.println("4) 도서번호 : " + isbn);
	}
	
	
}
