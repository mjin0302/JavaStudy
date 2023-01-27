package com.yedam.variable;

public class OpratorCasting {

	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		
		long result = value1 + value2 + value3;	//결과값은 long타입으로 변함
		
		System.out.println(result);
		
		//실수와 정수 타입 변환(연산)
		int intValue1 = 10;
		int intValue4 = intValue1/4;	// 10/4 = 2.5가 나와야하는데 int형이라서 뒷자리를 버림
		System.out.println(intValue4);	// 결과값 = 2
		
		
		int intValue2 = 10;
		double intValue3 = intValue2 / 4.0;	// 10/4.0 = 2.5
		System.out.println(intValue3);
		
		int x = 1;
		int y = 2;
		double result2 = x/y;
		System.out.println(result2);
		
		// +연산
		//숫자 연산 (더하기)
		int value = 10+2+8;
		System.out.println(value);
		
		//문자열 결합 연산
		String str1 = 10+2+"8";	//숫자(10+2)는 계산하고 + 문자"8"은 문자로 인식
		System.out.println("str1 : " + str1);	//128이 출력
		
		String str2 = 10 + "2" + 8;	//문자열"2"을 만나는 순간 그 뒤로는 전부 다 문자
		System.out.println("str2 : " + str2);	//1028이 출력
		
		String str3 = "10" + 2 + 8;	//문자열"10"을 만나는 순간 그 뒤로는 전부 다 문자
		System.out.println("str3 : " + str3);	////1028이 출력
		
		String str4 = "10" + (2+8);	// ()안에 있는걸 먼저 연산하고 문자열"10"을 붙임
		System.out.println("str4 : " + str4);
		
		//String <-> 정수, 실수 타입 변환
		int valueStr = Integer.parseInt(str4);	//문자형str4를 int형으로 바꿔줌
		System.out.println(valueStr);	//int형 1010
		
		//byte byteValue = Byte.parseByte(str4);	//
		
		short shortValue = Short.parseShort(str4);	//문자형str4를 short형으로 바꿔줌
		System.out.println(shortValue);	//short형 1010
		
		long longValue = Long.parseLong(str4);	//문자형str4를 long형으로 바꿔줌
		System.out.println(longValue);	//long형 1010
		
		double dValue = Double.parseDouble(str4);	//문자형str4를 double형으로 바꿔줌
		System.out.println(dValue);	//double형 1010.0
		//boolean bValue = Boolean.parseBoolean(str4);
		
		//int -> String
		String str5 = String.valueOf(valueStr);
		
		//long -> String
		String str6 = String.valueOf(longValue);
		
		//double -> String
		String str7 = String.valueOf(dValue);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
