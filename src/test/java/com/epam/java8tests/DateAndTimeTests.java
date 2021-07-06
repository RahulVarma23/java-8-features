package com.epam.java8tests;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.genericfunctions.DateAndTimeTasks;

public class DateAndTimeTests {
	
	@Parameters(value ="timezone")
	@Test
	public void supplierToGetCurrentTimeInEst(@Optional("America/New_York") String timeZone) {
		DateAndTimeTasks dateAndTime = new DateAndTimeTasks();
		dateAndTime.getCurrentTimeInEST(timeZone);
	}
	
	@Test
	public void supplierToGetDateForNextThursday() {
		DateAndTimeTasks dateAndTime = new DateAndTimeTasks();
		dateAndTime.getDateForNextThursday();
	}
	
	@Parameters(value="givenDate")
	@Test
	public void checkIfGivenDateIsYesterdayDate(String givenDate) {
		DateAndTimeTasks dateAndTime = new DateAndTimeTasks();
		boolean ifDateMatches=dateAndTime.compareDates(givenDate);		
		if(ifDateMatches) {
			System.out.println("Given date is yesterday date");
		}else {
			System.out.println("Given date is NOT yesterday date");
		}
	}
	
	@Parameters("birthday")
	@Test
	public void calculateAgeOfthePerson(@Optional("23/02/1993")String birthday) {
		DateAndTimeTasks dateAndTime = new DateAndTimeTasks();
		dateAndTime.calculateAge(birthday);
	}
}
