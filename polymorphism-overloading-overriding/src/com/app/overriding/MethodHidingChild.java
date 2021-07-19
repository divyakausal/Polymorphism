//by static keyword we can hide child class overrided method
package com.app.overriding;

public class MethodHidingChild extends MethodHiding
{
	public static void  add()
	{
		System.out.println("add in child");
	}
	public static void main(String[] args)
	{
		MethodHiding mh = new MethodHidingChild();
		mh.add();
	}
}
/*output:Parent Class Method
		 10*/
