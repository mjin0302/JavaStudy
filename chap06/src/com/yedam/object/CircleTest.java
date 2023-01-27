package com.yedam.object;

public class CircleTest {

	public static void main(String[] args) {
		//싱글톤
		CircleSingle cirSingle = CircleSingle.getInstance();
		
		//static = 정적 = 공유
		//클래스파일 로딩시에 메모리에 할당
		//객체생성 없이 클래스 이름으로 스태틱 필드 접근가능
		System.out.println(Circle.pi);
		//반지름이 5인 원의 면적 계산
		//Circle 객체 생성
		Circle cir = new Circle(5);	//객체를 생성하면서 r=5를 넣어줌
		//반지름 5 초기화
		//cir.r = 5;	//직접 초기화 해주는 방법 
		//area 계산하기
		double result = cir.area();
		//결과 출력
		System.out.println(result);
		
		Circle cir2 = new Circle();	//기본 생성자가 필요함
		//cir2.r = 10;
	}

}
