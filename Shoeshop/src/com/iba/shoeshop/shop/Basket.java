package com.iba.shoeshop.shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

import com.iba.shoeshop.NameComparator;
import com.iba.shoeshop.PriceComparator;
import com.iba.shoeshop.details.ShoeCommon;

public class Basket {
	private List<ShoeCommon> all;
	
	public Basket(){
		this.all = new ArrayList<ShoeCommon>();
	}
	
	public void add(ShoeCommon sh){
		this.all.add(sh);
	}
	
	public ShoeCommon delete(ShoeCommon sh){
		return this.all.remove(this.all.indexOf(sh));
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

	public void printPrductsSortedByName(){
		this.all.sort(new NameComparator());
		for(Iterator<ShoeCommon> iterator = this.all.iterator(); iterator.hasNext();){
			ShoeCommon sh  = iterator.next();
			System.out.println(sh.getName()+" "+sh.getPrice());
		}
	}
	
	public void printPrductsSortedByPrice(){
		this.all.sort(new PriceComparator());
		for(Iterator<ShoeCommon> iterator = this.all.iterator(); iterator.hasNext();){
			ShoeCommon sh  = iterator.next();
			System.out.println(sh.getName()+" "+sh.getPrice());
		}
	}
	
	public void printUnicProducts(){
		Set<ShoeCommon> set = new HashSet<ShoeCommon>(this.all);
		System.out.println(set.size());
		for(Iterator<ShoeCommon> iterator = set.iterator(); iterator.hasNext();){
			ShoeCommon sh  = iterator.next();
			System.out.println(sh.getName()+" "+sh.getPrice());
		}
	}
}
