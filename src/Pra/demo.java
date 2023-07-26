package Pra;

public class demo 
{

	public void test1()
	{
		System.out.println("hi");
		this.test2();
	}
	
	public void test2()
	{
		System.out.println("hello");
	}
	
	
	public static void main(String [] args)
	{
		demo  d1 =  new demo ();
		d1.test1();

	}
}
