package Pra;

public class PracticeProgrameImp 
{
	public static void main(String [] args)
	{
		//Fibonacci Series without using recursion
		int n1 = 0 ;
		int n2 =1,n3;
		System.out.println(n1);//printing 0
		System.out.println(n2);//printing 1  
		for(int i=2; i<10 ;i++)
		{
			n3 = n1 +n2; //0 + 1
			System.out.println(""+n3);
		//  n1	n2 =  n3
			
		//	0 + 1	=  	1
			1 + 1 	=	2
			1 + 2	= 	3 		
			2 + 3 	= 	5
			3 + 5	=	8
			5 + 8 	= 	13
			
			n1=n2; 
			n2=n3; 
			
		}
	
	}
}
