package com.yedam.java.example;

public class PriorityAllocation implements Scheduler {
	// 고객의 우선 순위에 따라 상담원이 대응합니다.
	
	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져 옴");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 Skill이 높은 상담원에게 우선적으로 배분");
	}

}
