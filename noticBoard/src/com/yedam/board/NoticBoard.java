package com.yedam.board;

import java.util.Scanner;

public class NoticBoard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1)게시글 목록 | 2)게시글 등록 | 3)게시글 수정 | 4)게시글 상세조회 | 5)댓글 작성 | 99)종료");

			int menu = sc.nextInt();

			if (menu == 1) {
				// 삭제
				//remove();
			} else if (menu == 2) {
				// 수정
				//modify();
			} else if (menu == 3) {
				// 입력
				//add();
			} else if (menu == 4) {
				// 단건조회
				//search();
			} else if (menu == 5) {
				// 목록조회
				//list();
			} else if (menu == 99) {
				// 종료
				break;
			}
		} // end of while()

		System.out.println("End Of Program");
	}

}
