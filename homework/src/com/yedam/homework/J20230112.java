package com.yedam.homework;

import java.util.Scanner;

public class J20230112 {
	
	static Products[] proAry = null;	//상품 정보담을 배열 선언 
	static int productNum = 0;	//상품개수 변수
	
	static Scanner sc = new Scanner(System.in);	//Scanner객체 생성
	
	public static int menuSelect() {
		System.out.println("=======================================================");
		System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
		System.out.println("=======================================================");
		System.out.println("메뉴번호를 입력하세요> ");
		int selectNo = Integer.parseInt(sc.nextLine());
		return selectNo;
	}

	public static void main(String[] args) {
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요. 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요. 출력예시) "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		
		while(true) {
			int selectNo = menuSelect();
			
			//1번 메뉴를 선택했을 때 
			if(selectNo == 1) {
				System.out.println("상품 개수 입력 > ");
				productNum = Integer.parseInt(sc.nextLine());
			}
			//2번 메뉴를 선택했을 때
			else if (selectNo == 2) {
				proAry = new Products[productNum];
				for(int i = 0; i < proAry.length; i++) {
					
					proAry[i] = new Products();
					
					System.out.println("상품 이름 입력 > ");
					proAry[i].productName = sc.nextLine();
					System.out.println("상품 가격 입력 > ");
					proAry[i].productPrice = Integer.parseInt(sc.nextLine());
				}
			}
			//3번 메뉴를 선택했을 때
			else if (selectNo == 3) {
				for(Products pro : proAry) {
					pro.getInfo();
				}
			}
			// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
			// 4번 메뉴를 선택했을 때
			else if (selectNo == 4) {
				int max = 0;
				int maxIndex = 0;
				int priceSum = 0;
				for(int i = 0; i <proAry.length; i++) {
					if(max < proAry[i].productPrice) {
						max = proAry[i].productPrice;
						maxIndex = i;
					}
				}
				for(int i = 0; i < proAry.length; i++) {
					if(i == maxIndex) {
						continue;
					} 
					priceSum += proAry[i].productPrice;
				}
				System.out.println("최고 가격의 상품을 제외한 나머지 총 합 : " + priceSum + "원");
			}
			//5번 메뉴를 선택했을 때
			else if (selectNo == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
	}

}
