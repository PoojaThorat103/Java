package MethodOverloading;

public class Adder {
	//changing number of arguments
	public int add(int a, int b)
	{
		int addition = (a+b);
		return addition;
	}
	
public double add (double a, double b)
{
	double addition = (a+b);
	return addition;
}
	public int add(int a, int b , int c)
	{
		int addition = (a+b+c);
		return addition;
	}
	// changing the data type
	
	
	public int subtraction(int a, int b)
	{
		int subtractValue = (a-b);
		return subtractValue;
	}

	public double subtraction(double a, double b , double c)
	{
		double subtractValue = (a-b-c);
		return subtractValue;
	}
	
	
	
}
