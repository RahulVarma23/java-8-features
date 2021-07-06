package com.epam.genericfunctions;

import java.util.List;
import java.util.function.Function;

import com.epam.userdefined.Product;

public class FunctionInterfaceTasks {

	public int findCostOfAllProducts(List<Product>list) {
		int costOfAllProduct=0;
		Function<Product,Integer>function= product->{		
			return product.pPrice;	
		};		
		for (Product product:list) {
			costOfAllProduct+=function.apply(product);			
		}		
		return costOfAllProduct;
	}
	
	public int findCostOfAllProductsOnbasisOfPrice(List<Product>list,int price) {
		int costOfAllProduct=0;
		Function<Product,Integer>function= product->{		
			return product.pPrice;	
		};		
		for (Product product:list) {
			if(product.pPrice>price) {
				costOfAllProduct+=function.apply(product);	
			}				
		}		
		return costOfAllProduct;
	}
	
	public static int findCostOfAllProductsOnbasisOfCategory(List<Product>list,String category) {
		int costOfAllProduct=0;
		Function<Product,Integer>function= product->{		
			return product.pPrice;	
		};		
		for (Product product:list) {
			if(product.pCategory.equals(category)) {
				costOfAllProduct+=function.apply(product);	
			}				
		}		
		return costOfAllProduct;
	}
	
	public static int findCostOfAllProductsOnbasisOfPriceAndCategory(List<Product>list,String category,int price) {
		int costOfAllProduct=0;
		Function<Product,Integer>function= product->{		
			return product.pPrice;	
		};		
		for (Product product:list) {
			if(product.pCategory.equals(category)&&product.pPrice>price) {
				costOfAllProduct+=function.apply(product);	
			}				
		}		
		return costOfAllProduct;
	}
}

