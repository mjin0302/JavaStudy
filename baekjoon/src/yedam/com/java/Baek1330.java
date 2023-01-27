package yedam.com.java;

import java.util.Scanner;

public class Baek1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요");
		int a = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요");
        int b = sc.nextInt();
        
        if(a > b){
            System.out.println(">");
        } else if(a < b) {
            System.out.println("<");
        } else if(a == b) {
            System.out.println("==");
        }

	}

}
