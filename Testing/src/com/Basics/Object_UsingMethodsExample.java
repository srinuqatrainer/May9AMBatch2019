package com.Basics;

public class Object_UsingMethodsExample {
	
	int id;
	String name;
	
	void insertValues(int empId,String empName)
	{
		id=empId;
		name=empName;
	}
	
	void displayInformation()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		
		Object_UsingMethodsExample o = new Object_UsingMethodsExample();
		
		o.insertValues(101, "Hello");
		o.displayInformation();

	}

}
