package com.yedam.java.ch03.string;

public class DataUpdateExample {

	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원 합니다";
		String newStr = oldStr.replace("자바", "JAVA");	//첫번째에 두번째 데이터가 덮어 씀
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		StringBuilder sb = new StringBuilder();	//정해진 공간 안에서 수정 삭제..등등이 일어남
		
		sb.append("JAva");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "24");
		System.out.println(sb.toString());
		
		sb.replace(7, 14, "Book");
		System.out.println(sb.toString());
		
		String result = sb.toString();
		sb.delete(0, 4);
		System.out.println(result);
		System.out.println(sb.toString());

	}

}
