package com.yedam.variable;

public class Variable01 {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;	//시간을 분으로 환산해서 계산해서 출력하는 구문
		System.out.println("총" + totalMinute + "분");
		
		int value = 0;	//변수 초기화필수(initialized)
		int result = value + 10;
		
		System.out.println(result);
		
		int x = 3;
		int y = 5;
		//x -> y의 값으로 변경
		//y -> x의 값으로 변경
		
		//y = x;
		//x = x, y = x;
		//대신 담아줄 수 있는 변수 생성
		int z = 0;
		//x의 데이터를 미리 z에 담아 둠
		
		z = x;	//1) x -> z(z = 3)
		x = y;	//2) y -> x(x = 5)
		y = z;	//3) z -> y(y = 3)
	}
}
