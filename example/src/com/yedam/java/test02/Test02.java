package com.yedam.java.test02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 2. 입력한 문자열 개수 세기
		// 중복되는 문자가 몇개가 존재 하는지?
		// a~z : 26개가 다 들어온다는 가정
		int charAry[] = new int[26];
		System.out.println("문자열 입력 > ");
		
		//입력한 문자열 소문자 변환
		String str2 = sc.nextLine().toLowerCase();
		// 0 ~ 25, 각각의 인덱스 어떤 문자를 의미하는지
		// 0 -> a, 1 -> b ... 25 -> z
		// 아스키코드 : a => 97, b => 98 ...
		// 내가 입력한 문자 - 97 = 배열의 인덱스 값
		// "aabbccdd" -> 첫번째 a(내가 입력한 문자)
		// ary[내가 입력한 문자 - 97] => 0 ~ 25(a ~ z)의 자리와 갯수를 의미
		// String b = "abcassb";
		
		for(int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);
			//다른 방법 : str2.substring(i, i + 1);
			//입력한 문자 : "aabbccdd"
			//첫번째 문자 a를 꺼내왔다.
			charAry[ch - 'a']++;
		}
		for(int i = 0; i < charAry.length; i++) {
			if(charAry[i] !=0) {
				// ex)a = 2개, b = 2개, c = 1개, s = 2개
				System.out.println((char)(97 + i) + " " + charAry[i] + "개");
			}
		}
	}
}
