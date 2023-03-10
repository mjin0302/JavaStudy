package com.yedam.loop;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		//for문
		
//		for(int i = 0; i <= 100; i++) {
//			System.out.println(i);
//		}
//		
//		//1부터 100까지의 합
//		int result = 0;
//		for(int i = 1; i <= 100; i++) {
//			result += i;
//		}
//		System.out.println("1 ~ 100까지의 합 : " + result);
//		
//		//1~100사이의 짝수 구하기
//		//짝수 성질 => 2로 나누었을때 0으로 떨어지면 짝수.
//		for(int i = 0; i <= 100; i++) {
//			if(i % 2 == 0) {
//				System.out.println(i + "는 짝수");
//			}
//		}
//		
//		for(int i = 0; i <= 100; i++) {
//			if(!(i % 2 == 0)) {
//				System.out.println(i + "는 홀수");
//			}
//		}
		
		//입력한 숫자에 대한 구구단 출력
		//스캐너를 활용해서 값을 하나 입력받음
		//입력 받은 값에 대한 구구단 출력
		//2를 입력 -> 2 * 1 = 2....2 * 9 = 18
		Scanner sc = new Scanner(System.in);
//		System.out.println("구구단 입력 > ");
//		int gugu = Integer.parseInt(sc.nextLine());
//		
//		for(int i = 1; i <= 9; i++) {
//			System.out.println(gugu + " * " + i + " = " + (gugu*i));
//		}
		
		//입력한 값에 대한 총 합, 평균, 최대값, 최소값
		//스캐너를 -> 데이터 입력받음
		//데이터 받을 개수 -> 5
		//데이터 입력 횟수가 5번 : 1, 20, 40, 30, 10
		//총 합 : 값을 입력 받을 때마다 변수에 저장
		//평균 : 총 합 / 개수
		//최대값 : 입력 할 때 마다 비교 최대값인지 아닌지 확인
		//최소값 : 입력 할 때 마다 비교 최소값인지 아닌지 확인
		System.out.println("데이터 받을 개수를 입력하세요");
		int data = Integer.parseInt(sc.nextLine());	//입력할 데이터 개수 입력 받음
		int total = 0;
		int avg = 0;
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < data; i++) {
			System.out.println("입력 > ");	
			int input = Integer.parseInt(sc.nextLine());	//데이터 입력
			total += input;	//입력받은 총 합 구하기
			
			//최대값, 최소값 초기화
			if(i == 0) {
				max = input;
				min = input;
			}
			//최대값
			if(input > max) {
				max = input;
			}
			//최소값
			if (input < min) {
				min = input;
			}
		}
		System.out.println("총 합 : " + total);
		// 반복문에서 총 합, 입력받은 개수를 활용해서 평균구하기
		System.out.printf("평균 : %5.2f \n", (double)total/data);	 // = System.out.println((double)avg/data);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		//2번문제) up and down
		//임의의 랜덤값(1~100) 추출하여 5번의 기회안에 해당 랜덤값을 맞추는 프로그램을 구현해라
		// 1 ~ 100 랜덤 추출
		int randomNo = (int)(Math.random()*100) + 1;
		for(int i = 0; i < 5; i++) {
			System.out.println("Up & Down>>");
			int num = Integer.parseInt(sc.nextLine());
			
			if(randomNo == num) {
				System.out.println("정답입니다");
				break;
			} else if(randomNo > num) {
				System.out.println("더 큰 수 입력");
			} else {
				System.out.println("더 작은 수 입력");
			}
			
			if(i==4) {
				System.out.println("5번의 기회를 다 소진 하였습니다");
			}
		}
	}

}
