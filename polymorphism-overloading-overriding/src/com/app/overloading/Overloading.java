package com.app.overloading;

public class Overloading 
{
	public void sub(int a,int b)
	{
		int c = a-b;
		System.out.println(c);
	}
	public void sub(int a,int b,int c)
	{
		int d = a-b-c;
		System.out.println(d);
	}
	public static void main(String[] args)
	{
		Overloading ol = new Overloading();
		ol.sub(20, 10);
		ol.sub(20, 10, 5);	
	}
}
/*output: 10
          5*/
