package com.epam.java8tests;

import java.util.HashMap;
import java.util.Set;
import java.util.function.BiFunction;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.epam.userdefined.Product;

public class BiFunctionalInterfacesTests {

	@Parameters(value= {"name","price"})
	@Test
	public void createProductUsingBiFunction(String name,int price) {
		BiFunction<String,Integer,Product> bifunction =(pName,pPrice)->{
			return new Product(pName,pPrice, "electronics", 1);		
		};
		System.out.println(bifunction.apply(name, price));	
	}
	
	@Test
	public void calculateCostOfCart() {	
		HashMap<Product,Integer> cart = new HashMap<Product,Integer>();	
		cart.put(new Product("A",1000,"Electronics",1), 1);
		cart.put(new Product("B",2000,"Books",1), 2);
		cart.put(new Product("C",3000,"Beauty",1), 3);
		
		BiFunction <Product,Integer,Integer>bifunction =(product,quantity)->{			
			int costOfProducts=product.pPrice*quantity;		
			return costOfProducts;
		};
		
		Set<Product>keys=cart.keySet();
		int totalCost=0;
		for(Product product:keys) {
			totalCost+=bifunction.apply(product, cart.get(product));
		}
		
		System.out.println("cost of cart: "+totalCost);	
	}
}