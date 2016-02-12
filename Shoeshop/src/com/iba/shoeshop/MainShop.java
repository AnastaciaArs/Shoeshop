package com.iba.shoeshop;

public class MainShop implements ShopInformation {
	protected int openTime;
	protected int closeTime;
	protected double proceeds; //vyruchka
	protected int countShoes;
	protected int countBoots;
	protected int countSandals;
	protected int countSport;

	public MainShop (){
		this.proceeds = 0.0;
		this.countShoes = 0;
		this.openTime = 9;
		this.closeTime = 20;
		this.countBoots = 0;
		this.countSandals = 0;
		this.countSport = 0;
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

	public int getCountShoes() {
		return countShoes;
	}

	public void setCountShoes(int countShoes) {
		this.countShoes = countShoes;
	}

	public int getCountBoots() {
		return countBoots;
	}

	public void setCountBoots(int countBoots) {
		this.countBoots = countBoots;
	}

	public int getCountSandals() {
		return countSandals;
	}

	public void setCountSandals(int countSandals) {
		this.countSandals = countSandals;
	}

	public int getCountSport() {
		return countSport;
	}

	public void setCountSport(int countSport) {
		this.countSport = countSport;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Shop [countShoes=").append(countShoes)
				.append(", countBoots=").append(countBoots)
				.append(", countSandals=").append(countSandals)
				.append(", countSport=").append(countSport).append("]");
		return builder.toString();
	}

	public void makeProceeds(){
		double[] price = makePrice();
		this.proceeds = price[0]*this.countShoes+price[1]*this.countBoots+price[2]*this.countSandals+price[3]*this.countSport;
		System.out.println("All proceeds: "+this.proceeds);
	}
	
	protected double[] makePrice(){
		double [] price = {1.2,3.0,7.2,1.0};
		return price;
	}
	
	public double[] makePrice(double pr1,double pr2, double pr3, double pr4){
		double [] price;
		price = new double[4];
		price[0] = pr1;
		price[1] = pr2;
		price[2] = pr3;
		price[3] = pr4;
		return price;
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
