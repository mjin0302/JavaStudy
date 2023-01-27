package com.yedam.array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//배열
		int[] ary;
		//배열의 크기(인덱스 개수)
		int no;
		
		System.out.println("배열의 크기 > ");
		no = Integer.parseInt(sc.nextLine());
		
		ary = new int[no];
		
		System.out.println(ary.length);
		for(int i =0; i<ary.length; i++) {
			System.out.println("입력 > ");
			ary[i] = Integer.parseInt(sc.nextLine());
		}
		
		
		for(int i = 0; i<ary.length; i++) {
			System.out.println(ary[i]);
		}
		
		//최대값, 최소값 구하기
		int max = 0;
		for(int i = 0; i<ary.length;i++) {
			if(ary[i] > max) {
				max = ary[i];
			}
		}
		
		int min = max;
		for(int i = 0; i<ary.length;i++) {
			if(ary[i] < min) {
				min = ary[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
		
		
		

	}

}
