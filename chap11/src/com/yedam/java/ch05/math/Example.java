package com.yedam.java.ch05.math;

public class Example {

	public static void main(String[] args) {
		
		//abs() : 절대값
		System.out.println("2.14의 절대값 : " + Math.abs(2.14) );
		System.out.println("-2.14의 절대값 : " + Math.abs(-2.14) );
		
		//max(), min() : 최대값, 최소값
		System.out.println("3.8, 6.7중 최대값 : " + Math.max(3.8, 6.7));
		System.out.println("3.8, 6.7중 최소값 : " + Math.min(3.8, 6.7));
		
		// ceil() : 올림값
		System.out.println("5.3의 올림값 : " + Math.ceil(5.3));
		System.out.println("-5.3의 올림값 : " + Math.ceil(-5.3));
		
		// floor() : 버림값 음수일땐 -9,-8,-7,-6,-5 이면 버림 -4,-3,-2,-1일땐 올림
		System.out.println("5.3의 버림값 : " + Math.floor(5.3));
		System.out.println("-5.3의 버림값 : " + Math.floor(-5.3));
		
		// round() : 반올림값(5이상일 때 올림) 
		System.out.println("5.5의 반올림값 : " + Math.round(5.5));
		System.out.println("-5.5의 반올림값 : " + Math.round(-5.4));
		
		// rint() : 반올림값(6이상일 때 올림) 소수점 앞이 짝수일땐 6이상, 소수점 앞이 홀 수 일땐 5이상
		System.out.println("5.5의 가까운 정수의 실수값 : " + Math.rint(5.5));
		System.out.println("4.5의 가까운 정수의 실수값 : " + Math.rint(4.5));
		System.out.println("5.6의 가까운 정수의 실수값 : " + Math.rint(5.6));
		System.out.println("4.6의 가까운 정수의 실수값 : " + Math.rint(4.6));
		
	}

}
