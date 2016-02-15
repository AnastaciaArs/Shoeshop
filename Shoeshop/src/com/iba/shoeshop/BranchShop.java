package com.iba.shoeshop;

public class BranchShop extends MainShop{

	public BranchShop() {
		super();
	}

	public void makeProceeds(){
		double[] price = makePrice();
		this.setProceeds(price[0]*this.getProduct().getCountShoe()+price[1]*this.getProduct().getCountBoots()
				+price[2]*this.getProduct().getCountSandals()+price[3]*this.getProduct().getCountSport());
		System.out.println("All proceeds: "+this.getProceeds());
	}
	
	protected double[] makePrice(){
		double [] price = {8.8,4.0,2.5,3.0};
		return price;
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
