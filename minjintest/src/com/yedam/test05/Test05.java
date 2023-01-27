package com.yedam.test05;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = null;
		
		while(true) {
			System.out.println("=================================================================");
			System.out.println("1.주사위 크기 | 2.주사위 굴리기 | 3. 결과 보기 | 4.가장 많이 나온 수 | 5.종료");
			System.out.println("=================================================================");
			System.out.println("메뉴 입력 > ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			//1번 메뉴를 선택 했을 때
			if(selectNo == 1) {
				int dice = 0;
				dice = sc.nextInt();
				do {
					System.out.println("주사위 크기를 입력하세요(5~10사이) > ");
					dice = sc.nextInt();
					
					if(dice < 5 || dice > 10) {
						System.out.println("범위를 벗어났습니다 다시 입력 하세요.");
					}
				} while(dice < 5 || dice > 10);	
			}
			
			//2번 메뉴를 선택 했을 때
			else if(selectNo == 2) {
				
			}
			
			//2번 메뉴를 선택 했을 때
			else if(selectNo == 3) {
				
			}
			
			//2번 메뉴를 선택 했을 때
			else if(selectNo == 4) {
				
			}
			
			//2번 메뉴를 선택 했을 때
			else if(selectNo == 5) {
				System.out.println("프로그램 종료");
			}
		}
	}

}
