package com.epam.java8tests;

import java.util.ArrayList;
import java.util.function.Predicate;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.userdefined.Product;
import com.epam.userdefined.Response;

public class PredicateTests {
	
	@Parameters(value="price")
	@Test
	public void checkPriceOfGivenProduct(int price) {
		ArrayList <Product> list = new ArrayList<Product>();
		Product p1 =new Product("A",1000,"electronics",4);
		Product p2 =new Product("D",4000,"phones",5);
		Product p3 =new Product("C",3000,"beauty",2);
		list.add(p1);
		list.add(p2);	
		list.add(p3);	
		Predicate<Product>predicate = product -> (product.getProductPrice()>price);
		
		for(Product product :list) {
			if(predicate.test(product)) {
				System.out.println(product);
			}
		}
	}
	
	@Parameters(value="category")
	@Test
	public void checkCategoryOfGivenProduct(String category) {
		ArrayList <Product> list = new ArrayList<Product>();
		Product p1 =new Product("A",1000,"electronics",4);
		Product p2 =new Product("D",4000,"phones",5);
		Product p3 =new Product("C",3000,"beauty",2);
		list.add(p1);
		list.add(p2);	
		list.add(p3);	
		Predicate<Product>predicate = product -> (product.getProductCategory().equals(category));
		
		for(Product product :list) {
			if(predicate.test(product)) {
				System.out.println(product);
			}
		}
	}
	
	
    @Parameters({"price","category"})
	@Test
	public void printProducts1(int price ,String category) {
		ArrayList <Product> list = new ArrayList<Product>();
		Product p1 =new Product("A",100,"electronics",4);
		Product p2 =new Product("D",400,"phones",5);
		Product p3 =new Product("C",300,"beauty",2);
		Product p4 =new Product("B",300,"electronics",2);
		list.add(p1);
		list.add(p2);	
		list.add(p3);	
		list.add(p4);
		Predicate<Product>predicate1 = product -> (product.getProductPrice()>price);
		Predicate<Product>predicate2 = product -> (product.getProductCategory().equals(category));	
		Predicate<Product>predicate3 = predicate1.and(predicate2);	
		
		for(Product product :list) {
			if(predicate3.test(product)) {
				System.out.println(product);
			}
		}
	}
	
    @Parameters({"price","category"})
	@Test
	public void printProducts2(int price ,String category) {
		ArrayList <Product> list = new ArrayList<Product>();
		list.add(new Product("A",100,"electronics",4));
		list.add(new Product("D",400,"phones",5));	
		list.add(new Product("C",300,"beauty",2));	
		list.add(new Product("F",50,"home appliances",2));
		Predicate<Product>predicate1 = product -> (product.getProductPrice()>price);
		Predicate<Product>predicate2 = product -> (product.getProductCategory().equals(category));	
		Predicate<Product>predicate3 = predicate1.or(predicate2);
		
		for(Product product :list) {
			if(predicate3.test(product)) {
				System.out.println(product);
			}
		}
	}
	
    @Parameters({"price","category"})
	@Test
	public void printProducts3(int price ,String category) {
		ArrayList <Product> list = new ArrayList<Product>();
		list.add(new Product("A",50,"electronics",4));
		list.add(new Product("D",40,"phones",5));	
		list.add(new Product("B",300,"beauty",2));	
		list.add(new Product("C",300,"electronics",2));
		Predicate<Product>predicate1 = product -> (product.getProductPrice()<price);
		Predicate<Product>predicate2 = product -> (product.getProductCategory().equals(category));	
		Predicate<Product>predicate3 = predicate1.and(predicate2);	
		
		for(Product product :list) {
			if(predicate3.test(product)) {
				System.out.println(product);
			}
		}
	}
	
    @Parameters("statusCode")
	@Test
	public void checkStatusCode(int statusCode) {
		ArrayList <Response> list = new ArrayList<Response>();
		list.add(new Response("bodyA",200,"JSON"));
		list.add(new Response("bodyB",400,"JSON"));
		list.add(new Response("bodyC",300,"XML"));
		list.add(new Response("bodyD",400,"XML"));
		
		Predicate<Response>predicate = response->(response.getStatusCode()==statusCode);
		for(Response response : list) {
			if(predicate.test(response)) {
				System.out.println(response);
			}
		}
	}
	
    @Parameters("responseType")
	@Test
	public void checkResponseType(String responseType) {
		ArrayList <Response> list = new ArrayList<Response>();
		list.add(new Response("bodyA",200,"JSON"));
		list.add(new Response("bodyB",400,"JSON"));
		list.add(new Response("bodyC",300,"XML"));
		list.add(new Response("bodyD",400,"XML"));
		
		Predicate<Response>predicate = response->(response.getResponseType().equals(responseType));
		for(Response response : list) {
			if(predicate.test(response)) {
				System.out.println(response);
			}
		}
	}
	
	@Test
	public void printResponse1() {
		ArrayList <Response> list = new ArrayList<Response>();
		list.add(new Response("bodyA",200,"JSON"));
		list.add(new Response("bodyB",400,"JSON"));
		list.add(new Response("bodyC",300,"XML"));
		list.add(new Response("bodyD",400,"XML"));
		
		Predicate<Response>predicate1 = response->(response.getResponseType().equals("JSON"));
		Predicate<Response>predicate2 = response->(response.getStatusCode()==400);
		Predicate<Response>predicate3 = predicate1.and(predicate2);
		
		for(Response response : list) {
			if(predicate3.test(response)) {
				System.out.println(response);
			}
		}
	}
	
	@Test
	public void printResponse2() {
		ArrayList <Response> list = new ArrayList<Response>();
		list.add(new Response("bodyA",200,"JSON"));
		list.add(new Response("bodyB",400,"JSON"));
		list.add(new Response("bodyC",300,"XML"));
		list.add(new Response("bodyD",400,"XML"));
		
		Predicate<Response>predicate1 = response->(response.getResponseType().equals("JSON"));
		Predicate<Response>predicate2 = response->(response.getStatusCode()==400);
		Predicate<Response>predicate3 = predicate1.or(predicate2);
		
		for(Response response : list) {
			if(predicate3.test(response)) {
				System.out.println(response);
			}
		}
	}
	
	@Test
	public void printResponse3() {
		ArrayList <Response> list = new ArrayList<Response>();
		list.add(new Response("bodyA",200,"JSON"));
		list.add(new Response("bodyB",400,"JSON"));
		list.add(new Response("bodyC",300,"JOSN"));
		list.add(new Response("bodyD",400,"XML"));
		
		Predicate<Response>predicate1 = response->(response.getResponseType().equals("JSON"));
		Predicate<Response>predicate2 = response->(response.getStatusCode() !=400);
		Predicate<Response>predicate3 = predicate1.and(predicate2);
		
		for(Response response : list) {
			if(predicate3.test(response)) {
				System.out.println(response);
			}
		}
	}
}
