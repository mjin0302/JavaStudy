package yedam.com.java;

import java.util.Scanner;

public class Baek10430 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("첫번째 정수를 입력하세요");
				int A = sc.nextInt();
				System.out.println("두번째 정수를 입력하세요");
		        int B = sc.nextInt();
		        System.out.println("세번째 정수를 입력하세요");
		        int C = sc.nextInt();
		        
		        System.out.println((A + B) % C);
		        System.out.println((A % C + B % C) % C);
		        System.out.println((A * B) % C);
		        System.out.println((A % C * B % C) % C);
		        
			}

}


