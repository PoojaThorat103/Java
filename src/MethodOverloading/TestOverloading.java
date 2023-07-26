package MethodOverloading;

/*
There are two ways to overload the method in java

By changing number of arguments
By changing the data type*/

public class TestOverloading {
	
	public static void main(String[] args)
	{  
		Adder Adder1 = new Adder();
		System.out.println(Adder1.add(20,20));
		System.out.println(Adder1.add(33.3, 66.0));
		System.out.println(Adder1.add(20, 20, 20));
		System.out.println(Adder1.subtraction(20, 10));
		System.out.println(Adder1.subtraction(11.11,12.12, 13.13));
		System.out.println(Adder1.add(11.11, 22.22));
	}
	
}
