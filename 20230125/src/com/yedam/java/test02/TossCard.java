package com.yedam.java.test02;

public class TossCard extends Card {

	// 필드
	static final String company = "Toss";
	String cardStaff;

	// 생성자
	TossCard(String cardNo, String validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}

	@Override
	public void showCardInfo() {
		System.out.println("카드정보 - Card No," + super.cardNo);
		System.out.println("담당직원 - " + cardStaff + ", " + company);
	}

}
