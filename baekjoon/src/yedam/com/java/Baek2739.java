package yedam.com.java;

import java.util.Scanner;

public class Baek2739 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("구구단을 외자 몇단 원해 ~ ?");
		int n = Integer.parseInt(scanner.nextLine());
		
		for(int i=1; i <= 9; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}

	}

}
