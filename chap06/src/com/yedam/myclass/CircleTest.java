package com.yedam.myclass;

import com.yedam.object.Circle;	//private 상태에서 불러 사용할려면 필요함

public class CircleTest {

	public static void main(String[] args) {
		Circle cir = new Circle();
		cir.setR(10);
		double area = cir.area();
		System.out.println(area);
	}

}
