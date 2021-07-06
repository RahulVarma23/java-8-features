package com.epam.genericfunctions;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DateAndTimeTasks {	
	public void getCurrentTimeInEST(String timeZone) {
		 SimpleDateFormat estDateFormat = new SimpleDateFormat("dd/MM/yyyy 'at' hh:mma 'EST'");
		 TimeZone etTimeZone = TimeZone.getTimeZone(timeZone);
		 estDateFormat.setTimeZone(etTimeZone);	 
		 Date currentDate = new Date();
	     Supplier <String >supplier = () -> estDateFormat.format(currentDate.getTime());	
	     System.out.println(supplier.get());
	}
	
	public void getDateForNextThursday() {
		Calendar date = Calendar.getInstance();
		while (date.get(Calendar.DAY_OF_WEEK) != Calendar.THURSDAY) {
		    date.add(Calendar.DATE, 1);
		}
		date.add(Calendar.DATE, 7);
		Supplier<Date>supplier = ()-> date.getTime();
		System.out.println(supplier.get());
	}
	
	public String getDateForYesterday() {
		LocalDate today = LocalDate.now();
		LocalDate yesterday = today.minusDays(1);
		return yesterday.toString();
	}
	
	public boolean compareDates(String givenDate) {
		String yesterdayDate=getDateForYesterday();
		Predicate<String> date = p -> givenDate.equals(yesterdayDate);
		return date.test(yesterdayDate);		
	}
	
	public void calculateAge(String birthDate) {
		String [] array= birthDate.split("/");
		int year = Integer.parseInt(array[2]);
		int month = Integer.parseInt(array[1]);
		int day = Integer.parseInt(array[0]);
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(year, month, day);
		Period period = Period.between(birthday, today);
		System.out.printf("age is: %d year %d months %d days" , period.getYears(),period.getMonths(),period.getDays());
	}
}
