package com.Inherit;

public class ChildClass extends ParentClass {
	
	public void test3()
	{
		System.out.println(" Test3 Method Executed Successfully ");
	}
	
	public static void main(String []args)
	{
		ChildClass cc = new ChildClass();
		cc.test3();
		
		cc.test1();
		cc.test2();
	}
}
