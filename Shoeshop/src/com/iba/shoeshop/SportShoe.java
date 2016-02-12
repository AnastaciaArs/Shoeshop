package com.iba.shoeshop;

public class SportShoe extends ShoeCommon{
	private boolean isForRunning;
	private boolean isSnickers; // snickers, sport, po shikolotku
	private boolean isForSports;
	private boolean isGumshoes;
	
	public SportShoe(String color, int size, Material material, char sex,
			boolean isForAdult, String manufacture, boolean isHeel,
			Season season, boolean isNewCollection, boolean isForRunning,
			boolean isSnickers, boolean isForSports, boolean isGumshoes) {
		super(color, size, material, sex, isForAdult, manufacture, isHeel,
				season, isNewCollection);
		this.isForRunning = isForRunning;
		this.isSnickers = isSnickers;
		this.isForSports = isForSports;
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

	public boolean isForSports() {
		return isForSports;
	}

	public void setForSports(boolean isForSports) {
		this.isForSports = isForSports;
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
				.append(", isForSports=").append(isForSports)
				.append(", isGumshoes=").append(isGumshoes)
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
		System.out.println("There are comfortable shoes for all activities.");		
	}

}
