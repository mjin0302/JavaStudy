package com.yedam.java.ch02;

public class Example {

	public static void main(String[] args) {
		
		// 매개변수가 없는 경우
		Workable work = () -> {
			System.out.println("출근을 합니다.");
			System.out.println("프로그래밍을 합니다. ");
		};
		
		work.work();
		
		work = () -> System.out.println("퇴근을 합니다.");
		work.work();
		
		// 매개변수가 있는 경우
		Speakable speak = (x) -> {
			System.out.println("현재 볼륨은 중간 입니다.");
			System.out.println("현재 재생되는 음악은 " + x + "입니다.");
		};
		speak.speak("뉴진스 - HypeBoy");
		// 매개변수가 하나이고 실행하는것도 하나 일때는 한줄로도 가능하다
		speak = x -> System.out.println("현재 재생되는 음악은 " + x + "입니다.");
		speak.speak("갓더비트 - Strum Up");
		
		// 리턴값이 있는 경우
		Calculator cal = (x, y) -> {
			int result = (int)(x + y);
			return result;
		};
		System.out.println("첫 번째 방식 : " + cal.plus(5.8, 6.9));
		
		//return (int)(x+y); 이지만 return구문도 생략 가능
		cal = (x, y) -> (int)(x+y);
		System.out.println("두 번째 방식 : " + cal.plus(5.8, 6.9));
		
		
		
		
		
		
	}

}
