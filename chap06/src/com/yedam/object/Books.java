package com.yedam.object;

public class Books {
	//필드
	String bookName;
	String bookKind = "학습서";
	int price;
	String bookPub = "출판사";
	String isbn;
	
	//생성자
	Books(String bookName, int price, String isbn) {
		this.bookName = bookName;
		this.price = price;
		this.isbn = isbn;
	}
	
	//메소드
	void getInfo() {
		System.out.println(bookName);
		System.out.println("1) 종류 : " + bookKind);
		System.out.println("2) 가격 : " + price + "원");
		System.out.println("3) 출판사 : " + bookPub);
		System.out.println("4) 도서번호 : " + isbn);
	}
	//매개변수의 타입에 따른 생성자 오버로딩
	
	
	//매개 변수 순서에 따른 생성자 오버로딩
	//데이터 타입 기준으로 순서를 따진다
	Books(String isbn, int price) {
		this.price = price;
		this.isbn = isbn;
	}
	
	//매개 변수 개수
	Books(int price) {
		this.price = price;
	}
	
	//기본 생성자
	
	Books() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
