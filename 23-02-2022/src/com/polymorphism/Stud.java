package com.polymorphism;

public class Stud extends organsiation {
	int id;
	String name;
	int marks;
	static String collegename;
	
	public Stud()
	{
		id=1234;
		name= "sri";
		marks= 78;
		
	}
	public void getStudInfo()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(marks);
		System.out.println(collegename);
		
		
	}
	static
	{
		collegename="ABC matrix secondary school";
		
	}
	public static void main(String [] args)
	{
		Stud s= new Stud();
		s.getStudInfo();
		s.getInfo();
	}

}
