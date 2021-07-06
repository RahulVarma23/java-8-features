package com.practice.java8tests;

import java.util.ArrayList;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.practice.genericfunctions.FunctionInterfaceTasks;
import com.practice.userdefined.Product;

public class FunctionInterfaceTests extends FunctionInterfaceTasks{
	
	@Test
	public void calculateTotalCostOfProductsInGivenList() {
		ArrayList <Product> list = new ArrayList<Product>();
		list.add(new Product("A",1000,"electronics",4));
		list.add(new Product("B",2000,"books",3));
		list.add(new Product("C",3000,"beauty",2));
		list.add(new Product("D",4000,"phones",5));
			
		System.out.println(findCostOfAllProducts(list));
	}
	
	@Parameters(value="price")
	@Test
	public void calculateTotalCostOfProductsInGivenListOnBasisOfPrice(int price) {
		ArrayList <Product> list = new ArrayList<Product>();
		list.add(new Product("A",1000,"electronics",4));
		list.add(new Product("B",2000,"books",3));
		list.add(new Product("C",3000,"beauty",2));
		list.add(new Product("D",4000,"phones",5));
			
		System.out.println(findCostOfAllProductsOnbasisOfPrice(list,price));
	}
	
	@Parameters(value="category")
	@Test
	public void calculateTotalCostOfProductsInGivenListOnBasisOfCategory(String category) {
		ArrayList <Product> list = new ArrayList<Product>();
		list.add(new Product("A",1000,"electronics",4));
		list.add(new Product("B",2000,"books",3));
		list.add(new Product("C",3000,"beauty",2));
		list.add(new Product("D",4000,"electronics",5));
			
		System.out.println(findCostOfAllProductsOnbasisOfCategory(list,category));
	}
	
	@Parameters(value= {"category","price"})
	@Test
	public void calculateTotalCostOfProductsInGivenListOnBasisOdPriceAndCategory(String catgeory,int price) {
		ArrayList <Product> list = new ArrayList<Product>();
		list.add(new Product("A",1000,"electronics",4));
		list.add(new Product("B",2000,"electronics",3));
		list.add(new Product("C",3000,"beauty",2));
		list.add(new Product("D",4000,"electronics",5));
		
		System.out.println(findCostOfAllProductsOnbasisOfPriceAndCategory(list,catgeory,price));
	}
}
