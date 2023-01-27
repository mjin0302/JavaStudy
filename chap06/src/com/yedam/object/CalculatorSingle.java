package com.yedam.object;
/* 필요시마다 매번 객체를 생성하지 않고
 * 객체를 한번만 생성 해놓고 필요시 참조해서 사용함
 * 장점 : 메모리 관리가 효율적임 */
public class CalculatorSingle {
	
	//싱글톤
	static CalculatorSingle instance = new CalculatorSingle();
	static CalculatorSingle getInstance( ) {
		return instance;
	}
	
	//생성자
	private CalculatorSingle() {	//다른 클래스에서 접근할 수 없음
		
	}
	
	//필드
	
	//생성자
	
	//메소드
	//메소드 리턴 타입이 존재할때
	int sum(int a, int b) {
		return a + b;
	}
	
	double sub(int a, int b) {
		return a-b;
	}
	
	String result(String value) {
		String temp = "value 테스트 : " + value;
		return temp;
	}
	
	//리턴문이 없는 메소드 생성
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
		
	}
	
	//정확한 매개변수 개수를 모를때 사용
	int sum2(int ...values) {
		int total = 0;
		for(int a : values) {
			total += a;
		}
		
		return total;
	}	
}