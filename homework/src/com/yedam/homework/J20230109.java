package com.yedam.homework;

public class J20230109 {
public static void main(String[] args) {
		
		/* 문제1) 정수형 변수 2개를 선언 후 각각 37과 91로 값을 초기화 후 변수를 출력하라. 
		   출력예시) "변수명1: 변수값, 변수명2: 변수값" */
		int x = 31;
		int y = 91;
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		/* 문제2) 문제 1번의 변수를 이용하여 각 연산을 수행한 결과를 출력하라.*/
		System.out.println(y + x);
		System.out.println(y - x);
		System.out.println(y * x);
		System.out.println(y / x);
		
		/* 문제3) 각 변수의 값에 맞게 변수타입을 수정 후 
		 	값과 변수타입을 printf()를 사용하여 출력하세요.
	    	출력예시) int a = 10; 의 경우 "10, int"로 출력. */
		int var1 = 128;
		System.out.println("var1 : " + var1);
		
		String var2 = "B";
		System.out.println("var2 : " + var2);
		
		long var3 = 44032;
		System.out.println("var3 : " + var3);
		
		long var4 = 100000000000L;
		System.out.println("var4 : " + var4);
		
		double var5 = 43.93106;
		System.out.println("var5 : " + var5);
		
		float var6 = 301.3f;
		System.out.println("var6 : " + var6);
		
		/*문제4) 아래와 같이 변수가 초기화되어있을 경우 
			결과값을 저장할 변수의 타입을 지정하고 값을 변수값을 출력하세요. */
		byte a = 35;
		byte b = 25;
		int c = 463;
		long d = 1000l;
		
		long result1 = a + c + d;
		System.out.println("result1 : " + result1);
		
		int result2 = a + b + c;
		System.out.println("result2 : " + result2);
		
		double e = 45.31;
		double result3 = c + d + e;
		System.out.println("result3 : " + result3);
		
		/* 문제5) 아래와 같이 변수가 초기화되어있을 경우 
		 다음과 같이 명시된데로 출력하세요.
		 출력예시) A278번지10.0 */
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = "번지";
		
		int result = ((intValue1 + intValue2)*intValue4) + intValue3;
		String address = String.valueOf(result);	//result를 문자 형태로 변
		System.out.println(result);
		double dValue = (double)intValue4;	//int -> double로 변
		
		System.out.println(charValue + address + strValue + dValue);
		
		/* 추가문제) 아래와 같이 변수 값이 주어질 경우 각 자리의 합을 구해 출력하세요. 
	    예시) 373 일 경우 3 + 7 + 3 = 13 으로 결과는 13입니다.
	    힌트) 곱하기 연산자 (*), 나누기 연산자( / ) 와 빼기 연산자 ( - ) 를 이용하세요. */
		int value = 485;
		
		int first= (int)(value/100);	//100의 자리
        int second = (int)((value-first*100)/10);	//10의 자리
        int three = (int)(value-((first*100)+(second*10)));	//1의 자리
        int three2 = (int)(value%10);	//1의 자리 => 나누기하고 남은 나머지로
        int sumResult = first + second + three;	//결과값 
        
       System.out.println(first);
       System.out.println(second);
       System.out.println(three);
       System.out.println(three2);
       System.out.println(sumResult);
	}
}
