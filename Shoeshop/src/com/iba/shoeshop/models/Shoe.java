package com.iba.shoeshop.models;

import com.iba.shoeshop.details.Season;
import com.iba.shoeshop.details.ShoeCommon;
import com.iba.shoeshop.details.ShoeDetails;
import com.iba.shoeshop.details.ShoeFeatures;

public class Shoe extends ShoeCommon{
	private boolean isCasual;
	private boolean isMoccasins;
	private Season season;
	
	public Shoe(ShoeFeatures features,ShoeDetails details,double price,String name){
		super(features, details,price,name);
	}
	
	public Season getSeason() {
		return season;
	}
	public void setSeason(Season season) {
		this.season = season;
	}
	public Shoe(ShoeFeatures features, Season season, ShoeDetails details,
			boolean isCasual, boolean isMoccasins,double price,String name) {
		super(features, details,price,name);
		this.isCasual = isCasual;
		this.isMoccasins = isMoccasins;
		this.season = season;
	}
	public boolean isCasual() {
		return isCasual;
	}
	public void setCasual(boolean isCasual) {
		this.isCasual = isCasual;
	}
	public boolean isMoccasins() {
		return isMoccasins;
	}
	public void setMoccasins(boolean isMoccasins) {
		this.isMoccasins = isMoccasins;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Shoe [isCasual=").append(isCasual)
				.append(", isMoccasins=").append(isMoccasins)
				.append(", getSeason()=").append(getSeason())
				.append(", getFeatures()=").append(getFeatures())
				.append(", getDetails()=").append(getDetails())
				.append(", getPrice()=").append(getPrice())
				.append("]");
		return builder.toString();
	}
	@Override
	public void getInformation() {
		System.out.println("There are comfortalbe shoes.");
	}
	
}
