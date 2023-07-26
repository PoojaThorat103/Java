package MethodOverriding;

public class Test 
{
	public static void main (String []args)
	{
		SBI S =  new SBI ();
		ICICI I = new ICICI();
		
		System.out.println(S.getRateOfIntreast(200, 10, 2));
		System.out.println(I.getRateOfIntreast(222, 6, 8));//(Child class)
		System.out.println(I.getRateOfIntreast(200, 10, 2));//(Main class)
		
		
		
		//Covariant Return Type - pending 
	}
}
