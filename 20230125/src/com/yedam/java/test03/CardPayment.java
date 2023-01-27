package com.yedam.java.test03;

public class CardPayment implements Payment {

	// 필드
	double cardRatio;

	// 생성자
	CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}

	// 메소드 오버라이딩
	@Override
	public int online(int price) {
		int result = price - (int) (price * (this.cardRatio + Payment.ONLINE_PAYMENT_RATIO));
		return result;
	}

	@Override
	public int offline(int price) {
		int result = price - (int) (price * (this.cardRatio + Payment.OFFLINE_PAYMENT_RATIO));
		return result;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 카드로 결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : " + (cardRatio + Payment.ONLINE_PAYMENT_RATIO));
		System.out.println("오프라인 결제시 총 할인율 : " + (cardRatio + Payment.OFFLINE_PAYMENT_RATIO));
	}

}
