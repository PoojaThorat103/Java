package ArryaysTest;

import java.util.Scanner;

public class PassingArrayToMethod {
 /*static void empInfo(String e[])
 {
	 System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		String empData = sc.next();
		
	 	for(int i=0;i<e.length;i++)
	 		System.out.println(e[i]);
 }*/
 
 public static void main (String []args)
 {
	
	Scanner sc =  new Scanner(System.in);
	System.out.print("Enter the number of elements you want to store: ");
	int empData = sc.nextInt();
	//creates an array in the memory of length 3 
	
	int Evalue [] = new int[3];
	System.out.println("Enter the elements of the array: ");  
	for(int i=0;i <empData;i++)
	{
		//reading array elements from the user   
		Evalue[i]=sc.nextInt();  
	}
	System.out.println("Array elements are: "); 
 }
}
