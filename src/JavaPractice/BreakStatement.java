package JavaPractice;

public class BreakStatement {
	
	public static void main (String args[])
	{
		// *******************  Break Statement with Loop *********************************
		
		/*
		for(int i =1; i<=10; i++)
		{
			if (i==6)
			{
				System.out.println("i eual to 2");
				break;
				
			}
			
			System.out.println(i);
		}
		*/
		
		int j = 10;
		while(j>11)
		{
			System.out.println(j);
			j++;
			
			if (j>=9)
			{
				System.out.println(" j>= 9");
				break;
				
			}
		}
		
		System.out.println(" check value ");
	}

}
