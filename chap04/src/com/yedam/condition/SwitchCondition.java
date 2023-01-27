package com.yedam.condition;
import java.util.Scanner;	//scanner객체 생성

public class SwitchCondition {
	
	public static void main(String[] args) {
		int number = (int)((Math.random() * 6) + 1);
		
		//switch는 같으면 실행함(조건식x)
		switch(number) {
		case 1:
			System.out.println("1번 나옴");
			break;
		case 2:
			System.out.println("2번 나옴");
			break;
		case 3:
			System.out.println("3번 나옴");
			break;
		case 4:
			System.out.println("4번 나옴");
			break;
		case 5:
			System.out.println("5번 나옴");
			break;
		default:	//=else랑 같음
			System.out.println("6번 나옴");
			break;
		}
		
		//char
		
		char grade = 'B';
		String grade2 = "b";
		
		switch(grade2) {
		case "A":
			System.out.println("우수 회원");
			break;	//break가 없다면 해당하는 값 아래 case들이 전부다 실행
		case "B":
		case "b":
			System.out.println("일반 회원");
			break;
		default:
			System.out.println("손님");
			break;
		}
		
		//입력한 성적을 등급으로 환산
		Scanner sc = new Scanner(System.in);
		
		//90, 80, 70, 60
		//90 ~ 100 A
		//80 ~ 89 B
		//70 ~ 79 C
		//60 
		System.out.println("입력 > ");
		int scores = Integer.parseInt(sc.nextLine());
		
		switch (scores/10) {
		case 9:	//90 ~ 99
		case 10:
			System.out.println("A등급");
			break;
		case 8:	//80 ~ 89
			System.out.println("B등급");
			break;
		case 7:	//70 ~ 79
			System.out.println("C등급");
			break;
		default:	//그 외
			System.out.println("D등급");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
