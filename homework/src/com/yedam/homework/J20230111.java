package com.yedam.homework;

import java.util.Scanner;

public class J20230111 {

	public static void main(String[] args) {
		//주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		
		//문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] == 60) {
				System.out.println("인덱스가 60인 곳은?" + i);
			}
		}
		
		//문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		for(int i = 0; i < arr1.length; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println("배열의 값" + arr1[i]);
		}
		
		//문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
  		//   입력) 인덱스: 3 ->   {10, 20, 30, 1000, 3, 60, -3}
		Scanner sc = new Scanner(System.in);
//		System.out.println("값을 변경하고 싶은 곳을 입력하세요");
//		int index = Integer.parseInt(sc.nextLine());
//		for(int i = 0; i < arr1.length; i++) {
//			arr1[index] = 1000;
//		}
//		System.out.println("1000으로 바뀐 인덱스는?" + index + " " + arr1[index]);
		
		//문제4. 주어진 배열의 요소에서 최대값과 최대값의 위치값(인덱스), 최소값과 최소값의 위치값(인덱스)을 구해보자.
		int max = 0;
		int min = max;
		int maxIndex = 0;
		int minIndex = 0;
		for(int i = 0; i < arr1.length; i++) {
			if(max < arr1[i]) {
				max = arr1[i];
				maxIndex = i;
			} else if(min > arr1[i]) {
				min = arr1[i];
				minIndex = i;
			}
		}
		System.out.println("최대값 " + max + "최대값의 위치는? " + maxIndex);
		System.out.println("최소값 " + min + "최소값의 위치는? " + minIndex);
		
		//문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		int[] scoresArr = null;	//배열 선언 
		int[] mulThreeScores = null;	//점수 저장 
		int score = 0;
		
		System.out.println("몇개의 정수를 입력하실껀가요?");
		int num = Integer.parseInt(sc.nextLine());	//입력 받을 정수의 갯수 정하는 변수 
		
		scoresArr = new int[num];	//배열 크기를 입력받은 num 만큼 정함 
		for(int i = 0; i < num; i++) {
			System.out.println("점수를 입력하세요 > ");
			scoresArr[i] = Integer.parseInt(sc.nextLine());	//배열에 입력받은 정수를 저장 
		}
		for(int i = 0; i < scoresArr.length; i++) {
			if(scoresArr[i] % 3 == 0) {
				System.out.println(scoresArr[i]);
			}
		}
		
		
		
		//[추가 문제]

		// answer 배열에 담긴 데이터를 읽고 각 숫자마다 개수만큼'*'를 찍는다.
		// 아래 빈 영역에 코드를 입력하여 프로그램을 완성하여라

//		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
//		int[] counter = new int[4];
//
//		for (int i = 0; i < answer.length; i++) {
//			/* 해당 부분 코딩 */
//		}
//		for (int i = 0; i < counter.length; i++) {
//			/* 해당 부분 코딩 */
//
//			System.out.println();
//		}
		// ※ 배열의 각 인덱스와 숫자의 연관성을 지으면서 풀어 볼 것.
		// 출력 예시) ***
        //            **
        //            **
    	//            ****

	}

}
