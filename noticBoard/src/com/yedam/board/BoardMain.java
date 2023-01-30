package com.yedam.board;

import java.util.List;
import java.util.Scanner;

public class BoardMain {
	BoardDAO dao = new BoardDAO();
	Scanner sc = new Scanner(System.in);

	public void boardExe() {

		while (true) {
			System.out.println("1)게시글 목록 | 2)게시글 검색 | 3)게시글 등록 | 4)게시글 수정 | 5)게시글 삭제 | 6)댓글 작성 | 9)종료");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 게시글 목록
				list();

			} else if (menu == 2) {
				// 게시글 검색
				search();

			} else if (menu == 3) {
				// 게시글 등록
				add();

			} else if (menu == 4) {
				// 게시글 수정
				//modify();

			} else if (menu == 5) {
				// 게시글 삭제
				remove();

			} else if (menu == 6) {
				// 댓글 작성

			} else if (menu == 99) {
				// 종료
				break;
			}
		} // end of while()

		System.out.println("End Of Program");
	} // end of boardExe()

	// 목록 조회
	public void list() {
		List<BoardVO> list = dao.boardVoList();
		for (BoardVO board : list) {
			System.out.println(board.toString());
		}
	} // end of List method

	// 단건조회 search()
	public void search() {
		System.out.println("조회 하고싶은 글 번호를 입력 > ");
		int num = sc.nextInt();

		BoardVO board = dao.getBoard(num);
		if (board == null) {
			System.out.println("조회한 게시 글 없음!!");
			return;
		} // 반환유형 : EmpVO

		System.out.println("결과 : " + board);
	} // end of search method
	
	public void add() {

		System.out.println("제목을 입력하세요 > ");
		String title = sc.nextLine();

		System.out.println("내용을 입력하세요 > ");
		String content = sc.nextLine();

		System.out.println("작성자를 입력하세요 > ");
		String user = sc.nextLine();

		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setContent(content);
		board.setUser(user);

		if (dao.addBoard(board) > 0) {
			System.out.println("입력 성공 !!");
		} else {
			System.out.println("처리중 에러!!");
		}

	} // end of add method

	// 수정 modify()
//	public void modify() {
//		System.out.println("게시글 번호 입력 > ");
//		int num = sc.nextInt();
//		System.out.println("변경 할 내용을 선택하세요 1)제목 | 2)내용");
//		int select = sc.nextInt();
//
//		if (select == 1) {
//			
//		}
//		if (boardList.updateEmp(num, sal) > 0) {
//			System.out.println("수정 성공 !!");
//		} else {
//			System.out.println("처리중 에러!!");
//		}
//	} // end of modify method

	// 삭제 remove()
	public void remove() {
		System.out.println("게시글 번호 입력 > ");
		int num = sc.nextInt();

		if (dao.deleteBoard(num) > 0) {
			System.out.println("해당 게시글이 삭제되었습니다");
		} else {
			System.out.println("처리중 에러!!");
		}
	} // end of remove method
	
} // end of class BoardMain
