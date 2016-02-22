package com.iba.shoeshop.details;

public class ShoeDetails {
	private boolean isForAdult;
	private String manufacture; //proizvoditel'
	private boolean isHeel; //kabluk
	private boolean isNewCollection;
	
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
	public boolean isNewCollection() {
		return isNewCollection;
	}
	public void setNewCollection(boolean isNewCollection) {
		this.isNewCollection = isNewCollection;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShoeDetails [isForAdult=").append(isForAdult)
				.append(", manufacture=").append(manufacture)
				.append(", isHeel=").append(isHeel)
				.append(", isNewCollection=").append(isNewCollection)
				.append("]");
		return builder.toString();
	}
}
