/*문제) 고객 센터에는 전화 상담을 하는 상담원들이 있습니다. 
* 	일단 고객 센터로 전화가 오면 대기열에 저장됩니다.
* 	상담원이 지정되기 전까지 대기 상태가 됩니다.
* 	각 전화를 상담원에 배분하는 정책은 다음과 같이 여러 방식으로 구현할 수 있습니다.
* 	1) 순서대로 배분하기 : 모든 상담원이 동일한 상담 건수를 처리하도록 들어오는 전화 순서대로 상담원에게 하나씩 배분합니다.
* 	2) 짧은 대기열 찾아 배분하기 : 고객 대기 시간을 줄이기 위해 상담을 하지 않는 상담원이나 가장 짧은 대기열을 보유한 상담원에게 배분합니다.
* 	3) 우선순위에 따라 배분하기 : 고객 등급에 따라 등급이 높은 고객의 전화를 우선 가져와서 업무 능력이 좋은 상담원에게 우선 배분합니다.*/
package com.yedam.java.example;
import java.util.Scanner;

public class ScheduleExample {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scheduler scheduler = null;	//전화 상담 고객(배열이란 표시가 없으므로 클래스 & 인터페이스)
		
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당 ");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당 ");
		
		
		String ch = scanner.next();
		
		//new 연산자를 통해 생성할 수 있는건 일반class
		if("R".equals(ch) || "r".equals(ch) ) {
			//자동 타입 변환
			scheduler = new RoundRobin();	//전화온 차례대로 받는 상담원
		}else if("L".equals(ch) || "l".equals(ch) ) {
			scheduler = new LeastJob();	//쉬고 있거나 대기가 가장 적은 상담원
		}else if("P".equals(ch) || "p".equals(ch)) {
			scheduler = new PriorityAllocation();	//우선순위가 높은 고객을 상대하는 상담원
		}else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		//인터페이스는 기능
		scheduler.getNextCall();		//상담원 : 다음 전화를 어떤걸 가져오는지
		scheduler.sendCallToAgent();	//배분 방법
	}

}
