package com.yedam.object;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		//클래스 생성해서 객체 만든 다음 객체 바로 사용
		//객체를 한 곳에 모아서 관리하는 형태
		//배열
		//int[] ary = new int[4];
		//Student[] stdAry = new Student[10];
		
		//학생 정보 보관하는 배열
		Student[] stdAry = null;	//학생 정보를 저장할 배열
		//Student std = new Student();
		
		int stdNum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//while문을 활용해서 학생 관리 프로그램 작성
		while(true) {
			System.out.println("==================================================");
			System.out.println("1.학생 수 | 2.정보 입력 | 3.정보 확인 | 4.분석 | 5.종료");
			System.out.println("==================================================");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			//1번 메뉴 선택했을 때
			if(selectNo == 1 ) {
				//Student 클래스로 만들어지는 객체를 몇개나 배열에 넣을지에 대한 값을 받아옴
				System.out.println("학생 수를 입력하세요 > ");
				stdNum = Integer.parseInt(sc.nextLine());
			} 
			//2번 메뉴 선택했을 때
			else if(selectNo == 2) {
				stdAry = new Student[stdNum];	//stdAry배열 크기 정하기
				for(int i = 0; i < stdAry.length; i++) {
					//객체 배열에 각 인덱스에 존재하는 student객체에게
					//데이터를 제공하기 위해서 임시 객체를 만듦.
					//Student std = new Student();
					//stdAry[i].name = "김또치";
					
					stdAry[i] = new Student();	//Student s1 = new Student();
					System.out.println("이름 > ");
					stdAry[i].name = sc.nextLine();
					System.out.println("나이 > ");
					stdAry[i].age = Integer.parseInt(sc.nextLine());
					System.out.println("학교 이름 > ");
					stdAry[i].schoolName = sc.nextLine();
					
					//성적 입력
					System.out.println("국어 > ");
					stdAry[i].kor = Integer.parseInt(sc.nextLine());
					System.out.println("영어 > ");
					stdAry[i].eng = Integer.parseInt(sc.nextLine());
					System.out.println("수학 > ");
					stdAry[i].math = Integer.parseInt(sc.nextLine());
				}
				
			} 
			//3번 메뉴 선택했을 때
			else if(selectNo == 3) {
				for(Student std : stdAry) {
					std.getInfo();
				}
			} 
			//4번 메뉴 선택했을 때
			else if(selectNo == 4) {
				//총합, 평균
				int total = 0;
				double avg = 0;
				System.out.println("한 학생 총합 / 평균 조회");
				for(int i = 0; i < stdAry.length; i++) {
					total = stdAry[i].kor + stdAry[i].eng + stdAry[i].math;
					avg = total / 3.0;
					System.out.println(stdAry[i].name + "번째 학생 > ");
					System.out.println("총 합 : " + total + "평균 : " + avg);
				}
				
				// 점수가 젤 높은 과목, 점수가 젤 낮은 과목 확인
				int max = 0;
				int min = 0;
				
				for(int i = 0; i < stdAry.length; i++) {
					max = stdAry[i].kor;	//디폴트 값이 국어값
					min = stdAry[i].kor;	//디폴트 값이 국어값
					if(stdAry[i].eng < stdAry[i].math) { //수학이 영어보다 클때
						if(max < stdAry[i].math) {	//국어와 수학을 비교
							max = stdAry[i].math;	//수학이 최고값
						}
					} else {	//영어가 수학보다 클때
						if(max < stdAry[i].eng) {	//국어와 영어를 비교 -> 영어가 더 클때
							max = stdAry[i].eng;	//영어가 최고값
						}
					}
					System.out.println(stdAry[i].name + "최고 성적 : " + max);
				}
			}
			//5번 메뉴 선택했을 때
			else if(selectNo == 5) {
				System.out.println("프로그램 종료");
				break;
				
			}
		}
		
//		Student s1 = new Student();	//생성자, Student는 설계도, s1은 인스턴스(설계도를 통해 만들어진 객체)
//		Student s2 = new Student();
		
//		System.out.println(s1);
//		System.out.println(s2);
		
		//dot 연산자(점)
		//필드 정보입력
//		s1.age = 20;
//		s1.name = "예담";
//		s1.schoolName = "예담대학교";
//				
//		s1.getInfo();
//		
//		s2.age = 30;
//		s2.name = "대예담";
//		s2.schoolName = "예담대학원";
//		
//		s2.getInfo();
		
//		s1.getInfo();
//		
//		s1.age = 20;
//		s1.name = "대학생";
//		
//		System.out.println("학생의 나이 : " + s1.age);
//		System.out.println("학생의 이름 : " + s1.name);
//		System.out.println("재학중인 학교 : " + s1.schoolName);
		
//		Korean k1 = new Korean("김또치", "001111-0147852");
//		
//		System.out.println("k1이 가지고 있는 필드 값 >");
//		System.out.println(k1.nation);
//		System.out.println(k1.name);
//		System.out.println(k1.ssn);
	}

}
