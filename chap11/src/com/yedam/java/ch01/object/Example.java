package com.yedam.java.ch01.object;

import java.util.HashMap;
import java.util.Map;

public class Example {

	public static void main(String[] args) {
		Member m1 = new Member("홍길동");
		Member m2 = new Member("신윤권");
		Member m3 = new Member("신윤권");
		
		//메모리에 올라가 있는 member의 값 비교
		if(m1.equals(m2)) {
			System.out.println("m1과 m2는 동등합니다.");
		} else {
			System.out.println("m1과 m2는 동등하지 않습니다.");
		}
		
		if(m2.equals(m3)) {
			System.out.println("m2과 m3는 동등합니다.");
		} else {
			System.out.println("m2과 m3는 동등하지 않습니다.");
		}
		
		//하나의 Key(배열에서 index -> class로 사용), value 한 세트
		Map<Key, String> hashMap = new HashMap<Key, String>();
		hashMap.put(new Key(1), "홍길동");	//put()실행블록 안에 equals(), hashCode()를 자동으로 호출을 해서 비교함
		
		String name = hashMap.get(new Key(1));
		System.out.println(name);
		
		System.out.println();
		
		String message = "오늘은 수요일입니다.";
		System.out.println(message);
		System.out.println(m1);
		
	}

}
