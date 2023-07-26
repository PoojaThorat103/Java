package Pra;


class calculate  
{
	void info ()
	{
		try
		{
			int a = 100/0;
			
		}
		catch(Exception o) {
			System.out.println(o);
		}
		
		
		finally{
				System.out.println("THIS IS FINAL BLOCK");
			}
	}
}



public class ExceptionPra {

	public static void main(String [] args)
	{
		calculate C1 = new calculate();
		C1.info();
	}
}


