package com.yedam.print;

import java.io.IOException;
import java.util.Scanner;	//scanner기능을 쓰기위해서

public class KeyCode {
	public static void main(String[] args) throws IOException {
		//하나의 문자만 받아올때 keyCode사용 가능
		int keyCode = 0;
		
		System.out.println("입력>");
		
		keyCode = System.in.read();	//문자만 받을 수 있음(문자열x)
		System.out.println("keyCode : " + keyCode);	//입력받은 값의 키코드를 읽음
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);	//enter도 키코드가 존재함 CR=13(행을 내리는것)

		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);	//enter도 키코드가 존재함 LF=10(맨 앞으로 가는것)
		
		//Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력>");
		
		//scanner.nextLine() => enter키 이전까지 데이터를 받아오세요
		String inputDate = scanner.nextLine();
		//scanner.nextInt()	//enter값이 남아있어서 오류발생 쓰지 않는게 좋음
		System.out.println("Scanner 활용 : " + inputDate);

		//기본 타입, == (1 == 1, 1.2 == 1.3)
		//inputDate.equals => 문자열 내용 비교
		if(inputDate.equals("yedam")) {
			System.out.println("yedam과 일치합니다.");
		}
		
		
		
		
		
		
	}
}
