package com.yedam.loop;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		//1 ~ 100 사이의 2의 배수
		int i = 1;
		while(i<=100) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		//계산기 프로그램
		//무한 루프 조건으로 프로그램 실행
		//event(trigger) 프로그램 종료 -> break;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 종료");
			System.out.println("입력 > ");
			
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num ) {
			case 1:
				System.out.println("더하고자 하는 두 수를 입력 > ");
				System.out.println("1 > ");
				int num1 = Integer.parseInt(sc.nextLine());
				System.out.println("2 > ");
				int num2 = Integer.parseInt(sc.nextLine());
				int result = num1 + num2;
				System.out.println(num1 + " , " + num2 + "의 결과" + result);
				break;
			case 2:
				System.out.println("빼고자 하는 두 수를 입력 > ");
				System.out.println("1 > ");
				int num3 = Integer.parseInt(sc.nextLine());
				System.out.println("2 > ");
				int num4 = Integer.parseInt(sc.nextLine());
				int result2 = num3 - num4;
				System.out.println(num3 + ", " + num4 + "의 결과 = " + result2);
				break;
			case 3:
				System.out.println("곱하기 하고싶은 두 수 입력");
				System.out.println("1 > ");
				int num5 = Integer.parseInt(sc.nextLine());
				System.out.println("2 > ");
				int num6 = Integer.parseInt(sc.nextLine());
				int result3 = num5 * num6;
				System.out.println(num5 + ", " + num6 + "의 결과 = " + result3);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("1~4사이 수를 입력해주세요");
				break;
			}
		}
		System.out.println("end of prog");
		
		// 게임 만들기
		// 컴퓨터와 가위, 바위, 보
		// 앞, 뒤 맞추기
		// 한 판에 500원
		// 내가 넣은 금액만큼 게임을 할 수 있도록
		// 어떤 반복문? 어떤 변수? 가위, 바위, 보 어떻게 조건식 생각해서 만들까?
		// for, while, do-while 적절한 반복문 생각 //변수생각 //logic(알고리즘)생각
		int money;
		System.out.println("=====Insert Coin=====");
		money = Integer.parseInt(sc.nextLine());
		
		//10000 -> 20번
		//1500 -> 3번
		boolean flag = true;	//강제 종료하기 위한 변수
		// money > 500		flag
		while(money > 500 && flag) {	//500원 보다 클 때 && flag가 true 일 때
			System.out.println((money/500) + "번의 기회가 남았습니다.");
			System.out.println("1. 가위바위보 | 2. 앞 뒤 맞추기 | 3. 종료");
			
			System.out.println("입력 > ");
			int gameNo = Integer.parseInt(sc.nextLine());
			
			switch (gameNo) {
			case 1:
				//컴퓨터와 가위, 바위, 보
				//가위 -> 1
				//바위 -> 2
				//보  -> 3
				//컴픁가 내는 가위, 바위, 보 => 랜덤 값 추출
				//입력 한 값이랑 비교해서 이겼다, 졌다, 비겼다.
				//사용자들은 가위, 바위, 보로 입력 || String.equals(내용)
				System.out.println("가위, 바위, 보 중에서 하나를 입력하세요.");
				String rsp = sc.nextLine();
				//가위 -> 1, 바위 -> 2, 보  -> 3 (1~3)
				int randomNo = (int)(Math.random()*3)+1;
				
				//사용자가 가위를 냈을때
				if(rsp.equals("가위")) {
					//사용자 : 가위, 컴퓨터 : 1 (가위)
					if(randomNo == 1) {
						System.out.println("비겼다.");
					} 
					//사용자 : 가위, 컴퓨터 : 2 (바위)
					else if(randomNo == 2) {
						System.out.println("졌다.");
					} 
					//사용자 : 가위, 컴퓨터 : 3 (보)
					else if(randomNo == 3) {
						System.out.println("이겼다.");
					}
				} 
				//사용자가 바위를 냈을때
				else if(rsp.equals("바위")) {
					//사용자 : 바위, 컴퓨터 : 1 (가위)
					if(randomNo == 1) {
						System.out.println("이겼다.");
					} 
					//사용자 : 바위, 컴퓨터 : 2 (바위)
					else if(randomNo == 2) {
						System.out.println("비겼다.");
					} 
					//사용자 : 바위, 컴퓨터 : 3 (보)
					else if(randomNo == 3) {
						System.out.println("졌다.");
					}
				} 
				//사용자가 보를 냈을때
				else if(rsp.equals("보")) {
					//사용자 : 보, 컴퓨터 : 1 (가위)
					if(randomNo == 1) {
						System.out.println("졌다.");
					} 
					//사용자 : 보, 컴퓨터 : 2 (바위)
					else if(randomNo == 2) {
						System.out.println("이겼다.");
					} 
					//사용자 : 보, 컴퓨터 : 3 (보)
					else if(randomNo == 3) {
						System.out.println("비겼다.");
					}
				}
				money -= 500;
				break;
			case 2:
				//컴퓨터와 앞, 뒤 맞추기
				//앞=0, 뒤=1
				System.out.println("앞, 뒤 선택하세요.");
				System.out.println("입력 > ");
				String Fb = sc.nextLine();
				int randomFb = (int)(Math.random()*2);	//0 < x > 2
				
				if(Fb.equals("앞")) {
					if(randomFb == 0) {
						System.out.println("정답.");
					} else if (randomFb == 1) {
						System.out.println("땡 ~~ ");
					}
				} else if (Fb.equals("뒤")) {
					if(randomFb == 0) {
						System.out.println("땡 ~~ ");
					} else if (randomFb == 1) {
						System.out.println("정답.");
					}
				}
				money -= 500;
				break;
			case 3:
				//종료...1) 투입 금액이 소진이 다 되었을때
				//		2) 강제 종료
				flag = false;
				
				break;
			default:
				System.out.println("없는 메뉴입니다. 다시 입력하세요.");
				break;
			}
			//money가 200or300원 500원 미만일때(money == 499)는 게임을 할수 없기때문에 (money < 500)
			if(money < 500) {
				System.out.println("money 충전충전충전");
			}
		}
		System.out.println("게임 종료.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
