package com.practice.userdefined;

public class Product {
	
	public int pPrice;
	public String pName;
	public String pCategory;
	public int pGrade;
	
	public Product(String pName,int pPrice,String pCategory,int pGrade) {
		this.pName=pName;
		this.pPrice=pPrice;
		this.pCategory=pCategory;
		this.pGrade=pGrade;
	}
	
	public String getProductName() {
        return this.pName;
    }
    
    public int getProductPrice() {
    	return this.pPrice;
    }
    
    public String getProductCategory() {
        return this.pCategory;
    }
    
    public int getProductGrade() {
        return this.pGrade;
    }
    
    @Override
	public String toString() {	
		return "name:"+pName+" price:"+pPrice+" category:"+pCategory+" grade:"+pGrade;
	}
}
