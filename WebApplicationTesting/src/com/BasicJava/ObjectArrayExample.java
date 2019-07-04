package com.BasicJava;

public class ObjectArrayExample {

	public static void main(String[] args) {
		
		Object a [] = new Object[3];
		
		a[0] = 10;
		a[1] = "Hello";
		a[2] = 10.123;
		
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		

	}

}
