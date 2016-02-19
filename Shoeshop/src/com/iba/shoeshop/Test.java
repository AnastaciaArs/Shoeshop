package com.iba.shoeshop;

public class Test {

	public static void main(String[] args) {
		ShoeFeatures features = new ShoeFeatures();
		ShoeDetails details = new ShoeDetails();
		SportShoe sh[] = new SportShoe[5];
		for (int i = 0;i<5;i++){
		sh[i] = new SportShoe(features, Season.SPRING, details,
				true, true, true,15);
		}
		MainShop shop = new MainShop();
		Boots boot[] = new Boots[5];
		for (int i = 0;i<5;i++){
		 boot[i] = new Boots(features,Season.AUTUMN,  details,
				true, true,10.2*i);
		}
		Shoe shoe[] = new Shoe[5];
		for (int i = 0;i<5;i++){
		shoe[i] = new Shoe(features,Season.SUMMER,  details,
				true, true,10*i);
		}
		Sandals sand[] = new Sandals[5];
		for (int i = 0;i<5;i++){
		 sand[i] = new Sandals(features,Season.WINTER,  details,
				true, true,150*i);
		}
		Product product = new Product(5,5,5,5);
		product.setBoot(boot);
		product.setSport(sh);
		product.setShoe(shoe);
		product.setSandals(sand);
		shop.setProduct(product);
		shop.getProduct().printAssortiment();
		BranchShop br = new BranchShop();
		br.setProduct(product);
		br.getProduct().printAssortiment();
	}

}
