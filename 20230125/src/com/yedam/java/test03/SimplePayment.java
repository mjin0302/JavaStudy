package com.yedam.java.test03;

public class SimplePayment implements Payment {

	// 필드
	double simplePaymentRatio;

	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}

	// 메소드 오버라이딩
	@Override
	public int online(int price) {
		int result = price - (int) (price * (this.simplePaymentRatio + Payment.ONLINE_PAYMENT_RATIO));
		return result;
	}

	@Override
	public int offline(int price) {
		int result = price - (int) (price * (this.simplePaymentRatio + Payment.OFFLINE_PAYMENT_RATIO));
		return result;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : " + (simplePaymentRatio + ONLINE_PAYMENT_RATIO));
		System.out.println("오프라인 결제시 총 할인율 : " + (simplePaymentRatio + OFFLINE_PAYMENT_RATIO));

	}

}
