package com.yedam.java.test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//내 풀이
		String a = "abc12345";

		String reverse = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			reverse = reverse + a.charAt(i);
		}

		//교수님 풀이
		// 결과 출력
		System.out.println(reverse);
		
		Scanner sc = new Scanner(System.in);
		// 1. 문자열 뒤집기
		System.out.println("뒤집을 문자열 입력 > ");
		String str = sc.nextLine();
		
		//String.length -> 문자열 길이
		//String.charAt(위치); -> 위치에 따른 문자 출력
		for(int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
