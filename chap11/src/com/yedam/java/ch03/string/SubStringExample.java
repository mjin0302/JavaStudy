package com.yedam.java.ch03.string;

public class SubStringExample {

	public static void main(String[] args) {
		
		//생년월일만 필요하다면?
		String ssn = "880815 1234567";
		
		//substring(start, end) -> Index start 부터 end 전까지
		String firstNum = ssn.substring(0, 6);	//잘라내고자 하는 위치보다 1이 커야 함(끝나는 다음 인덱스 위치를 원함)
		System.out.println("생년월일 : " + firstNum);
		
		//substring(start) -> Index start부터 끝까지
		String secondNum = ssn.substring(7);
		System.out.println("개인정보 : " + secondNum);
		
		String[] numList = ssn.split(" ");	//토큰화 시킴
		for(String num : numList) {
			System.out.println(num);
		}
	}

}
