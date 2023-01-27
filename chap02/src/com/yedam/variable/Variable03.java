package com.yedam.variable;

public class Variable03 {
	public static void main(String[] args) {
		
		int var1 = 0b1011;	//2진수
		int var2 = 0206;	//8진수
		int var3 = 356;		//10진수
		int var4 = 0xB3;	//16진수
		
		System.out.println("var1 : " +var1);
		System.out.println("var1 : " +var2);
		System.out.println("var1 : " +var3);
		System.out.println("var1 : " +var4);
		
		byte bVar1 = 125;	//byte는 -128 ~ 127까지 담을수 있음
		int bVar2 = 200;	//byte는 200을 담을수가 없음
		
		System.out.println("bVar1 : " + bVar1);
		System.out.println("bVar2 : " + bVar2);
		
		//Long
		long lVar1 = 2000000;
		long lVar2 = 20000000000L;	//int 범위를 넘어간 데이터는 뒤에 L을 붙여줘야함
		
		//Char
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;	//가를 숫자르 바꾼값인데 들어갈때는 숫자로 들어가고 출력은 글로 표현됌
		char c6 = '\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}
}
