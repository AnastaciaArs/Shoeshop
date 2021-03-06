package com.iba.shoeshop.shop;

import java.util.Arrays;

import com.iba.shoeshop.details.ShoeCommon;

public class Product {
    private ShoeCommon allShoes[];
    private int count;
    
	public Product() {
		this.allShoes = new ShoeCommon[100];
		this.count = 0;
	}
	
	public ShoeCommon[] getAllShoes() {
		return allShoes;
	}
		
	public int getCount() {
		return this.count;
	}
	
	public void addAnyShoe(ShoeCommon sh){
		this.allShoes [this.count++] = sh;
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [allShoes=").append(Arrays.toString(allShoes))
				.append(", count=").append(count).append("]");
		return builder.toString();
	}

	public ShoeCommon getByIndex(int index){
		return this.allShoes[index];
	}
}
