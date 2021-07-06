package com.epam.java8tests;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.genericfunctions.PremitiveInterfacesTasks;

public class PremitiveInterfacesTests extends PremitiveInterfacesTasks {

	@Parameters(value="number")
	@Test
	public void verifyIfGivenNumIsPrime(int num) {		
		if(isPrime(num)) {
			System.out.println(num+" is prime number");
		}else {
			System.out.println(num+" is NOT prime number");
		}
		
	}
	
	@Parameters(value="number")
	@Test
	public void printSqaureOfGivenNum(int num) {
		findSquare(num);
	}

	@Parameters(value="upperbound")
	@Test
	public void printRandomNumber(int upperbound) {
		generateRandomNumber(upperbound);
	}
}
