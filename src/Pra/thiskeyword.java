package Pra;

public class thiskeyword 
{
	int i ;
	int j ;
	
	thiskeyword(int i , int j)
	{
		this.i = i;
		this.j = j ;
		
		
	}
	
	public void test()
	{
		System.out.println(i+ "_" + j);
		
	}

		public static void main(String [] args)
		{
		thiskeyword t1 =  new thiskeyword(10, 20 );
		t1.test();

		}

}