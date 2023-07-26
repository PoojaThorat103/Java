package MethodOverloading_WithPromotion;

public class Test 
{	
	public static void main(String [] args)
	{
		Calculation1 c1 = new Calculation1();
		c1.sum(22, 22); ////now second int literal will be promoted to long  
		c1.sum( 11.11f, 11.11f);//now 1st float literal will be promoted to double  
	}
	

}
