package com.yedam.java.ch03.string;

public class CaseException {
	
	public static final String DATA = "HELLO WORLD!";
	
	public static void main(String[] args) {
		
		String inputData = "Hello World!";
		String newInputDataL = inputData.toLowerCase();	//소문자
		String newInputDataU = inputData.toUpperCase();	//대문자
		
		if(newInputDataU.equals(DATA.toUpperCase())) {
			System.out.println("있는 데이터 입니다.");
		} else {
			System.out.println("없는 데이터 입니다.");
		}
	}

}
