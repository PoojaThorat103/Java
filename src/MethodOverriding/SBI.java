package MethodOverriding;

public class SBI extends Bank
{

	int getRateOfIntreast(int p , int r, int n)
	{
		int intreast = p*r*n;
		System.out.println("SBI bank");

		return intreast;
	}
}
