package com.yedam.java.test02;

public class DGBCard extends Card {

	// 필드
	static final String company = "대구은행";
	String cardStaff;

	// 생성자
	public DGBCard(String cardNo, String validDate, int cvc, String cardStaff) {
		// super(); => 부모의 생성자를 호출할 때 사용(부모 객체 생성) -> 부모 필드, 메소드 사용 가능 이유
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
		// this.company = "대구은행";
	}

	// 메소드 시그니처 오버라이딩
	@Override
	public void showCardInfo() {
		super.showCardInfo();
		System.out.println("담당직원 - " + cardStaff + ", " + company);
	}

}
