package com.abstraction;

public class Manager extends organsiation{
	int id;
	String name;
	double salary;
	static String project;
	
	public Manager()
	{
		id=1234;
		name= "sri";
		salary= 34567.77;
	}
	public void getManagerInfo()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(project);
		
		
	}
	static
	{
		project="SOFTWARE TESTING";
		
	}
	public static void main(String [] args)
	{
		Manager m= new Manager();
		m.getManagerInfo();
		organsiation organsiation= new organsiation();
		organsiation.getInfo();
	}

}
