package com.iba.shoeshop.models;

import com.iba.shoeshop.details.Season;
import com.iba.shoeshop.details.ShoeCommon;
import com.iba.shoeshop.details.ShoeDetails;
import com.iba.shoeshop.details.ShoeFeatures;

public class Boots extends ShoeCommon {
	private boolean isShort;
	private boolean isRubber; //rezinovyi
	private Season season;
	
	public Boots(ShoeFeatures features, Season season, ShoeDetails details,
			boolean isShort, boolean isRubber,double price) {
		super(features, details,price);
		this.isShort = isShort;
		this.isRubber = isRubber;
		this.season = season;
	}
	public boolean isShort() {
		return isShort;
	}
	public void setShort(boolean isShort) {
		this.isShort = isShort;
	}
	public boolean isRubber() {
		return isRubber;
	}
	public void setRubber(boolean isRubber) {
		this.isRubber = isRubber;
	}
	
	
	public Season getSeason() {
		return season;
	}
	public void setSeason(Season season) {
		this.season = season;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Boots [isShort=").append(isShort).append(", isRubber=")
				.append(isRubber).append(", getSeason()=").append(getSeason())
				.append(", getFeatures()=").append(getFeatures())
				.append(", getDetails()=").append(getDetails())
				.append(", getPrice()=").append(getPrice())
				.append("]");
		return builder.toString();
	}
	@Override
	public void getInformation() {
		System.out.println("This is suitable for all seasons.");		
	}
	
}
