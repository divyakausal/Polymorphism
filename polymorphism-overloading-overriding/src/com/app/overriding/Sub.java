package com.app.overriding;

public class Sub extends Super
{
	public void home()
	{
		System.out.println("Banglow");
	}
	public static void main(String[] args)
	{
		Super s = new Sub();
		s.home();
		
		Sub s1 = new Sub();
		s1.home();
	}
}
/*output: Banglow
		  Banglow*/
