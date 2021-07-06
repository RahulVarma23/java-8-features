package com.practice.genericfunctions;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class PremitiveInterfacesTasks {

	public boolean isPrime(int number) {
		IntPredicate intpredicate = num -> {
			boolean flag = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			return flag;
		};
		return intpredicate.test(number);
	}
	
	public void findSquare(int num) {		
		IntConsumer intconsumer = number->{
			int sqaure=number*number;
			System.out.println("Square of given Number is: "+sqaure);
		};
		intconsumer.accept(num);
	}
	
	public void generateRandomNumber(int upperbound) {		
		IntSupplier intsuppier = ()->{
			Random rand = new Random();
		     System.out.println(rand.nextInt(upperbound));
		     return rand.nextInt(upperbound);
		};		
		intsuppier.getAsInt();
	}
}
