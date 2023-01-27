package com.yedam.java.test02;

public class Test02Example {

	public static void main(String[] args) {
		Card tosscard = new TossCard("5432-4567-9534-3657", null, 0, "신빛용");
		Card dgbcard = new DGBCard("5432-4567-9534-3657", "20251203", 253, "신빛용");

		tosscard.showCardInfo();
		dgbcard.showCardInfo();

	}

}
