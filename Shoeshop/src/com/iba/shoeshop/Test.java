package com.iba.shoeshop;

public class Test {

	public static void main(String[] args) {
		ShoeCommon sh = new SportShoe("yellow", 10, Material.LEATHER, 'f',
				true, "china", false,
				Season.SPRING,true,false,false,true,true);
		System.out.println(sh);
		sh.setSeason(Season.WINTER);
		System.out.println(sh);
	}

}
