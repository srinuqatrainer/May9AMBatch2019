package com.BasicJava;

public class MethodExample2 {
	
	int a=20;
	int b=10;
	int c;
	
	public void addition()
	{
		c=a+b;
		System.out.print(" The addition of a and b is :"+c);
	}
	
	public void subtraction()
	{					
		c=a-b;
		System.out.println(" The subtration of a and b is :"+c);
	}

	public static void main(String[] args)
	{
		MethodExample2 m = new MethodExample2();
		m.addition();
		m.subtraction();
	}

}
