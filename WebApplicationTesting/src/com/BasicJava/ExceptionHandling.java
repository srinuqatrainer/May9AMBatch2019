package com.BasicJava;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try		
		{
			
		int x=10;
		int a=0;
		
		int p;
		
		p=x/a;
		
		System.out.println(p);
		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
