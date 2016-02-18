package com.iba.shoeshop;

import java.util.Arrays;

public class Product {
    private Boots[] boot;
    private Shoe[] shoe;
    private SportShoe[] sport;
    private Sandals[] sandals;
	public Product( int count,int count1,int count2,int count3) {
		this.boot = new Boots[count];
		this.shoe = new Shoe[count1];
		this.sport = new SportShoe[count2];
		this.sandals = new Sandals[count3];
	}
	public Boots[] getBoot() {
		return boot;
	}
	public void setBoot(Boots[] boot) {
		this.boot = boot;
	}
	public Shoe[] getShoe() {
		return shoe;
	}
	public void setShoe(Shoe[] shoe) {
		this.shoe = shoe;
	}
	public SportShoe[] getSport() {
		return sport;
	}
	public void setSport(SportShoe[] sport) {
		this.sport = sport;
	}
	public Sandals[] getSandals() {
		return sandals;
	}
	public void setSandals(Sandals[] sandals) {
		this.sandals = sandals;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [boot=").append(Arrays.toString(boot))
				.append(", shoe=").append(Arrays.toString(shoe))
				.append(", sport=").append(Arrays.toString(sport))
				.append(", sandals=").append(Arrays.toString(sandals))
				.append("]");
		return builder.toString();
	}
    public int getCountBoots(){
    	return this.boot.length;
    }
    public int getCountSandals(){
    	return this.sandals.length;
    }
    public int getCountShoe(){
    	return this.shoe.length;
    }
    public int getCountSport(){
    	return this.sport.length;
    }
    private void getPriceBoots(){
    	for(int i=0;i<this.boot.length;i++){
    		System.out.println(this.boot[i]);
    	}
    }
    private void getPriceSandals(){
    	for(int i=0;i<this.sandals.length;i++){
    		System.out.println(this.sandals[i]);
    	}
    }
    private void getPriceShoes(){
    	for(int i=0;i<this.shoe.length;i++){
    		System.out.println(this.shoe[i]);
    	}
    }
    private void getPriceSport(){
    	for(int i=0;i<this.sport.length;i++){
    		System.out.println(this.sport[i]);
    	}
    }
    public void getAssortiment(){
    	this.getPriceBoots();
    	this.getPriceSandals();
    	this.getPriceShoes();
    	this.getPriceSport();
    }
}
