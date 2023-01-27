package com.yedam.array;

import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
		//한 학생의 성적을 입력
		//과목 수를 저장하는 변수
		int subjectNum = 0;	//과목수 변수
		int[] scores = null;	//과목 점수 변수
		
		Scanner sc = new Scanner(System.in);	//스캐너 생성
		
		while (true) {
			System.out.println("============================================================");
			System.out.println("1.과목수 | 2.점수입력 | 3. 점수 리스트 | 4.분석 | 5.종료");
			System.out.println("============================================================");
			System.out.println("메뉴 입력 > ");
			
			int selectNo = Integer.parseInt(sc.nextLine());	//메뉴 선택 변수
			
			if(selectNo == 1 ) {
				System.out.println("몇 과목 인가요? > ");
				subjectNum = Integer.parseInt(sc.nextLine());
			} 
			//2번 메뉴를 선택했을 때
			else if (selectNo == 2) {
				scores = new int[subjectNum];	//배열에 얼마나 값을 저장할 것인지 배열 크기 설정
				for(int i = 0; i < subjectNum; i++) {
					System.out.println("점수를 입력하세요 > ");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			//3번 메뉴를 선택 했을 때
			} else if (selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("점수는 : " + scores[i]);
				}
			//4번 메뉴를 선택 했을 때	
			} else if (selectNo == 4) {
				//총합, 평균 구하기
				int sum = 0;
				for(int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				System.out.println("총 합 : " +  sum);
				System.out.println("평균 : " + ((double)sum/subjectNum));
			} else if (selectNo == 5) {
				System.out.println("end of prog");
			}
			
		}

	}

}
