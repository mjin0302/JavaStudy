package com.yedam.java.ch06.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		//인스턴스가 생성 될 시점에 날짜, 시간 정보를 보유함(스스로 현재 시간으로 수정 불가)
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String strNow = sdf.format(date);	//현재 시간과 날짜 정보를 담아서 String값으로 반환
		System.out.println(strNow);
		
		
	}

}
