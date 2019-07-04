package com.BasicJava;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		int x[] = new int[3];
		
		x[0] = 20;
		x[1] = 30;
		x[2] = 40;
		//x[2] = "Hello";
		//x[3] = 50;
		
		/*System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]); */
		
		//for(int k=0;k<=2;k++)
		for(int k=0;k<x.length;k++)
		
		{
			System.out.println(x[k]);
		}
		
	}

}
