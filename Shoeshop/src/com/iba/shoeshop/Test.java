package com.iba.shoeshop;

import com.iba.shoeshop.details.Season;
import com.iba.shoeshop.details.ShoeDetails;
import com.iba.shoeshop.details.ShoeFeatures;
import com.iba.shoeshop.models.Boots;
import com.iba.shoeshop.models.Sandals;
import com.iba.shoeshop.models.Shoe;
import com.iba.shoeshop.models.SportShoe;
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
		SportShoe sh[] = new SportShoe[5];
		Product product = new Product();
		for (int i = 0;i<5;i++){
		sh[i] = new SportShoe(features, Season.SPRING, details,
				true, true, true,15);
		product.addAnyShoe(sh[i]);
		}
		MainShop shop = new MainShop();
		Boots boot[] = new Boots[5];
		for (int i = 0;i<5;i++){
		 boot[i] = new Boots(features,Season.AUTUMN,  details,
				true, true,10.2*i);
		 product.addAnyShoe(boot[i]);
		}
		Shoe shoe[] = new Shoe[5];
		for (int i = 0;i<5;i++){
		shoe[i] = new Shoe(features,Season.SUMMER,  details,
				true, true,10*i);
		product.addAnyShoe(shoe[i]);
		}
		Sandals sand[] = new Sandals[5];
		for (int i = 0;i<5;i++){
		 sand[i] = new Sandals(features,Season.WINTER,  details,
				true, true,150*i);
		 product.addAnyShoe(sand[i]);
		}
		
		//product.addAnyShoe(sh[0]);
		shop.setProduct(product);
		Test test = new Test();
		test.printAssortiment(shop);
		System.out.println("-----------------------------------------------------");
		BranchShop br = new BranchShop();
		br.setProduct(product);
		test.printAssortiment(br);
	}

}
