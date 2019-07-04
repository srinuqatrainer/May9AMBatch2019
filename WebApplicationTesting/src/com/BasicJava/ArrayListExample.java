package com.BasicJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<Object> a = new ArrayList<>();
		
		a.add("Hello");
		a.add("hii");
		a.add("Chello");
		a.add(10);
		a.add(10.123);
		
		//for(int i=0;i<3;i++)
		for(int k=0;k<a.size();k++)
		{
			System.out.println(k+" "+a.get(k));
		}
		
		System.out.println(" ********************* ");
		
		for(Object var:a)
		{
			System.out.println(var);
		}

	}

}
