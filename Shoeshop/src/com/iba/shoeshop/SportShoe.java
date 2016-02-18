package com.iba.shoeshop;

public class SportShoe extends ShoeCommon{
	private boolean isForRunning;
	private boolean isSnickers; // snickers, sport, po shikolotku
	private boolean isGumshoes;
	
	public SportShoe(ShoeFeatures features, Season season, ShoeDetails details,
			boolean isForRunning, boolean isSnickers, boolean isGumshoes,double price) {
		super(features, season, details,price);
		this.isForRunning = isForRunning;
		this.isSnickers = isSnickers;
		this.isGumshoes = isGumshoes;
	}

	public boolean isForRunning() {
		return isForRunning;
	}

	public void setForRunning(boolean isForRunning) {
		this.isForRunning = isForRunning;
	}

	public boolean isSnickers() {
		return isSnickers;
	}

	public void setSnickers(boolean isSnickers) {
		this.isSnickers = isSnickers;
	}

	public boolean isGumshoes() {
		return isGumshoes;
	}

	public void setGumshoes(boolean isGumshoes) {
		this.isGumshoes = isGumshoes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SportShoe [isForRunning=").append(isForRunning)
				.append(", isSnickers=").append(isSnickers)
				.append(", isGumshoes=").append(isGumshoes)
				.append(", getSeason()=").append(getSeason())
				.append(", getFeatures()=").append(getFeatures())
				.append(", getDetails()=").append(getDetails())
				.append(", getPrice()=").append(getPrice())
				.append("]");
		return builder.toString();
	}

	@Override
	public void getInformation() {
		System.out.println("There are comfortable shoes for all activities.");		
	}

}
