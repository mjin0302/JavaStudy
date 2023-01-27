package com.yedam.java.test03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		//3. 나이 계산기
//		//입력한 생년월일 6자리
//		//입력받은 생년월일이 몇살인지 출력
//		//ex)000101 -> 24살
//		
//		//3. 만 나이 계산기(올해 기준 +- 100살)
//		
//		// 1. 계산식 (하드 코딩) -> 올해만 사용 할 수 있음
//		// 1-1) 2000년 이후 2023년 이전 출생 -> (23 - 태어난 년도) + 1
//		// 1-2) 1922년 이후 2000년 이전 출생	-> (123 - 태어난 년도)
//		
//		System.out.println("생년 월일 > ");
//		String birth = sc.nextLine();
//		
//		int birthNo = Integer.parseInt(birth.substring(0, 20));
//		
//		if(birthNo <= 22) {	//1-1) 2000년 이후 2023년 이전 출생 -> (23 - 태어난 년도) + 1
//			System.out.println("나이 : " + ((23 - birthNo) + 1));
//		} else if(birthNo > 23) {	//1922년 이후 2000년 이전 출생
//			System.out.println("나이 : " + ((123 - birthNo) + 1));
//		}
		
		// 2. 계산식(일반화)
		// Calendar, date(simpledateForma -> (기준 년도 - 태어난 년도) + 1;
		// 1922년 이후 2000년 이전 출생 -
		
		//메모리 5개 사용
		String a = "a";
		a += "a";
		a += "a";
		a += "a";
		a += "a";
		a += "a";
		
		//메모리 1개 사용
		StringBuilder sb = new StringBuilder();
		sb.append("aaa");	//"aaa"
		sb.append(11);	//append 맨 끝에 추가 함
		sb.append(false);
		
		System.out.println(sb);
		
		
	}

}
