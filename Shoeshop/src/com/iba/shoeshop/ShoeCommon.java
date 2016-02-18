package com.iba.shoeshop;

public abstract class ShoeCommon {
	private ShoeFeatures features;
	private Season season;
	private ShoeDetails details;
	private double price;
		
	public ShoeCommon(ShoeFeatures features, Season season, ShoeDetails details,double price) {
		super();
		this.features = features;
		this.season = season;
		this.details = details;
		this.price = price;
	}
	public Season getSeason() {
		return season;
	}
	public void setSeason(Season season) {
		this.season = season;
	}
	
	public ShoeFeatures getFeatures() {
		return features;
	}
	public void setFeatures(ShoeFeatures features) {
		this.features = features;
	}
	public ShoeDetails getDetails() {
		return details;
	}
	public void setDetails(ShoeDetails details) {
		this.details = details;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShoeCommon [features=").append(features)
				.append(", season=").append(season).append(", details=")
				.append(details).append(", price=").append(price).append("]");
		return builder.toString();
	}
	public abstract void getInformation();
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
