package com.yedam.object;

public class MethodTest {

	public static void main(String[] args) {
		StringUtil su = new StringUtil();
		StringUtil.greet();
		Integer.parseInt("50");	//예시 스태틱으로 사용할수있음
		
		
		StringUtil.greet("Good Morning");
		long l = StringUtil.greetLength("GoodMorning");
		System.out.println(l);
	}

}
