package com.BasicJava;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		String p[][] = new String[2][2];
		
		p[0][0] = "Manual Testing";
		p[0][1] = "Vishnu";
		
		p[1][0] = "Selenium";
		p[1][1] = "Srini";
		
//		p[1][2] = "Hello";
		
		
		//System.out.println(p[1][0]);
		
		for(int i=0;i<2;i++)
		{
			for(int k=0;k<=1;k++)
			{
			System.out.print(p[i][k]+"  ");
			}
			System.out.println();
		}
		

	}

}
