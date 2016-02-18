package com.iba.shoeshop;

public class MainShop implements ShopInformation {
	private int openTime;
	private int closeTime;
	private double proceeds; //vyruchka
	private Product product;

	public MainShop (){
		this.proceeds = 0.0;
		this.product = new Product(5,5,5,5);
		this.openTime = 9;
		this.closeTime = 20;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getOpenTime() {
		return openTime;
	}
	
	public void setOpenTime(int openTime) {
		this.openTime = openTime;
	}
	
	public int getCloseTime() {
		return closeTime;
	}
	
	public void setCloseTime(int closeTime) {
		this.closeTime = closeTime;
	}
	
	public double getProceeds() {
		return proceeds;
	}

    public void setProceeds(double proceeds) {
		this.proceeds = proceeds;
	}

	public String getAdress() {
		return "Minsk, Belarus";
	}

	public int getTelefone() {
		return 1234567;
	}

	public void getRange() {
		System.out.println("Our range:");
		toString();
	}

	public void getReview() {
		System.out.println("This is the best shop.");
		
	}
	
}
