package com.yedam.loop;

public class LoopCondition {
	public static void main(String[] args) {
		//while break;
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j<=10; j++) {
				if(j == 5) {
					System.out.println("i + j = " + (i + j));
					break;
				} else {
					System.out.println(j);
				}
			}
		}
		
		//for문 label break;
		//for문의 이름(라벨)을 Outter이라고 지어줌
		Outter : for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;	//Outter라는 라벨을 가지고 있는 반복문을 종료시킴
				}
			}
		}
		
		//continue
		for(int i = 0; i<=10; i++) {
			if(i%2 == 0) {
				continue;	//continue를 만나자마자 다시 올라감
			}
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
