package com.iba.shoeshop.models;

import com.iba.shoeshop.details.Season;
import com.iba.shoeshop.details.ShoeCommon;
import com.iba.shoeshop.details.ShoeDetails;
import com.iba.shoeshop.details.ShoeFeatures;

public class SportShoe extends ShoeCommon{
	private boolean isForRunning;
	private boolean isSnickers; // snickers, sport, po shikolotku
	private boolean isGumshoes;
	
	public SportShoe(ShoeFeatures features, Season season, ShoeDetails details,
			boolean isForRunning, boolean isSnickers, boolean isGumshoes,double price,String name) {
		super(features, details,price,name);
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
