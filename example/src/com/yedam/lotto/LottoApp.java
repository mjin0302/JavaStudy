package com.yedam.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {

	// 필드
	Scanner sc = new Scanner(System.in);
	int menu = 0; // 메뉴 선택
	List<int[]> list = new ArrayList<>(); // list -> {1,2,3}, new int[10]

	// 생성자
	public LottoApp() {
		run();
	}

	// 메소드
	private void run() {
		while (menu != 99) {
			menuInfo();
			menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				// 로또 생성
				makeLotto();
				break;
			case 2:
				// 로또 조회(내가 투입한 금액과 출력 번호)
				// showInfo();
				break;
			case 99:
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

	public void menuInfo() {
		System.out.println("========================================");
		System.out.println("1. 로또 생성 | 2. 로또 조회 | 99. 프로그램 종료");
		System.out.println("========================================");
		System.out.println("원하는 메뉴 번호를 입력 > ");
	}

	private void makeLotto() {
		System.out.println("금액을 입력하세요 > ");
		int money;
		money = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < (money / 1000); i++) {
			// list에 int형 배열이 객체로 들어간다.
			// makeNumber()은 반환값이 존재한다
			list.add(makeNumber());
		}
		System.out.println("번호 출력 완료\n");
	}

	private void showInfo() {
		System.out.println("구매 한 금액 > " + (list.size() * 1000) + "원");
		for (int i = 0; i < list.size(); i++) {

			System.out.println((i % 5 + 1) + "번>");

			for (int j = 0; j < 6; j++) {
				System.out.println(list.get(i)[j] + " ");
			}

			System.out.println();

			if ((i + 1) != 0 && (i + 1) % 5 == 0) {
				System.out.println("------------------------------");
			}
		}
	}

	private int[] makeNumber() {
		int[] lottoNo = new int[6];
		for (int i = 0; i < 6; i++) {
			// 랜덤 데이터 뽑기(배열에 데이터 저장)
			lottoNo[i] = (int) (Math.random() * 45) + 1;

			// 인덱스 0일때 중복 체크 할 필요가 없다.
			if (i > 0) {
				//인덱스가 1이상일 때 중복 체크
				for (int j = 0; j < i; j++) {
					// 방금 생성한 랜덤값과 내가 가지고 있는 값이 같으면...
					if (lottoNo[j] == lottoNo[i]) {
						// 다시 i값 -1(다시 랜덤값 생성)
						i -= 1;
						break;
					}
				}
			}
		}
		return lottoNo;
	}
}
