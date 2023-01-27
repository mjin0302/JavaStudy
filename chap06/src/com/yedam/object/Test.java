package com.yedam.object;

import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result = calc.sum(10, 20);
		System.out.println(result);
		
		Calculator calc2 = new Calculator();
		int result2 = calc2.sum(10, 20);
		System.out.println(result);
		
		System.out.println(calc == calc2);
		
		//CalculatorSingle의 객체를 불러 쓰는것 (객체는 이미 생성되어있음) 그래서 주소값이 같음
		CalculatorSingle calcSingle = CalculatorSingle.getInstance();
		CalculatorSingle calcSingle2 = CalculatorSingle.getInstance();
		System.out.println(calcSingle == calcSingle2);

		Calendar today = Calendar.getInstance();	//getInstance() => 싱글톤일때 사용
		today.set(2023, 2, 1);	//month : 1월은 0부터 시작
		System.out.println(today.get(Calendar.DAY_OF_YEAR));
	}
}
