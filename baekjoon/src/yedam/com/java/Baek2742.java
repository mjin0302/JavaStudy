package yedam.com.java;

import java.util.Scanner;

public class Baek2742 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = Integer.parseInt(sc.nextLine());
		
		for( int i = n; i > 0 ; i-- ) {
			System.out.println(i);
		}

	}

}
