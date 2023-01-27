package com.yedam.variable;

public class Castring {

	public static void main(String[] args) {
		
		//자동 타입 변환, 큰타입 = 작은타입
		byte byteValue = 10;
		int intValue = byteValue;	//큰타입 = 작은타입
		System.out.println("intVale : " + intValue);
		
		char charValue = '가';
		intValue= charValue;	//큰타입 = 작은타입
		System.out.println("가의 유니코드 : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		double doubleValue = longValue;	//큰타입 = 작은타입
		System.out.println("doubleValue : " + doubleValue);
		
		//강제 타입 변혼
		//작은 허용 범위 타입 = (작은 허용 범위 타입)큰 범위 타입
		
		int intVar = 127;
		byte byteVar = (byte)intVar;
		System.out.println("byteVar : " + byteVar);
		
		int intVar2 = 44032;
		char charVar = (char)intVar2;
		
		System.out.println("charVar : " + charVar);
		
		//실수 <-> 정수간 강제 타입 변환
		//자동 타입 변환 : int -> double = 3.0
		//강제 타입 변환 : double -> int = 소수점 땐 정수만 타입 변환
		double doubleVar = 3.14;	
		intVar2 = (int)doubleVar;	//실수를 정수로 강제 변환을 하면 정수부분만 남기고 소수자리는 버림
		System.out.println("intVar2 : " + intVar2);
		
	}

}
