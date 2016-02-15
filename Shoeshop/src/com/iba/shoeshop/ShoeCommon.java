package com.iba.shoeshop;

public abstract class ShoeCommon {
	private ShoeFeatures features;
	private Season season;
	private ShoeDetails details;
		
	public ShoeCommon(ShoeFeatures features, Season season, ShoeDetails details) {
		super();
		this.features = features;
		this.season = season;
		this.details = details;
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
				.append(details).append("]");
		return builder.toString();
	}
	public abstract void getInformation();
}
