package com.yedam.exam01;

public class Exam01 {

	public static void main(String[] args) {
		int x = 10;
		double y = 2.0;
		//float y = 2.0F;
		
		System.out.printf("%d + %.1f = %d\n" , x, y, (int)(x + y));
		System.out.printf("%d - %.1f = %d\n" , x, y, (int)(x - y));
		System.out.printf("%d * %.1f = %d\n" , x, y, (int)(x * y));
		System.out.printf("%d / %.1f = %d\n" , x, y, (int)(x / y));

	}

}
