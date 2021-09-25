package com.greatlearning.compairprice;

public class ComparePrice {

	public void compareStockRose(boolean[] comparedSharePrice) {
		int countRose = 0;
		for (int i = 0; i < comparedSharePrice.length; i++) {
			if (comparedSharePrice[i] == (true)) {
				countRose++;
			}
		}
		System.out.println(countRose);
	}

	public void compareStockDecline(boolean[] comparedSharePrice) {
		int countDeclined = 0;
		for (int i = 0; i < comparedSharePrice.length; i++) {
			if (comparedSharePrice[i] == (false)) {
				countDeclined++;
			}
		}
		System.out.println(countDeclined);
	}
}
