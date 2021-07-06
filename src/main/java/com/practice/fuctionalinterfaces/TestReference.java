package com.practice.fuctionalinterfaces;

import com.practice.userdefined.Employee;

@FunctionalInterface
public interface TestReference {

	 Employee getdetails(int id, String name);
	
}
