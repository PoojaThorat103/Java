package Pra;

import java.io.IOException;

// ------------------------- throws ----------------------------

public class ThrowsTest 
{
	
	public void test() throws IOException
	{
		System.out.println("This is test1 ");
	}
	
	/*public void testNew ()
	{	try
		{
		test(); //Case1:You caught the exception i.e. handle the exception using try/catch.
		}
		catch (Exception o)
		{
			System.out.println(o);
		}
	}
	*/
	
	public void test1() throws IOException
	{
		test(); //Case2:You declare the exception i.e. specifying throws with the method.
	}
	
	
	public static void main(String [] args) throws IOException 
	{
		ThrowsTest  t1 = new ThrowsTest ();
		//t1.testNew();
		t1.test1();
		
	}
	
	
	
	//------- throws -------
/*	1. throws use for method 
 * 	2. can use throw and throws together 
 * 	3. throws - use to information to the programmer that perticular method may throw this (mention in method) kind of exeception
 * 	4. while callig method need to handle 2 ways (1.handle with try catch 2. write as it is exeception  )
 * 	5. it is used with checked execption but we can also use with  uncheck as well 
 * 
 * Rule: If you are calling a method that declares an exception, you must either caught or declare the exception.
	There are two cases:
		Case1:You caught the exception i.e. handle the exception using try/catch.
		Case2:You declare the exception i.e. specifying throws with the method. 
	*/
	
	
	
	
}
