package com.epam.fuctionalinterfaces;

import com.epam.userdefined.Employee;

@FunctionalInterface
public interface TestReference {

	 Employee getdetails(int id, String name);
	
}
