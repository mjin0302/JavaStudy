package com.yedam.exam03;

public class Exam03 {

	public static void main(String[] args) {
		int[] coinUnit = new int[4];	//각 금액별 동전개수
		int money = 2680;
		
		System.out.println("money = " + money);
		for(int i = 0; i < coinUnit.length; i++) {
			if(money >= 500) {	
				coinUnit[i] = money / 500;	//500원이 몇개가 필요한가?
				money = money % 500;	//500원으로 바꾸고 난 나머지 금액
				//money = money - (coinUnit[i] * 500);
				System.out.println("500원 : " + coinUnit[i] + "개");
			} else if(money >= 100) {
				coinUnit[i] = money / 100;	//100원이 몇개가 필요한가?
				money = money % 100;	//100원으로 바꾸고 난 나머지 금액
				System.out.println("100원 : " + coinUnit[i] + "개");
			} else if(money >= 50) {
				coinUnit[i] = money / 50;	//50원이 몇개가 필요한가?
				money = money % 50;		//50원으로 바꾸고 난 나머지 금액
				System.out.println("50원 : " + coinUnit[i] + "개");
			} else if(money >= 10) {
				coinUnit[i] = money / 10;	//10원이 몇개가 필요한가?
				money = money % 10;		//10원으로 바꾸고 난 나머지 금액
				System.out.println("10원 : " + coinUnit[i] + "개");
			}
		}
		
	}

}
