package com.iba.shoeshop;

import com.iba.shoeshop.details.Season;
import com.iba.shoeshop.details.ShoeCommon;
import com.iba.shoeshop.details.ShoeDetails;
import com.iba.shoeshop.details.ShoeFeatures;
import com.iba.shoeshop.models.Boots;
import com.iba.shoeshop.models.Sandals;
import com.iba.shoeshop.models.Shoe;
import com.iba.shoeshop.models.SportShoe;
import com.iba.shoeshop.shop.Basket;
import com.iba.shoeshop.shop.BranchShop;
import com.iba.shoeshop.shop.MainShop;
import com.iba.shoeshop.shop.Product;

public class Test {

	public void printAssortiment(MainShop shop){
		for (int i=0;i<shop.getProduct().getCount();i++){
			System.out.println(shop.getProduct().getAllShoes()[i]);
		}
	}
	
	public static void main(String[] args) {
		ShoeFeatures features = new ShoeFeatures();
		ShoeDetails details = new ShoeDetails();
		ShoeCommon sh[] = new SportShoe[5];
		Product product = new Product();
		Basket b = new Basket();
		for (int i = 0;i<5;i++){
		sh[i] = new SportShoe(features, Season.SPRING, details,
				true, true, true,15,"sport shoe");
		product.addAnyShoe(sh[i]);
		b.add(sh[i]);
		}
		MainShop shop = new MainShop();
		ShoeCommon boot[] = new Boots[5];
		for (int i = 0;i<5;i++){
		 boot[i] = new Boots(features,Season.AUTUMN,  details,
				true, true,10.2*i,"boots");
		 product.addAnyShoe(boot[i]);
		 b.add(boot[i]);
		}
		ShoeCommon shoe[] = new Shoe[5];
		for (int i = 0;i<5;i++){
		shoe[i] = new Shoe(features,Season.SUMMER,  details,
				true, true,10*i,"shoe");
		product.addAnyShoe(shoe[i]);
		b.add(shoe[i]);
		}
		ShoeCommon sand[] = new Sandals[5];
		for (int i = 0;i<5;i++){
		 sand[i] = new Sandals(features,Season.WINTER,  details,
				true, true,150*i,"sandals");
		 product.addAnyShoe(sand[i]);
		 b.add(sand[i]);
		}
		
		//product.addAnyShoe(sh[0]);
		shop.setProduct(product);
		Test test = new Test();
		test.printAssortiment(shop);
		System.out.println("-----------------------------------------------------");
		BranchShop br = new BranchShop();
		br.setProduct(product);
		test.printAssortiment(br);
		
		//System.out.println(b.calculateAllPrice());
		//b.printPrductsSortedByPrice();
		//b.printPrductsSortedByPrice();
		//b.printUnicProducts();
		//System.out.println(b.delete(sh[0]));
		System.out.println("-----------------------------------------------------");
		
		b.deleteAll();
		b.deleteAll();
		b.printPrductsSortedByPrice();
		System.out.println("-----------------------------------------------------");
		
	}
}
