//different return type allow
package com.app.overloading;

public class ClassB 
{
	public int add(int a,int b)
	{
		int c = a+b;
		return c;
	}
	public String add(String str)
	{	
		return "pqr";
	}
	
	public static void main(String[] args)
	{
		ClassB b = new ClassB();
		int d = b.add(10, 20);
		System.out.println(d);
		String string = b.add("abc");
		System.out.println(string);
	}
}
/*output : 30
           pqr*/
