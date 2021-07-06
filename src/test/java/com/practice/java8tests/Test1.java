package com.practice.java8tests;

public class Test1 {

	public static void main(String[] args) {
		
		String s = "ThisIsBestGlobantInterview";
		
		int a[] =new int[5];
		
	    String str ="";
		
		int j=0;
		for (int i =1;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				str=str+s.substring(j, i)+" ";
				j=i;
			}
		}	
		str=str+s.substring(j);
		System.out.println(str);
	}

}
