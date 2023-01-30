package com.yedam.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import com.yedam.EmpVO;

public class DevBoard {

	public static Scanner sc = new Scanner(System.in);
	public static Member member = null;
	public static MemberDAO memberDAO = new MemberDAO();
	public static Board board = null;
	public static BoardDAO boardDAO = new BoardDAO();
	public static int menuNo = 0;
	private static String loginUserId = null;
	public static List<Board> list = new ArrayList<>();
	
	public static void main(String[] args) {
		mainPage();
	}
	
	// 메인페이지
	public static void mainPage() {
		boolean flag = true;
		
		while(flag) {
			mainMenu();
			menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo){
				case 1:
					// 회원가입
					signUp();
					continue; // 완료후 처음으로
					
				case 2:
					// 로그인
					boolean loginSuccess = login();
					if(loginSuccess) {
						// 로그인완료후 => 로그인 성공시 들어가는 메뉴로
						loginSuccessPage();
						
					}else {
						// 로그인 실패시
						continue;
					}
					
				case 99:
					System.out.println("프로그램 종료");
					return;
			}
		}
	}
	
	// 로그인 성공시 나타나는 홈페이지
	public static void loginSuccessMenu() {
		System.out.println();
		
		System.out.println("");
		System.out.println("");
		System.out.println("\t██████╗ ███████╗██╗   ██╗\r\n"
				+ "\t██╔══██╗██╔════╝██║   ██║\r\n"
				+ "\t██║  ██║█████╗  ██║   ██║\r\n"
				+ "\t██║  ██║██╔══╝  ╚██╗ ██╔╝\r\n"
				+ "\t██████╔╝███████╗ ╚████╔╝ \r\n"
				+ "\t╚═════╝ ╚══════╝  ╚═══╝  \r\n"
				+ "\t                        ");
		
		System.out.println();
		System.out.println("*********** [" + loginUserId + "]님 반갑습니다. ***********");
		System.out.println("*\t\t  \t\t\t*");
		System.out.println("*\t\t 메뉴 ▼ \t\t\t*");
		System.out.println("*\t\t  \t\t\t*");
		System.out.println("*\t      1. 게시판 보기 \t\t*");
		System.out.println("*\t      2. 게시글 작성 \t\t*");
		System.out.println("*\t      3. 게시글 단건조회 \t\t*");
		System.out.println("*\t      4. 마이페이지 \t\t*");
		System.out.println("*\t      5. 로그아웃 \t\t\t*");
		System.out.println("*\t      99. 프로그램종료 \t\t*");
		System.out.println("*\t\t  \t\t\t*");
		System.out.println("*\t\t  \t\t\t*");
		System.out.println("*****************************************");
		
//		System.out.println("********************* [" + loginUserId + "]님 반갑습니다. ************************");
//		System.out.println("*\t\t\t\t\t\t\t\t*");
//		System.out.println("*\t\t\t\t\t\t\t\t*");
//		System.out.println("*\t\t\t    메뉴▼\t\t\t\t\t*");
//		System.out.println("*\t\t\t\t\t\t\t\t*");
//		System.out.println("*\t\t\t1. 게시판 보기\t\t\t\t*");
//		System.out.println("*\t\t\t2. 게시글 작성\t\t\t\t*");
//		System.out.println("*\t\t\t3. 게시글 단건조회\t\t\t\t*");
//		System.out.println("*\t\t\t4. 마이페이지\t\t\t\t*");
//		System.out.println("*\t\t\t5. 로그아웃\t\t\t\t*");
//		System.out.println("*\t\t\t99. 프로그램종료\t\t\t\t*");
//		System.out.println("*\t\t\t\t\t\t\t\t*");
//		System.out.println("*\t\t\t\t\t\t\t\t*");
//		System.out.println("*****************************************************************");
		System.out.print("메뉴를 선택해주세요>> ");
	}
	
	// 게시글 작성 페이지
	public static void post() {
		
		// 게시글 작성
		System.out.println();
		String leftAlignFormat = "| %20s ";
		System.out.format("+---------------------------------------+%n");
		System.out.format(leftAlignFormat, "게시글 작성 페이지");
		System.out.format(" %-12s |%n"," ");
		System.out.format("+---------------------------------------+%n");
		System.out.print("제목>> ");
		String title = sc.nextLine();
		
		System.out.print("개발언어>> ");
		String language = sc.nextLine();
		
		System.out.print("내용>> ");
		String content = sc.nextLine();
		
		System.out.print("게시글을 등록하시겠습니까?(Y/N)>> ");
		String postStr = sc.nextLine();

		switch(postStr) {
			case "Y" :
			case "y" :
				// Y시
				board = new Board(loginUserId, language, title, content);
				boardDAO.boardInsert(board);
				System.out.println("게시글이 등록되었습니다");
				System.out.print("홈페이지로 돌아가고싶다면 y 또는 Y를 눌러주세요>> ");
				String yesNo = sc.nextLine();
				switch(yesNo){
					case "y":
					case "Y":
						break;
				}
				// 다시 메뉴목록 보이게하기 System.out.println("1. 게시글작성 | 2. 조회할 게시글");
				break;
			case "N" :
			case "n" :
				// N시
				System.out.println("게시글 등록을 취소하셨습니다.");
				System.out.print("홈페이지로 돌아가고싶다면 y 또는 Y를 눌러주세요>> ");
				yesNo = sc.nextLine();
				switch(yesNo){
					case "y":
					case "Y":
						break;
				}
				// 다시 메뉴목록 보이게하기 System.out.println("1. 게시글작성 | 2. 조회할 게시글");
				break;
		}
	}
	
	// 로그인 성공시 입장하는 페이지
	public static void loginSuccessPage() {

		while(true) {
			
			loginSuccessMenu();
			menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
				case 1:
					// 게시물 출력
					printBoard();
					break;
				case 2:
					// 게시글 작성
					// 1. 게시글 작성
					post();
					break;
				case 3:
					// 게시글 자세히 보기(단건조회)
					// 2. 조회할 게시글
					printBoardInfo();
					break;
				case 4:
					// 마이페이지
					myPage();
					break;
				case 5:
					// 로그아웃
					System.out.println();
					String leftAlignFormat = "| %20s ";
					System.out.format("+---------------------------------------+%n");
					System.out.format(leftAlignFormat, "로그아웃 페이지");
					System.out.format(" %-12s |%n"," ");
					System.out.format("+---------------------------------------+%n");
					System.out.println("로그아웃 되셨습니다.");
					System.out.print("메인페이지로 돌아가고싶다면 y 또는 Y를 눌러주세요>> ");
					
					String yesNo = sc.nextLine();
					switch(yesNo){
						case "y":
						case "Y":
							break;
					}
					
					System.out.println("메인 페이지로 이동합니다");
					mainPage();
				case 99:
					// 프로그램 종료
					return;
			}
		}
	}
	
	// 마이페이지
	public static void myPage() {
		System.out.println();
		String leftAlignFormat = "| %20s ";
		System.out.format("+---------------------------------------+%n");
		System.out.format(leftAlignFormat, "MyPage");
		System.out.format(" %-15s |%n"," ");
		System.out.format("+---------------------------------------+%n");
		System.out.println("1. 내가 작성한 글목록보기 | 2. 수정 | 3. 삭제 | 4. 홈페이지로 돌아가기");
		System.out.print("메뉴를 선택하세요>> ");
		int myPageNo = sc.nextInt();
		sc.nextLine();
		
		switch(myPageNo) {
		case 1:
			// 내가 작성한 글목록보기
			myPagePrint();
			myPage();
			break;
		case 2:
			// 수정
			updateBoard();
			myPage();
			break;
			
		case 3:
			//삭제
			deleteBoard();
			myPage();
			break;
		case 4:
			// loginSuccessPage()로 돌아감
			break;
		}
	}
	
	
	// 게시글 수정 페이지
	public static void updateBoard() {
		System.out.println();
		String leftAlignFormat = "| %20s ";
		System.out.format("+---------------------------------------+%n");
		System.out.format(leftAlignFormat, "게시글 수정 페이지");
		System.out.format(" %-12s |%n"," ");
		System.out.format("+---------------------------------------+%n");
		myPagePrint2();
		System.out.print("수정할 글번호를 입력하세요>> ");
		int updateNo = sc.nextInt();
		sc.nextLine();
		
		// 이전에 작성한글 화면에 나타내기(단건조회)
		board = boardDAO.selectOne(updateNo);
		
		if(board == null) {
			System.out.println("조회된 게시글이없습니다");
		}else {
			System.out.println();
			System.out.println("#########################################");
			System.out.println("제목 : " + board.getBoardTitle());
			System.out.println("개발언어 : " + board.getBoardLanguage() );
			System.out.println("작성일자 : " + board.getBoardDate());
			System.out.println("작성자(ID) : " + board.getBoardUserId());
			System.out.println("조회수 : " + board.getBoardView());
			System.out.println("내용 : " + board.getBoardContent());
			System.out.println("###########################################");
		}
		System.out.println();
		System.out.format("+---------------------------------------+%n");
		System.out.format(leftAlignFormat, "게시글 수정 페이지");
		System.out.format(" %-12s |%n"," ");
		System.out.format("+---------------------------------------+%n");
		System.out.println("수정할 항목 : 1. 제목 | 2. 개발언어 | 3. 내용");
		System.out.print("수정할 항목을 선택해주세요>> ");
		int updateItem = sc.nextInt();
		sc.nextLine();
		
		String change = null;
		String changeItem = null;
		
		switch(updateItem) {
			case 1:
				// 1번 제목 선택시
				changeItem = "board_title";
				System.out.print("변경할 제목을 입력하세요>> ");
				change = sc.nextLine();
				break;
			case 2:
				changeItem = "board_language";
				System.out.print("변경할 개발언어를 입력하세요>> ");
				change = sc.nextLine();
				break;
			case 3:
				changeItem = "board_content";
				System.out.print("변경할 내용을 입력하세요>> ");
				change = sc.nextLine();
				break;
			case 4:
				break;
		}
		
		System.out.print("해당 항목을 변경하시겠습니까?(Y/N)>> ");
		String yesNo = sc.nextLine();
		
		switch(yesNo) {
			case "Y" :
			case "y" :
				// Y시
				if(!loginUserId.equals(board.getBoardUserId()) || boardDAO.updateBoard(updateNo,changeItem, change) == 0) {
					System.out.println("해당 게시글을 변경할 수 있는 권한이 없습니다.");
				}else {	
					System.out.println("변경완료!!"); // => 홈메뉴출력
				}
				break;
			case "N" :
			case "n" :
				// N시
				System.out.println("변경취소!! MyPage로 돌아갑니다.");
				break; 
		}	

	}
	
	// 내가 작성한 게시글 페이지 => 버전2
	public static void myPagePrint2() {
		list = boardDAO.select(loginUserId);
		
		System.out.println("+------+--------------------+----------+------------------------------+------+");
		System.out.println("|  No  |         제목        |   작성자   |             작성일자           | 조회수 |");
		System.out.println("+------+--------------------+----------+------------------------------+------+");
		
		for(Board board : list) {
			System.out.printf("| %4d | %18s | %8s | %28s | %4d |\n",board.getBoardId(), board.getBoardTitle(), board.getBoardUserId(), board.getBoardDate(), board.getBoardView());
		}
		
		System.out.println("+------+--------------------+----------+------------------------------+------+");
	}
	
	// 내가 작성한 게시글 페이지
	public static void myPagePrint() {
		list = boardDAO.select(loginUserId);
		System.out.println();
		
		String leftAlignFormat = "| %20s ";
		System.out.format("+---------------------------------------+%n");
		System.out.format(leftAlignFormat, "내가 작성한 게시글");
		System.out.format(" %-12s  |%n"," ");
		System.out.format("+---------------------------------------+%n");
		
		//String leftAlignFormat = "| %4d | %16s | %10s | %30s | %4d |";
		
		System.out.println("+------+--------------------+----------+------------------------------+------+");
		System.out.println("|  No  |         제목        |   작성자   |             작성일자           | 조회수 |");
		System.out.println("+------+--------------------+----------+------------------------------+------+");
		
		for(Board board : list) {
			System.out.printf("| %4d | %18s | %8s | %28s | %4d |\n",board.getBoardId(), board.getBoardTitle(), board.getBoardUserId(), board.getBoardDate(), board.getBoardView());
		}
		
		System.out.println("+------+--------------------+----------+------------------------------+------+");
		
		System.out.print("MyPage로 돌아가고싶다면 y 또는 Y를 눌러주세요>> ");
		String yesNo = sc.nextLine();
		switch(yesNo){
			case "y":
			case "Y":
				break;
		}
//		System.out.println("------------------------------------------------------------------------");
//		System.out.println("글번호 \t제목 \t작성자(id) \t\t작성일자 \t\t조회수");
//		
//		for(Board board : list) {
//			System.out.printf("%d \t%s \t%s \t\t%s \t%d\n",board.getBoardId(), board.getBoardTitle(), board.getBoardUserId(), board.getBoardDate(), board.getBoardView());
//		}
//		System.out.println("------------------------------------------------------------------------");
		System.out.println();
	}
	
	
	// 게시글 삭제 페이지
	public static void deleteBoard() {
		// 삭제
		System.out.println();
		
		String leftAlignFormat = "| %20s ";
		System.out.format("+---------------------------------------+%n");
		System.out.format(leftAlignFormat, "게시글 삭제 페이지");
		System.out.format(" %-12s  |%n"," ");
		System.out.format("+---------------------------------------+%n");
		myPagePrint2();
		System.out.print("삭제할 글번호를 입력하세요>> ");
		int deleteNo = sc.nextInt();
		sc.nextLine();
		// 이전에 작성한글 화면에 나타내기(단건조회)
		board = boardDAO.selectOne(deleteNo);
		
		if(board == null) {
			System.out.println("조회된 게시글이없습니다");
		}else {
			System.out.println();
			System.out.println("#########################################");
			System.out.println("제목 : " + board.getBoardTitle());
			System.out.println("개발언어 : " + board.getBoardLanguage() );
			System.out.println("작성일자 : " + board.getBoardDate());
			System.out.println("작성자(ID) : " + board.getBoardUserId());
			System.out.println("조회수 : " + board.getBoardView());
			System.out.println("내용 : " + board.getBoardContent());
			System.out.println("###########################################");
		}
		System.out.print("해당 게시글을 삭제하시겠습니까?(Y/N)>> ");
		String yesNo = sc.nextLine();
		switch(yesNo) {
			case "Y" :
			case "y" :
				// Y시
				if(!loginUserId.equals(board.getBoardUserId()) || boardDAO.deleteBoard(deleteNo) == 0) {
					System.out.println("해당 게시글을 삭제할 수 있는 권한이 없습니다.");
				}else {
					System.out.println("삭제완료!!"); // => // 홈메뉴 출력
				}
				break;
			case "N" :
			case "n" :
				// N시
				System.out.println("삭제취소!! 뒤로 되돌아갑니다");
				break; 
		}	
	}
	
	// 게시글 출력 페이지(전체) => 버전2
	public static void printBoard2() {
		list = boardDAO.select();
		System.out.println("+------+--------------------+----------+------------------------------+------+");
		System.out.println("|  No  |         제목        |   작성자   |             작성일자           | 조회수 |");
		System.out.println("+------+--------------------+----------+------------------------------+------+");
		
		for(int i = 0; i < list.size(); i++) {
			board = list.get(i);
			System.out.printf("| %4d | %18s | %8s | %28s | %4d |\n",board.getBoardId(), board.getBoardTitle(), board.getBoardUserId(), board.getBoardDate(), board.getBoardView());
		}
		
		System.out.println("+------+--------------------+----------+------------------------------+------+");
		
	}
	
	// 단건조회 페이지
	public static void printBoardInfo() {
		System.out.println();
		String leftAlignFormat = "| %20s ";
		System.out.format("+---------------------------------------+%n");
		System.out.format(leftAlignFormat, "게시글 단건조회 페이지");
		System.out.format(" %-12s|%n"," ");
		System.out.format("+---------------------------------------+%n");
		printBoard2();
		System.out.print("조회할 게시글의 글번호를 입력하세요>> ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
		board = boardDAO.selectOne(boardNo);
		
		if(board == null) {
			System.out.println("조회된 게시글이없습니다");
		}else {
			// 글번호 입력후
			System.out.println();
			System.out.println("#########################################");
			System.out.println("제목 : " + board.getBoardTitle());
			System.out.println("개발언어 : " + board.getBoardLanguage() );
			System.out.println("작성일자 : " + board.getBoardDate());
			System.out.println("작성자(ID) : " + board.getBoardUserId());
			System.out.println("조회수 : " + board.getBoardView());
			System.out.println("내용 : " + board.getBoardContent());
			System.out.println("###########################################");
			System.out.println();
			
			System.out.println("1. 다른 게시글 조회 | 2. 돌아가기");
			System.out.print("메뉴를 선택하세요>> ");
			int selectMenuNo = sc.nextInt();
			sc.nextLine();
			
			switch(selectMenuNo) {
			case 1:
				printBoardInfo();
				break;
			case 2: 
				// 로그인 성공페이지로 이동
				break;
			}
		}
	}
	
	// 게시물 출력 페이지(전체)
	public static void printBoard() {
		list = boardDAO.select();
		System.out.println();
		
		String leftAlignFormat = "| %20s ";
		System.out.format("+---------------------------------------+%n");
		System.out.format(leftAlignFormat, "게시판 페이지");
		System.out.format(" %-12s  |%n"," ");
		System.out.format("+---------------------------------------+%n");
		
		//String leftAlignFormat = "| %4d | %16s | %10s | %30s | %4d |";
		
		System.out.println("+------+--------------------+----------+------------------------------+------+");
		System.out.println("|  No  |         제목        |   작성자   |             작성일자           | 조회수 |");
		System.out.println("+------+--------------------+----------+------------------------------+------+");
		
		for(int i = 0; i < list.size(); i++) {
			board = list.get(i);
			System.out.printf("| %4d | %18s | %8s | %28s | %4d |\n",board.getBoardId(), board.getBoardTitle(), board.getBoardUserId(), board.getBoardDate(), board.getBoardView());
		}
		
		System.out.println("+------+--------------------+----------+------------------------------+------+");
		
		System.out.print("홈페이지로 돌아가고싶다면 y 또는 Y를 눌러주세요>> ");
		String yesNo = sc.nextLine();
		switch(yesNo){
			case "y":
			case "Y":
				break;
		}
		System.out.println();
	}
	
	// 메인페이지 메뉴
	public static void mainMenu() {
		System.out.println();
		System.out.println(" ██╗      ██████╗  ██████╗ ██╗███╗   ██╗\r\n"
				+ " ██║     ██╔═══██╗██╔════╝ ██║████╗  ██║\r\n"
				+ " ██║     ██║   ██║██║  ███╗██║██╔██╗ ██║\r\n"
				+ " ██║     ██║   ██║██║   ██║██║██║╚██╗██║\r\n"
				+ " ███████╗╚██████╔╝╚██████╔╝██║██║ ╚████║\r\n"
				+ " ╚══════╝ ╚═════╝  ╚═════╝ ╚═╝╚═╝  ╚═══╝\r\n"
				+ "                                         ");
		
		
		
		System.out.println("+------ 개발자 커뮤니티에 오신걸 환영합니다 ------+");
		System.out.println("|\t\t  \t\t\t|");
		System.out.println("|\t\t 메뉴 ▼ \t\t\t|");
		System.out.println("|\t\t  \t\t\t|");
		System.out.println("|\t      1. 회원가입 \t\t\t|");
		System.out.println("|\t      2. 로그인 \t\t\t|");
		System.out.println("|\t      99. 프로그램 종료 \t\t|");
		System.out.println("|\t\t  \t\t\t|");
		System.out.println("|\t\t  \t\t\t|");
		System.out.println("+---------------------------------------+");
		
		
//		System.out.println("**************************************");
//		System.out.println("1. 회원가입 | 2. 로그인 | 99. 프로그램종료");
//		System.out.println("**************************************");
		System.out.print("메뉴를 선택해주세요>> ");
	}
	
	// 회원가입 페이지
	public static void signUp() {
		
		//System.out.println("*** 회원가입 ***");
		System.out.println();
		String leftAlignFormat = "| %20s ";
		System.out.format("+---------------------------------------+%n");
		System.out.format(leftAlignFormat, "회원가입 페이지");
		System.out.format(" %-12s |%n"," ");
		System.out.format("+---------------------------------------+%n");
		System.out.print("가입할 아이디를 입력해주세요>> ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력하세요>> ");
		String password = sc.nextLine();
		System.out.print("이메일을 입력하세요>> ");
		String mail = sc.nextLine();
		member = new Member(id, password, mail);
		// 회원가입 오라클 DB에 저장
		
		if(memberDAO.memberInsert(member) > 0) {
			System.out.println("회원가입 성공!! 메인페이지로 이동합니다.");
		}else {
			System.out.println("회원가입 실패!! 다시 작성해주세요.");
			signUp();
		}
	}
		
	// 로그인 페이지
	public static boolean login() {
		System.out.println();
		String leftAlignFormat = "| %20s ";
		System.out.format("+---------------------------------------+%n");
		System.out.format(leftAlignFormat, "로그인 페이지");
		System.out.format(" %-12s  |%n"," ");
		System.out.format("+---------------------------------------+%n");
		System.out.print("아이디를 입력하세요>> ");
		loginUserId = sc.nextLine();
		
		System.out.print("비밀번호를 입력하세요>> ");
		String password = sc.nextLine();
		
		if(memberDAO.memberLogin(loginUserId, password)) {
			System.out.println("로그인 성공!!");
			return true;
		}
		return false; // 로그인 실패시
	}
}
