package Pra;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String args[]) {
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int checkNumber = sc.nextInt();
		
		if(checkNumber == 0 || checkNumber == 1 )
		{
			System.out.println("Not a prime number");
		}
		
		else if (checkNumber > 1 & checkNumber/checkNumber == 1)
		{
			System.out.println(" prime number");
		}
	}
}
