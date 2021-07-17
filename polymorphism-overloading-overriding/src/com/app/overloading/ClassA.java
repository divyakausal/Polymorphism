// private ,static, final ,protected, default support
package com.app.overloading;

public class ClassA
{
	public final void mul(int a,int b,int c)
	{
		int d = a*b*c;
		System.out.println(d);
	}
	protected void mul(int a,int b)
	{
		int c = a*b;
		System.out.println(c);
	}
	private static void mul(int a,int b,int c,int d)
	{
		int e = a*b*c*d;
		System.out.println(e);
	}
	
	public static void main(String[] args)
	{
		ClassA a= new ClassA();
		a.mul(1, 2, 3);
		a.mul(5, 10);
		a.mul(2, 4, 6, 8);	
	}
}
/*output: 6
		  50
          384*/
