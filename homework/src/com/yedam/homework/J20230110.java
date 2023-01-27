package com.yedam.homework;

import java.util.Scanner;

public class J20230110 {

	public static void main(String[] args) {
		// 문제1) 차례대로 x와 y의 값이 주어졌을 때 어느 사분면에 해당되는지 출력하도록 구현하세요.
		// 각 사분면에 해당 하는 x와 y의 값은 아래를 참조하세요.
		// 제1사분면 : x>0, y>0
		// 제2사분면 : x<0, y>0
		// 제3사분면 : x<0, y<0
		// 제4사분면 : x>0, y<0
		Scanner scanner = new Scanner(System.in);
		System.out.println("x값 입력하고 > ");	
		int x = Integer.parseInt(scanner.nextLine());
		System.out.println("y값 입력하기 > ");	
		int y = Integer.parseInt(scanner.nextLine());
		if (x>0 && y>0) {
			System.out.println("제1사분면");
		} else if(x<0 && y>0) {
			System.out.println("제2사분면");
		} else if(x<0 && y<0) {
			System.out.println("제3사분면");
		} else {
			System.out.println("제4사분면");
		}
		
		// 문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
		// 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.
		// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며,
		// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
		System.out.println("년도 입력해 > ");	
		int year = Integer.parseInt(scanner.nextLine());
		if(year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0) {
			System.out.println("윤년임");
		} else {
			System.out.println("윤년아님");
		}
		
		// 문제3) switch문을 이용하여 가위, 바위, 보 중 하나가 주어졌을 때 사용자 어떤 값을 가져야 이길 수 있는 지를 출력하도록 구현하세요.
		// 예를 들어, 가위가 주어졌을 때 "이기기 위해선 바위를 내야합니다." 라고 출력하도록 하세요.
		// 한 단어를 입력받을 경우 Scanner객체의 next() 함수를 사용하면 됩니다.
		
		System.out.println("가위, 바위, 보 중에 선택 > ");
        String game = scanner.next();
        
        switch (game) {
		case "가위":
			System.out.println("이기기 위해서는 바위 내기~");
			break;
		case "바위":
			System.out.println("이기기 위해서는 보 내기~");
			break;
		default:
			System.out.println("이기기 위해서는 가위 내기~");
			break;
		}
        
		
		// *		1줄 1개
		// **		2줄 2개
		// ***		3줄 3개
		// ****		4줄 4개
		// *****	5줄 5개 
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
        // 문제4) for문과 "*"를 이용하여 아래와 같이 출력하도록 하세요.
     	// hint) 중첩 for문과 if문(띄어쓰기용도) 활용
     	//     *	//1줄 4칸띄우고 1개
     	//    **	//2줄 3칸띄우고 2개
     	//   ***	//3줄 2칸띄우고 3개
     	//  ****	//4줄 1칸띄우고 4개
     	// *****	//5줄 없고 5개
        
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4-i; j++) {	//공백 찍기
				System.out.print(" ");
			}
			for(int j = 0; j < i+1; j++) {	//별 찍기 
				System.out.print("*");
			}
			System.out.println();
		}
        
        // 문제5) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
     	// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
     	// 2 X 1 = 2
     	// 2 X 2 = 4
     	// 2 X 3 = 6
		System.out.println("구구단을 외자 몇단 원해 ~ ?");
		int m = Integer.parseInt(scanner.nextLine());
		System.out.println("몇번째 까지를 원해 ~ ?");
		int n = Integer.parseInt(scanner.nextLine());
		
		for(int i=1; i <= n; i++) {
			System.out.println(m + " * " + i + " = " + (m * i));
		}
	}

}
