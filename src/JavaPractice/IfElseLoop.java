package JavaPractice;

public class IfElseLoop 
{
	public static void main(String [] args)
	{
		int value1 = 10;
		int value2 = 20;
		
		int age = 200;
		
		char gender = 'F';
		
		// *************** Normal If Else *************************
		/*
		if (value1 > value2)
		{
			System.out.println("value1 is greater than value2 = " + value1);
		}	
		
		else
		{
			System.out.println("value2 is greater than value1 = "  +value2);
		}*/
		
		
		// *************** If -  Else If *************************
		
		/*if(age <= 18)
		{
			System.out.println("Child");
		}
		
		else if(age >18 && age<=60)
		{
			System.out.println("Adult");
		}
		
		else if(age >60 && age<= 100)
		{
			System.out.println("Sinior Citizen ");
		}
		
		else
		{
			System.out.println("InValid data ");
		}
	*/
	
	
		// *************** Nested if statement ( if block within another if block) *************************

		if (age>= 60 && age <= 100 )
		{
			if (gender == 'M')
			{
				System.out.println("Senior Citizen -  Male ");			
			}
			
			else
			{
				System.out.println("Senior Citizen -  Female ");				
			}	
		}
		
		else 
		{
			System.out.println("user not a senior Citizen");
		}	
	}	
		
}
