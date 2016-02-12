package com.iba.shoeshop;

public class Boots extends ShoeCommon {
	private boolean isShort;
	private boolean isRubber; //rezinovyi
	
	public Boots(String color, int size, Material material, char sex,
			boolean isForAdult, String manufacture, boolean isHeel,
			Season season, boolean isNewCollection, boolean isShort,
			boolean isRubber) {
		super(color, size, material, sex, isForAdult, manufacture, isHeel,
				season, isNewCollection);
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
				.append(isRubber).append(", getColor()=").append(getColor())
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
		System.out.println("This is suitable for all seasons.");		
	}
	
}
