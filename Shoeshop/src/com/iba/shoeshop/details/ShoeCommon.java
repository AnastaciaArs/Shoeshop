package com.iba.shoeshop.details;


public abstract class ShoeCommon {
	private ShoeFeatures features;
	private ShoeDetails details;
	private double price;
		
	public ShoeCommon(ShoeFeatures features, ShoeDetails details,double price) {
		super();
		this.features = features;
		this.details = details;
		this.price = price;
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
				.append(", details=")
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
