package com.yedam.java.ch01.object;

public class Member {	//자동으로 object의 자식 클래스
	
	//필드
	public String id;
	
	
	//생성자
	public Member(String id) {
		this.id = id;
	}

	//메소드
	@Override
	public boolean equals(Object obj) {	//매개변수 타입은 Object (그렇기 때문에 강제 타입 변환을 일으켜야 함)
		if(obj instanceof Member) {
			Member member = (Member)obj;	//강제 타입 변환
			if(id.equals(member.id))
				return true;
		}
		return false;	//return 타입은 boolean
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + "]";
	}
}
