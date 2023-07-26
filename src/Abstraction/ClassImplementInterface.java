package Abstraction;

interface A
{
	void a();	
	void b();
	void c();
}


abstract class Alphabets implements A
{
	/*public void c()
	{
		System.out.println(" This is C ");
	}*/
}




class characters extends Alphabets
{
	public void a()
	{
		System.out.println("This is character -  A ");
	}
	
	public void b()
	{
		System.out.println("This is character -  B ");
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}
}

public class ClassImplementInterface
{
	public static void main (String []args)
	{
			A a = new characters();
			a.a();
			a.b();
			a.c();
			
	}
}
