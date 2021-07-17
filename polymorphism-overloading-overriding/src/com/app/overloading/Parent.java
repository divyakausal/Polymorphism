package com.app.overloading;

public class Parent 
{
	public void add(int a,int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	public void add(double a,int b)
	{
		double c = a+b;
		System.out.println(c);
	}
}
