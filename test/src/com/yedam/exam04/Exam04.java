package com.yedam.exam04;

public class Exam04 {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
		}

	}

}
