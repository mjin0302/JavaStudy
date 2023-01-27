package com.yedam.test03;

public class Test03 {
	public static void main(String[] args) {
		int[] coinUnit = new int[4];
		int[] coins = {500,100,50,10};

		int money = 3190;
		
		for(int i = 0; i < coinUnit.length; i++) {
			coinUnit[i] += money / coins[i];
			money = money % coins[i];
		}
		
		for(int i = 0; i < coins.length; i++) {
			if(i != coins.length-1) {
		        System.out.print(coins[i] + "원 : " + coinUnit[i] + "개, ");
		    }else {
		        System.out.print(coins[i] + "원 : " + coinUnit[i] + "개");
		    }
		}
	}
	
}
