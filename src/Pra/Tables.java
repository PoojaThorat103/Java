package Pra;

import java.util.Scanner;

public class Tables
{
	public static void main (String [] args)
	{
		System.out.println("Enter value for tables");
		Scanner sc =  new Scanner(System.in);
		int valueOfTable = sc.nextInt();
		
		for (int i =1 ; i<= 10; i++)
		{
			System.out.println(valueOfTable * i);
		}
		
		
		
		
	}
}

/*
 1*1
 3*2
 
 
dbfsdn
*/