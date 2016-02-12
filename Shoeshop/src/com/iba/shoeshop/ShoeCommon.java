package com.iba.shoeshop;

public abstract class ShoeCommon {
	protected String color;
	protected int size;
	protected Material material;
	protected char sex;
	protected boolean isForAdult;
	protected String manufacture; //proizvoditel'
	protected boolean isHeel; //kabluk
	protected Season season;
	protected boolean isNewCollection;
	
	public ShoeCommon(String color, int size, Material material, char sex,
			boolean isForAdult, String manufacture, boolean isHeel,
			Season season, boolean isNewCollection) {
		super();
		this.color = color;
		this.size = size;
		this.material = material;
		this.sex = sex;
		this.isForAdult = isForAdult;
		this.manufacture = manufacture;
		this.isHeel = isHeel;
		this.season = season;
		this.isNewCollection = isNewCollection;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public boolean isForAdult() {
		return isForAdult;
	}
	public void setForAdult(boolean isForAdult) {
		this.isForAdult = isForAdult;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public boolean isHeel() {
		return isHeel;
	}
	public void setHeel(boolean isHeel) {
		this.isHeel = isHeel;
	}
	public Season getSeason() {
		return season;
	}
	public void setSeason(Season season) {
		this.season = season;
	}
	public boolean isNewCollection() {
		return isNewCollection;
	}
	public void setNewCollection(boolean isNewCollection) {
		this.isNewCollection = isNewCollection;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShoeCommon [color=").append(color).append(", size=")
				.append(size).append(", material=").append(material)
				.append(", sex=").append(sex).append(", isForAdult=")
				.append(isForAdult).append(", manufacture=")
				.append(manufacture).append(", isHeel=").append(isHeel)
				.append(", season=").append(season)
				.append(", isNewCollection=").append(isNewCollection)
				.append("]");
		return builder.toString();
	}
	
	public abstract void getInformation();
}
