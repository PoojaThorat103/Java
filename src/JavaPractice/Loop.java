package JavaPractice;

public class Loop {
	

	public static void main (String args [])
	{
			 
		/*
		// normal for loop
		for(int i = 10; i>= 1; i--)
		{
			System.out.println("value " +i);
		}
		*/
			// Nested For Loop
		
		for(int i =1; i<= 5; i++)
		{
			for(int j = 2 ; j<i; j++)
			{				
					System.out.println(j); 			
				
			}
		}
		
		
	
		
		//************************* For Each Loop ******************
		
		/*
		 int arr[]={12,13,14,44 , 77 ,89}; 
		 
		 for(int p :arr) {
			 System.out.println(p);
		 }
		 
		 
		 String[] names = {"Sashil", "Pooja"};
		 
		 for(String s : names) {
			 System.out.println(s);
		 }
		 
		 for(int i = 0; i<= names.length - 1; i++) {
			 System.out.println(names[i]);
		 }
		 
		 
		/* char [] ch = {'q','w', 'u' , 'r'};
		 for(char n : ch)
		 {
			 System.out.println(n);
			 
		 }
		 		 
		String [] name = {"gvfd", "ffjsd"};
		for(String ListOfName : name)
		{
			 System.out.println(ListOfName);
		}
		*/
		
		//************************* While Loop ******************
		
		/*
		int i = 5;
		while(i>3)
		{
			System.out.println(i);
			i--;
		}
		*/
		

	/*	int l = 5;
		while(l>=3)
		{
			System.out.println(l);
			l--;
		}*/
		
		//******************** The Do/While Loop *******************//
		
	/*	The loop will always be executed at least once, 
		even if the condition is false, because the code block is executed before the condition is tested:
		*/
		
	/*	
		int i = 0 ;
		do {
			System.out.println(i);
			i++;
		}
		
		while(i<=5);
		
	}
	*/
	
	
	}

}
