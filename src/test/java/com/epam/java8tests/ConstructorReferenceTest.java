package com.epam.java8tests;

import org.testng.annotations.Test;

import com.epam.fuctionalinterfaces.TestReference;
import com.epam.userdefined.Employee;

public class ConstructorReferenceTest {

	@Test
	public void getEmployeeDetails() {
		TestReference testReference = Employee::new ;
		System.out.println("Employee Name: "+testReference.getdetails(10, "Rahul").getname());
		System.out.println("Employee No: "+testReference.getdetails(20, "Rohit").getEmpNo());
	}
}
