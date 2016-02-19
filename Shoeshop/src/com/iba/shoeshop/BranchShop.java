package com.iba.shoeshop;

public class BranchShop extends MainShop{

	public BranchShop() {
		super();
	}
		
	public String getAdress() {
		return "Moscow, Russia";
	}

	public int getTelefone() {
		return 7654321;
	}

	public void getRange() {
		System.out.println("Our range:");
		toString();
	}

}
