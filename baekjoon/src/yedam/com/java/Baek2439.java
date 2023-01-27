package yedam.com.java;

import java.util.Scanner;

public class Baek2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num - i; j++) {	//공백 찍기
				System.out.print(" ");
			}
			for(int k = 0; k < i + 1; k++) {	//별 찍기 
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
