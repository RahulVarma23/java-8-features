package com.epam.genericfunctions;

import java.util.List;
import java.util.stream.Collectors;

import com.epam.userdefined.Product;

public class StreamsTasks  {
	
	public List<Product> sortingBasedOnPrice(List<Product>list,int price ) {
		return list.stream().filter((product)->product.getProductPrice()>price).collect(Collectors.toList());
	}

	public List<Product> sortingBasedOnCategory(List<Product>list,String category) {
		return list.stream().filter((product)->product.getProductCategory().equals(category)).collect(Collectors.toList());
	}
	
	public List<Product> sortingBasedOnPriceAndCategory(List<Product>list,int price,String category) {
		return list.stream().filter((product)->product.getProductCategory().equals(category)&&product.getProductPrice()>price).collect(Collectors.toList());
	}
	
	public long calculateCountBasedOnCategory(List<Product>list,String category) {
		return list.stream().filter((product)->product.getProductCategory().equals(category)).count();
	}
}
