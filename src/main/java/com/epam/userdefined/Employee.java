package com.epam.userdefined;

public class Employee {
	
	int empNo;
	String empName;
	
	public Employee(int empNo,String empName) {
		this.empNo=empNo;
		this.empName=empName;
	}
	
	public String getname() {
        return this.empName;
    }

    public void setname(String empName){
        this.empName = empName;
    }
    
    public int getEmpNo() {
    	return this.empNo;
    }
    
    public void setEmpNo(int empNo){
        this.empNo = empNo;
    }
	
	@Override
	public String toString() {	
		return "No: "+empNo+" Name: "+empName;
	}

}
