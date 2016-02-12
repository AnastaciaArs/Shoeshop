package com.iba.shoeshop;

public class Shoe extends ShoeCommon{
	private boolean isCasual;
	private boolean isMoccasins;
	
	public Shoe(String color, int size, Material material, char sex,
			boolean isForAdult, String manufacture, boolean isHeel,
			Season season, boolean isNewCollection, boolean isCasual,
			boolean isMoccasins) {
		super(color, size, material, sex, isForAdult, manufacture, isHeel,
				season, isNewCollection);
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
				.append(", getColor()=").append(getColor())
				.append(", getSize()=").append(getSize())
				.append(", getMaterial()=").append(getMaterial())
				.append(", getSex()=").append(getSex())
				.append(", isForAdult()=").append(isForAdult())
				.append(", getManufacture()=").append(getManufacture())
				.append(", isHeel()=").append(isHeel())
				.append(", getSeason()=").append(getSeason())
				.append(", isNewCollection()=").append(isNewCollection()).append("]");
		return builder.toString();
	}
	@Override
	public void getInformation() {
		System.out.println("There are comfortalbe shoes.");
	}
	
}
