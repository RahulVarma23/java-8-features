package com.epam.genericfunctions;

public class LambdaExpressionTasks {
	public boolean isPolindrome(String originalString) {	
		boolean isPolindrome = false;
		String reverse ="";
		for(int i=originalString.length()-1;i>=0;i--) {
			reverse +=originalString.charAt(i);
		}
		if(originalString.equals(reverse)) {
			isPolindrome=true;
		}	
		return isPolindrome;
	}
	
	public int findSecondLargestNumFromArray(int [] numArray) {
	    int largestNum=numArray[0];
	    int secondLargestNum=numArray[0];
	    for (int i=0;i<numArray.length;i++) {
	    	if(numArray[i]>largestNum) {
	    		secondLargestNum=largestNum;
	    		largestNum=numArray[i];
	    	}else if(numArray[i]>secondLargestNum && numArray[i]<largestNum) {
	    		secondLargestNum=numArray[i];
	    	}
	    }
		return secondLargestNum;	
	}
	
	public boolean isAnagram(String string1,String string2) {	
		boolean isAnagram = false;
		int asciiSum1 =0,asciiSum2=0;		
		for(int i=0;i<string1.length();i++) {
			asciiSum1 +=string1.toUpperCase().charAt(i);
		}
		for(int j=0;j<string2.length();j++) {
			asciiSum2 +=string2.toUpperCase().charAt(j);
		}
		if(asciiSum1==asciiSum2) {
			isAnagram=true;
		}	
		return isAnagram;
	}
}
