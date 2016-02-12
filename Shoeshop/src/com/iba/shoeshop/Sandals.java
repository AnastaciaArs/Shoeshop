package com.iba.shoeshop;

public class Sandals extends ShoeCommon{
	private boolean isBoot;
	private boolean isForSwim;
	
	public Sandals(String color, int size, Material material, char sex,
			boolean isForAdult, String manufacture, boolean isHeel,
			Season season, boolean isNewCollection, boolean isBoot,
			boolean isForSwim) {
		super(color, size, material, sex, isForAdult, manufacture, isHeel,
				season, isNewCollection);
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
				.append(", isForSwim=").append(isForSwim).append(", color=")
				.append(color).append(", size=").append(size)
				.append(", material=").append(material).append(", sex=")
				.append(sex).append(", isForAdult=").append(isForAdult)
				.append(", manufacture=").append(manufacture)
				.append(", isHeel=").append(isHeel).append(", season=")
				.append(season).append(", isNewCollection=")
				.append(isNewCollection).append("]");
		return builder.toString();
	}
	
	
}
