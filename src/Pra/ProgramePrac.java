package Pra;

public class ProgramePrac {

	public static void main(String[] args) {
		


		/*for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();// new line
		}

		System.out.println("--------------------------");
		for (int k = 1; k <= 6; k++) {
			for (int l = 6; l >= k; l--) {
				System.out.print("* ");
			}
			System.out.println();// new line
		}*/
 
		// ---------- printing * in pieramid format -----------------------------------------------------------------------------------
		
	/*	
		//i for rows and j for columns      
		//row denotes the number of rows you want to print  
		int i, j, row = 6;       
		//Outer loop work for rows  
		for (i=0; i<row; i++)   
		{  
		//inner loop work for space      
		for (j=row-i; j>1; j--)   
		{  
		//prints space between two stars  
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   */
		
		// ---------- printing * in pieramid format -----------------------------------------------------------------------------------

		
		
		int n =4;
		for (int i = 1; i<=n ;i++) {
			for(int j=1 ;j<= n-i; j++)
			{
				System.out.print(" ");   
			}
			
		for(int k=1 ; k<=i;k++)	
		{
			System.out.print("* ");  
		}
		System.out.println();
		}
		
		
		
		
		
		
		
		
		//--------------------- EXtract number value from String -----------------------------------
		/*
		String s = "sa1h4i9l";
		// extract digits only from strings
		String numberOnly = s.replaceAll("[^0-9]", "");

		// print the digitts
		System.out.println(numberOnly);
		
		
		// A temporary string
		 String temp = "0";
		 int sum = 0;
		 for(int i=0; i<s.length();i++) {
			 char ch = s.charAt(i);
			 
			 if(Character.isDigit(ch))
				 
				 temp += ch;
			 else {
	                // increment sum by number found earlier
	                // (if any)
	                sum += Integer.parseInt(temp);
	 
	                // reset temporary string to empty
	                temp = "0";
	            }
			int finalvalue =  sum + Integer.parseInt(temp);
			System.out.println(finalvalue);
		 */
		 }
		
	}
		
	


