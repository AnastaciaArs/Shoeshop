package com.iba.shoeshop;

public class Sandals extends ShoeCommon{
	private boolean isBoot;
	private boolean isForSwim;

	public Sandals(ShoeFeatures features, Season season, ShoeDetails details,
			boolean isBoot, boolean isForSwim, double price) {
		super(features, season, details,price);
		this.isBoot = isBoot;
		this.isForSwim = isForSwim;
	}

	public boolean isBoot() {
		return isBoot;
	}

	public void setBoot(boolean isBoot) {
		this.isBoot = isBoot;
	}

	public boolean isForSwim() {
		return isForSwim;
	}

	public void setForSwim(boolean isForSwim) {
		this.isForSwim = isForSwim;
	}

	@Override
	public void getInformation() {
		System.out.println("There are summer shoes.");	
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sandals [isBoot=").append(isBoot)
				.append(", isForSwim=").append(isForSwim)
				.append(", getSeason()=").append(getSeason())
				.append(", getFeatures()=").append(getFeatures())
				.append(", getDetails()=").append(getDetails())
				.append(", getPrice()=").append(getPrice())
				.append("]");
		return builder.toString();
	}

	

	
}
