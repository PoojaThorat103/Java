package MethodOverriding;

public class ICICI extends Bank
{

	int getRateOfIntreast(int p , int r, int n)
	{
		int y=10;
		int intreast = p*r*n/y;
		System.out.println("ICICI bank");
		return intreast;
		
	}
}
