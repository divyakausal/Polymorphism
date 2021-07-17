//Constructor can overload
package com.app.overloading;

public class Constructor 
{
	public Constructor()
	{
		System.out.println("This is no-argument constructor");
	}
	public Constructor(int a)
	{
		System.out.println("This is parameterised constructor");
	}
	
	public static void main(String[] args)
	{
		Constructor constructor = new Constructor();
		Constructor constructor1 = new Constructor(10);
	}
}
/*output: This is no-argument constructor
  		  This is parameterised constructor*/
