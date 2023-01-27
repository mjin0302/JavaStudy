package com.yedam.java;

import java.util.Scanner;

public class ProductProgram {
	
	public ProductProgram() {
		Scanner sc = new Scanner(System.in);
		Product[] list = null;
		int productNum = 0;
		
		boolean run = true;
		while(run) {
			System.out.println("=== 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료 ===");
			System.out.println("선택 > ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.println("상품 수 > ");
				productNum = Integer.parseInt(sc.nextLine());
				list = new Product[productNum];
			} else if(selectNo == 2) {
				for(int i = 0; i < list.length; i++) {
					System.out.println("상품명을 입력하세요 > ");
					String name = sc.nextLine();
					System.out.println("상품 가격을 입력하세요 > ");
					int price = Integer.parseInt(sc.nextLine());
					
					Product product = new Product(name, price);
					
					list[i] = product;
				}
				
			} else if(selectNo == 3) {
				for(Product product : list) {
					System.out.printf("%s : %d\n", product.getProName(), product.getProPrice());
				}
				
			} else if(selectNo == 4) {
				int max = 0;
				int productIndex = 0;
				for(int i=0; i < list.length; i++) {
					Product product = list[i];
					if(max < product.getProPrice()) {
						max = product.getProPrice();
						
						productIndex = i;
					}
				}
				
				int sum = 0;
				for(int i=0; i < list.length; i++) {
					if(i == productIndex)  continue;
					Product product = list[i];
					sum += product.getProPrice();
				}
				System.out.println("최고 가격을 가진 제품은 " + list[productIndex].getProName() + "입니다.");
				System.out.println("최고 가격을 제외한 제품들의 합 " + sum + "입니다.");
				
				
			} else if(selectNo == 5) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			} else {
				System.out.println("메뉴를 잘못 선택 했습니다.");
			}
			
		}
		
	}
	
}
