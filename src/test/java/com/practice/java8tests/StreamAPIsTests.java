package com.practice.java8tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.practice.genericfunctions.StreamsTasks;
import com.practice.userdefined.Product;

public class StreamAPIsTests extends StreamsTasks {
	
	@Parameters(value="price")
	@Test
	public void sortProductsWithPrice(int price) {	
		ArrayList <Product> list = new ArrayList<Product>();
		list.add(new Product("A",1000,"electronics",4));
		list.add(new Product("B",2000,"books",3));
		list.add(new Product("C",3000,"beauty",2));
		list.add(new Product("D",4000,"phones",5));
		List<Product>listOfProducts=sortingBasedOnPrice(list,price);		
		System.out.println(listOfProducts);
	}
	
	@Parameters(value="category")
	@Test
	public void sortProductsWithCategory(String category) {	
		ArrayList <Product> list = new ArrayList<Product>();
		list.add(new Product("A",1000,"electronics",4));
		list.add(new Product("B",2000,"books",3));
		list.add(new Product("C",3000,"beauty",2));
		list.add(new Product("D",4000,"phones",5));
		List<Product>listOfProducts=sortingBasedOnCategory(list,category);		
		System.out.println(listOfProducts);
	}
	
	@Parameters(value={"price","category"})
	@Test
	public void sortProductsWithPriceAndCategory(int price,String category) {	
		ArrayList <Product> list = new ArrayList<Product>();
		list.add(new Product("A",1000,"electronics",4));
		list.add(new Product("B",2000,"books",3));
		list.add(new Product("C",3000,"beauty",2));
		list.add(new Product("D",4000,"electronics",5));
		List<Product>listOfProducts=sortingBasedOnPriceAndCategory(list,price,category);	
		System.out.println(listOfProducts.toString().toUpperCase());
	}
	
	@Parameters(value="category")
	@Test
	public void findCountOfProductsBasedOnCategory(String category) {	
		ArrayList <Product> list = new ArrayList<Product>();
		list.add(new Product("A",1000,"electronics",4));
		list.add(new Product("B",2000,"books",3));
		list.add(new Product("C",3000,"beauty",2));
		list.add(new Product("D",4000,"electronics",5));
		long count=calculateCountBasedOnCategory(list,category);
		System.out.println("Count of products with "+category+" category: "+count);
	}
}
