package com.app.overloading;

public class Child extends Parent
{
	public void add(int a,int b,int c)
	{
		int d = a+b+c;
		System.out.println(d);
	}
	
	public static void main(String[] args)
	{
		Parent parent = new Child();
		parent.add(10, 20);
		parent.add(20.30, 10);

		Child child = new Child();
		child.add(10, 20, 30);		
	}
}
/*output: 30
          30.3
          60*/
