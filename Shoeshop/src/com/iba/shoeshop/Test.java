package com.iba.shoeshop;

public class Test {

	public static void main(String[] args) {
		ShoeFeatures features = new ShoeFeatures();
		ShoeDetails details = new ShoeDetails();
		ShoeCommon sh = new SportShoe(features, Season.SPRING, details,
				true, true, true);
		System.out.println(sh);
		sh.setSeason(Season.WINTER);
		System.out.println(sh);
	}

}
