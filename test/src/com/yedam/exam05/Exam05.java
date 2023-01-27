package com.yedam.exam05;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dice = null;
		int diceSize = 0;
		
		while(true) {
			System.out.println("=================================================================");
			System.out.println("1.주사위 크기 | 2.주사위 굴리기 | 3.결과 보기 | 4.가장 많이 나온 수 | 5.종료");
			System.out.println("=================================================================");
			System.out.println("메뉴번호를 입력하세요> ");
			int selectNo = sc.nextInt();
			
			//1번 메뉴를 선택 했을 때
			if(selectNo == 1) {
				System.out.println("주사위 크기를 입력하세요 > ");
				diceSize = sc.nextInt();
				if(diceSize < 5 || diceSize > 10) {
					diceSize = 0;
					System.out.println("입력한 값이 범위를 벗어났습니다");
					System.out.println("5 ~ 10 사이의 수를 입력하세요 > ");
				}
				dice = new int [diceSize];
			}
			
			//2번 메뉴를 선택 했을 때
			else if(selectNo == 2) {
				int count = 0;
				while(true) {
					int random = (int)(Math.random() * diceSize) + 1;	// +는 첫 시작 번호 *는 diceSize까지
					dice[random - 1]++;
					count ++; //몇번 주사위를 굴렸는지 알아야하기 때문에
					if(random == 5) break;
				}
				System.out.println("5가 나올 때 까지 주사위를 " + count + "번 굴렸습니다.");
			}
			
			//3번 메뉴를 선택 했을 때
			else if(selectNo == 3) {
				for(int i = 0; i < dice.length; i++) {
					System.out.printf("%d은 %d번 나왔습니다.\n", (i+1), dice[i]);
				}
			}
			
			//4번 메뉴를 선택 했을 때
			else if(selectNo == 4) {
				int max = 0;
				for(int num : dice) {
					if(max < num) {
						max = num;
					}
				}
				int i = 0;
				for(; i < dice.length; i++) {
					if(dice[i] == max) break;
				}
				System.out.println("가장 많이 나온 수는 " + (i + 1) + "입니다.");
			}
			
			//5번 메뉴를 선택 했을 때
			else if(selectNo == 5) {
				System.out.println("프로그램 종료");
			}
			sc.close();
		}
		
	}
	
}
