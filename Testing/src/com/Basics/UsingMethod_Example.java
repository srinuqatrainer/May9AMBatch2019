package com.Basics;

public class UsingMethod_Example {
	
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
		
		UsingMethod_Example u = new UsingMethod_Example();
		u.insertValues(101, "Srinu");
			
		u.displayInformation();
	}

}
