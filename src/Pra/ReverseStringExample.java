package Pra;

import java.util.Scanner;

import javax.jws.soap.SOAPBinding;

class ReverseStringExample
{
	 
public static void main(String args[])  
 {
	/*System.out.println("Enter number");
	Scanner sc =  new Scanner(System.in);
	int s1 = sc.nextInt();*/

	String s = "Pooja";
	String revString = "";
	
	System.out.println("after reverse" );
	
	for (int i=s.length()-1; i>=0; i--)
	{ 
		revString = revString + s.charAt(i);
	}
	
	System.out.print(revString); 
	
	
	
	/*String name;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name");
	 name = sc.nextLine();
	
	System.out.println("After reverse");
	for (int i = name.length(); i>=0 ; i--)
	{
		name = name  + name.charAt(i);
		System.out.println(name);
	}*/
	

	
	
 }
 
}
