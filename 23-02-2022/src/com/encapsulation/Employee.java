package com.encapsulation;

public class Employee {
	int id;
	String name;
	double salary;
	static String orgname;
	
	public Employee()
	{
		id=1234;
		name= "sri";
		salary= 34567.77;
	}
	public void getEmployeeInfo()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(orgname);
		
		
	}
	static
	{
		orgname="MNC";
		
	}
	public static void main(String [] args)
	{
		Employee employee= new Employee();
		employee.getEmployeeInfo();
	}

}
