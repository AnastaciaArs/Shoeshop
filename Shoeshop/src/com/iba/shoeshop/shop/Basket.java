package com.iba.shoeshop.shop;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

import com.iba.shoeshop.comparator.NameComparator;
import com.iba.shoeshop.comparator.PriceComparator;
import com.iba.shoeshop.details.ShoeCommon;

public class Basket {
	private List<ShoeCommon> all;
	
	public Basket(){
		this.all = new ArrayList<ShoeCommon>();
	}
	
	public void add(ShoeCommon sh){
		this.all.add(sh);
	}
	
	public void delete(ShoeCommon sh){
		 this.all.remove(sh);
	}
	
	public void deleteAll(){
		 this.all.removeAll(this.all);
	}
	
	public double calculateAllPrice(){
		double sum = 0.0;
		for(Iterator<ShoeCommon> iterator = this.all.iterator(); iterator.hasNext();){
			sum += iterator.next().getPrice();
		}
		return sum;
	}

	public List<ShoeCommon> getProductsSortedByName(){
		this.all.sort(new NameComparator());
		return this.all;
	}
	
	public List<ShoeCommon> getProductsSortedByPrice(){
		this.all.sort(new PriceComparator());
		return this.all;
	}
	
	public Set<ShoeCommon> getUnicProducts(){
		Set<ShoeCommon> set = new HashSet<ShoeCommon>(this.all);
		return set;
	}
	
	public ShoeCommon getByIndex(int index){
		if (index<0 || index>= this.all.size())
			throw new InputMismatchException();
		else
			return this.all.get(index);
	}
	
}
