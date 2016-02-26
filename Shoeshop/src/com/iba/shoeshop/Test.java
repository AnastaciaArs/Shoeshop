package com.iba.shoeshop;

import java.util.Collection;


import java.util.InputMismatchException;
import java.util.Scanner;

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
	
	public void printActions(){
		System.out.println("\n What operation do you want to do? ");
		System.out.println("1 - add product");
		System.out.println("2 - get total price");
		System.out.println("3 - get products sorted by name");
		System.out.println("4 - delete product");
		System.out.println("5 - delete all products");
		System.out.println("6 - get products sorted by price");
		System.out.println("7 - get prducts without repetition");
		System.out.println("other number - QUIT");
		System.out.println("\n Please, input number operation:");
	}
	
	public void chooseAction(int action, Basket b, ShoeCommon sh){
		switch (action){
		case 1: 
			b.add(sh);
			break;
		case 2:
			System.out.println(b.calculateAllPrice());
			break;
		case 3: 
			printBasket(b.getProductsSortedByName());
			break;
		case 4: 
			b.delete(sh);
			break;
		case 5: 
			b.deleteAll();
			break;
		case 6: 
			printBasket(b.getProductsSortedByPrice());
			break;
		case 7: 
			printBasket(b.getUnicProducts());
			break;
		default: 
			break;
		}
			
	}

	public void printAssortiment(MainShop shop){
		System.out.println("All assortiment from all shops:");
		for (int i=0;i<shop.getProduct().getCount();i++){
			System.out.println((i+1)+" - "+shop.getProduct().getAllShoes()[i].getName()+" "+shop.getProduct().getAllShoes()[i].getPrice());
		}
	}
	
	public ShoeCommon getByIndexFromShop(Product product,int index){
		if (index<1 ||index>product.getCount())
			throw new InputMismatchException();
		else
		return product.getByIndex(index-1);
	}
	
	public void printBasket(Collection<ShoeCommon> list){
		int i = 1;
		for(ShoeCommon element: list){
			System.out.println((i++)+" - "+element.getName()+" "+element.getPrice());
		}
	}
	
	public Product getProducts(){
		ShoeFeatures features = new ShoeFeatures();
		ShoeDetails details = new ShoeDetails();
		ShoeCommon sh[] = new SportShoe[5];
		Product product = new Product();
		for (int i = 0;i<5;i++){
		sh[i] = new SportShoe(features, Season.SPRING, details,
				true, true, true,15,"sport shoe");
		product.addAnyShoe(sh[i]);
		}
		ShoeCommon boot[] = new Boots[5];
		for (int i = 0;i<5;i++){
		 boot[i] = new Boots(features,Season.AUTUMN,  details,
				true, true,10.2*i,"boots");
		 product.addAnyShoe(boot[i]);
		}
		ShoeCommon shoe[] = new Shoe[5];
		for (int i = 0;i<5;i++){
		shoe[i] = new Shoe(features,Season.SUMMER,  details,
				true, true,10*i,"shoe");
		product.addAnyShoe(shoe[i]);
		}
		ShoeCommon sand[] = new Sandals[5];
		for (int i = 0;i<5;i++){
		 sand[i] = new Sandals(features,Season.WINTER,  details,
				true, true,150*i,"sandals");
		 product.addAnyShoe(sand[i]);
		}
		return product;		
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		MainShop shop = new MainShop();
		shop.setProduct(test.getProducts());
		BranchShop br = new BranchShop();
		br.setProduct(test.getProducts());
		Basket b = new Basket();

		System.out.println("");
		Scanner s = new Scanner(System.in);
		
		try{
			while(true){
		test.printActions();
		int index = -1;
		int action = s.nextInt();
		ShoeCommon sh = new Shoe(new ShoeFeatures(),new ShoeDetails(),0.0,"");
		if (action==1){
			test.printAssortiment(shop);
			System.out.println("Please, input product number");
			index = s.nextInt();
			sh = test.getByIndexFromShop(shop.getProduct(), index);
		}
		if (action==4){
			test.printBasket(b.getProductsSortedByName());
			System.out.println("Please, input product number");
			index = s.nextInt();
			sh = b.getByIndex(index-1);
		}
		if (action>7){
			System.out.println("QUIT");
			return;
		}
		else
			test.chooseAction(action, b,sh);
			}
		}
		catch(InputMismatchException e){
			System.out.println("Sorry, You input wrong number.");
			System.out.println("QUIT");
		}
		finally{
			s.close();
		}
	}
}
