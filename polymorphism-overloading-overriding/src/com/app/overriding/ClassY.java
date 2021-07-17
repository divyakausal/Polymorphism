//public > protected > default - parent to child
package com.app.overriding;

public class ClassY extends ClassX
{ 
	@Override
	public void add()
	{
		System.out.println("Method in Child class");
	}
	public static void main(String[] args)
	{
		ClassX x = new ClassY();
		x.add();
		ClassY y = new ClassY();
		y.add();
	}
}
/*output: Method in Child class
		  Method in Child class*/
