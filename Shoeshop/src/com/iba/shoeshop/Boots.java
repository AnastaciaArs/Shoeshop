package com.iba.shoeshop;

public class Boots extends ShoeCommon {
	private boolean isShort;
	private boolean isRubber; //rezinovyi
	
	public Boots(ShoeFeatures features, Season season, ShoeDetails details,
			boolean isShort, boolean isRubber) {
		super(features, season, details);
		this.isShort = isShort;
		this.isRubber = isRubber;
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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Boots [isShort=").append(isShort).append(", isRubber=")
				.append(isRubber).append(", getSeason()=").append(getSeason())
				.append(", getFeatures()=").append(getFeatures())
				.append(", getDetails()=").append(getDetails())
				.append("]");
		return builder.toString();
	}
	@Override
	public void getInformation() {
		System.out.println("This is suitable for all seasons.");		
	}
	
}
