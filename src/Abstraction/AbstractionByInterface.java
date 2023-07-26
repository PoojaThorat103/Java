package Abstraction;

 interface Univerciry 
{
	public abstract void GetResult();   
}

class School1 implements Univerciry
{
	public void GetResult()
	{
		System.out.println(" School1 Result - 70%");
	}
}

class School2 implements Univerciry
{
	public void GetResult()
	{
		System.out.println("School2 Result -80%");
	}
}

 class AbstractionByInterface 
{

	public static void main (String []args)
	{
		Univerciry U1 = new School2 ();
				U1.GetResult();
	}
}
