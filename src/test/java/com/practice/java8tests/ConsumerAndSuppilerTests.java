package com.practice.java8tests;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.practice.userdefined.Product;

import org.apache.commons.lang3.RandomStringUtils;


public class ConsumerAndSuppilerTests {
	
	@Parameters(value="printParameter")
	@Test
	public void printProductToGivenMedium(String printParameter) {
        Product p1 = new Product("A",1000,"electronics",4);	
		
		Consumer<Product>consumer=(product)->{
			FileWriter myWriter = null;
			if(printParameter.equals("file")) {
				try {
					myWriter = new FileWriter("C:\\Users\\Rahul_Varma\\consumer.txt");
					myWriter.write(product.toString());
					System.out.println("successfully logged to file");
					myWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else {
				System.out.println(product);
			}		
		};
		consumer.accept(p1);
	}
	
	@Test
	public void upgradeGradeOfProduct() {
		ArrayList <Product> list = new ArrayList<Product>();
		list.add(new Product("A",2000,"electronics",4));
		list.add(new Product("D",4000,"phones",5));
		list.add(new Product("C",3000,"beauty",2));
		
		Consumer<Product>consumer=(product)->{
			if(product.getProductPrice()>1000) {
				product.pGrade=5;
				System.out.println(product);
			}
		};		
		for(Product product:list) {
			consumer.accept(product);	
		}
	}
	
	@Test
	public void updateNameOfProduct() {
		ArrayList <Product> list = new ArrayList<Product>();
		list.add(new Product("A",2000,"electronics",4));
		list.add(new Product("D",4000,"phones",5));
		list.add(new Product("C",5000,"beauty",2));
		
		Consumer<Product>consumer=(product)->{
			if(product.getProductPrice()>3000) {
				product.pName=product.pName+"*";
				System.out.println(product);
			}
		};		
		for(Product product:list) {
			consumer.accept(product);	
		}
	}
	
	@Test
	public void printPremierGradeOfProduct() {
		ArrayList <Product> list = new ArrayList<Product>();
		list.add(new Product("A",2000,"electronics",4));
		list.add(new Product("D",4000,"phones",5));
		list.add(new Product("C",5000,"beauty",2));
		
		Consumer<Product>consumer=(product)->{
			if(product.getProductGrade()==5) {
				product.pName=product.pName+"*";
				System.out.println(product);
			}
		};		
		for(Product product:list) {
			consumer.accept(product);	
		}
	}
	
	@Test
	public void generateRandomOTP() {
		Supplier<String>supplier = ()->{		
			return RandomStringUtils.randomNumeric(4);			
		};
		System.out.println(supplier.get());
	}

	@Test
	public void generateRandomProduct() {
		String name= RandomStringUtils.randomAlphabetic(1);
		int price= Integer.parseInt(RandomStringUtils.randomNumeric(4));
		String category= RandomStringUtils.randomAlphabetic(6);
		int grade= Integer.parseInt(RandomStringUtils.randomNumeric(1));
		Supplier <Product> supplier =()->new Product(name,price,category,grade);
		Product product = supplier.get();
		System.out.println(product);
	}
}
