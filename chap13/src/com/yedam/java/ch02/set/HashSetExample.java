package com.yedam.java.ch02.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Database");
		set.add("iBATIS");
		set.add("Java");
		
		int size = set.size();
		
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		Iterator<String> iterator = set.iterator();	//iterator 중복되지 않는 값을 가지고 있는 목록
		while(iterator.hasNext()) { //hasNext() -> 다음으로 이동하는 함수
			String element = iterator.next();	//set안에 있는 객체의 값을 가져옴(객체의 주소를 알고있기 때문에 값을 가져올 수 있음)
			System.out.println("\t" + element);
		}
		System.out.println();
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		for(String skill : set) {
			System.out.println("\t" + skill);
		}
		System.out.println();
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("인스턴스는 존재하고 내부가 비워짐.");
		}
		
		
				
				
				
				
				
				
				
	}

}
