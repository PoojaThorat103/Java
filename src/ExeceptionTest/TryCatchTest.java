package ExeceptionTest;

public class TryCatchTest {
public static void main(String [] args)
{
		try
		{
			int a =  100 , b = 2  ;
			int c = a/b ;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	
	
	
		try
		{
		int r[] = new int[3];
		r[0] = 10;
		r[1] = 20;
		r[2] = 30;
		r[3] = 40;
		//System.out.println(r[3]);
		for (int i =0 ; i<r.length; i++)
		System.out.println(r[i]);
		}
		catch(Exception p)
		{
			System.out.println(p);	
		}
		
		
		try{
			String name = null;
			System.out.println(name.length());
		}
		catch(NullPointerException  ex)	
		{
		System.out.println(ex);
		System.out.println("catch block ");
		}
	}

}
