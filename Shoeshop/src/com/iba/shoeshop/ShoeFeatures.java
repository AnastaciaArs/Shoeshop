package com.iba.shoeshop;

public class ShoeFeatures {
	private String color;
	private int size;
	private Material material;
	private Sex sex;
	
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
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShoeFeatures [color=").append(color).append(", size=")
				.append(size).append(", material=").append(material)
				.append(", sex=").append(sex).append("]");
		return builder.toString();
	}
	
}
