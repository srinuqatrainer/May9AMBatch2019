package com.BasicJava;

public class StringCompare {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="Hello";
		
		if(a.equals(b))
		{
			System.out.println(" Both Strings are Equal ");
		}
		else
		{
			System.out.println(" Both Strings are Not Equal ");
		}
		
		System.out.println(" ******************************* ");
		

		String x="Hello";
		String y="hello";
		
		if(x.equals(y))
		{
			System.out.println(" Both Strings are Equal ");
		}
		else
		{
			System.out.println(" Both Strings are Not Equal ");
		}
		
		System.out.println(" #################### ");
		
		String p="Hello";
		String q="hello";
		
		if(p.equalsIgnoreCase(q))
		{
			System.out.println(" Both Strings are Equal ");
		}
		else
		{
			System.out.println(" Both Strings are Not Equal ");
		}
		
		System.out.println(" ------------------------ ");
		
		String k="Hello";
		String l=" hello";
		
		if(k.equalsIgnoreCase(l))
		{
			System.out.println(" Both Strings are Equal ");
		}
		else
		{
			System.out.println(" Both Strings are Not Equal ");
		}
		
		
System.out.println(" ------------------------ ");
		
		String i="Hello";
		String j="ello";
		
		if(j.contains(i))
		{
			System.out.println(" String existing ");
		}
		else
		{
			System.out.println(" String not found ");
		}
		
		System.out.println(" &&&&&&&&&&&&&&&&&&&&&&&&& ");
		
		String h="LiveTech";
		int stringLength=h.length();
		
		System.out.println(" The length of the String is : "+ stringLength);
		
		System.out.println(" **************************** ");
		
		String w="Chello";
		String v="Hello";
		
		if(w.length() == v.length())
		{
			System.out.println(" The length of both strings are equal ");
		}
		else
		{
			System.out.println("The length of both strings are Not equal");
		}
			
		
	}

}
