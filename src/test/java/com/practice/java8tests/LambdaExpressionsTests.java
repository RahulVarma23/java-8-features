package com.practice.java8tests;
import java.util.*;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.practice.fuctionalinterfaces.TestAnagram;
import com.practice.fuctionalinterfaces.TestNumbers;
import com.practice.fuctionalinterfaces.TestPolindrome;
import com.practice.genericfunctions.LambdaExpressionTasks;
import com.practice.userdefined.Employee;

public class LambdaExpressionsTests extends LambdaExpressionTasks{
	
	@Parameters(value="givenString")
	@Test
	public void checkPolindromeString(@Optional("naman")String givenString) {
		TestPolindrome polindrome =(originalString)-> {
			boolean flag=isPolindrome(originalString);
			if(flag) {
				System.out.println("Given string is polindrome");
			}else {
				System.out.println("Given string is NOT polindrome");
			}			
		};
		polindrome.checkPoindrome(givenString);
	}
	
	@Test
	public void findSecondLargestNumber() {
		TestNumbers num = (int numbers[])->{
			System.out.println(findSecondLargestNumFromArray(numbers));
		};
		int [] numArray= {6,5,1,4};
		num.findSecondLargestNum(numArray);
	}
	
	@Parameters({"string1","string2"})
	@Test
	public void checkIfStringsAreRoatationOfEachOther(String str1,String str2) {
		TestAnagram anagram = (s1,s2)->{
	    boolean isAnagram=isAnagram(s1, s2);
	    if(isAnagram) {
			System.out.println("Given strings are roatations of each other");
		}else {
			System.out.println("Given string are NOT rotations of each other");
		}
		};
		anagram.checkAnagrams(str1, str2);
	}
	
	@Test
	public void printNumbers() {
		Runnable runnable= () ->{
			for(int i=1;i<=5;i++) {
				System.out.println(i);
			}
		};
		runnable.run();
	}
	
	@Test
	public void sortNumbersInReverseOrderWithList() {
		ArrayList<Integer>al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		Collections.sort(al,(I1,I2)->{
			if(I1<I2) {
				return 1;
			}else if(I1>I2){
				return -1;
			}else {
				return 0;
			}				
		});
		System.out.println("After sorting in reverse order: "+al);
	}
	
	@Test
	public void sortListOfEmployeesInTheAlphabeticOrderOfName() {
		ArrayList<Employee>list = new ArrayList<>();
		list.add(new Employee(10,"Rahul"));
		list.add(new Employee(20,"Akash"));
		list.add(new Employee(30,"Bhaskar"));
		Collections.sort(list ,(s1,s2)->{
			return s1.getname().compareTo(s2.getname());
				
		});
        System.out.println(list);
	}
	
	@Test
	public void sortValuesInDescendingOrderWithTreeSet() {
		 TreeSet<Integer>set = new TreeSet<>((s1,s2)->{
			if(s1<s2) {
				return 1;
			}else if(s1>s2){
				return -1;
			}else {
				return 0;
			}	
		});
		set.add(100);
		set.add(200);
		set.add(300);
		System.out.println(set);  
	}
	
	@Test
	public void sortSetOfEmployeesInAlphabeticalOrderOfNameWithTreeSet() {
		 TreeSet<Employee>set = new TreeSet<>((s1,s2)->{
			return s1.getname().compareTo(s2.getname());				
		});
		set.add(new Employee(10,"Rahul"));
		set.add(new Employee(20,"Akash"));
		set.add(new Employee(30,"Chetan"));
		System.out.println(set);  
	}
	
	@Test
	public void sortValuesInDescendingOrderWithTreeMap() {	
		TreeMap<Integer,String>map = new TreeMap<>((s1,s2)->{
			if(s1<s2) {
				return 1;
			}else if(s1>s2){
				return -1;
			}else {
				return 0;
			}	
		});
		map.put(100, "Rahul");
		map.put(200, "Varma");
		map.put(300, "Pune");
		System.out.println(map);
	}
	
	@Test
	public void descendingComparatorWithTreeMap() {
		TreeMap<Integer,String>map = new TreeMap<>((s1,s2)->{
			return s2.compareTo(s1);				
		});
		map.put(10,"Rahul");
		map.put(20,"Akash");
		map.put(30,"Bhaskar");
		System.out.println(map);
	}
	
	@Test
	public void sortListOfEmployeesInTheDecsendingOrderOfName() {
		ArrayList<Employee>list = new ArrayList<>();
		list.add(new Employee(10,"Rahul"));
		list.add(new Employee(20,"Akash"));
		list.add(new Employee(30,"Bhaskar"));
		Collections.sort(list ,(s1,s2)->{
			return s2.getname().compareTo(s1.getname());
				
		});
        System.out.println(list);     
	}
}
