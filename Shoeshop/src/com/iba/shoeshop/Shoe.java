package com.iba.shoeshop;

public class Shoe extends ShoeCommon{
	private boolean isCasual;
	private boolean isMoccasins;
	
	public Shoe(ShoeFeatures features, Season season, ShoeDetails details,
			boolean isCasual, boolean isMoccasins) {
		super(features, season, details);
		this.isCasual = isCasual;
		this.isMoccasins = isMoccasins;
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
				.append("]");
		return builder.toString();
	}
	@Override
	public void getInformation() {
		System.out.println("There are comfortalbe shoes.");
	}
	
}
