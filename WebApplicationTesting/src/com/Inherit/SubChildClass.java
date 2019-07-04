package com.Inherit;

public class SubChildClass extends ChildClass {

	
	public void test4()
	{
		System.out.println(" Test4 Method Executed Successfully");
	}
	
	public static void main(String[] args) {
		
		SubChildClass scc = new SubChildClass();
		scc.test4();
		
		scc.test4();
		scc.test1();
		scc.test3();
		scc.test2();
			

	}

}
