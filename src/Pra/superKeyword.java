package Pra;

 class superKeyword 
{
	int std = 11;
	//String sub = "English";
	
	public void getInfo()
	{
		System.out.println("value - 1st ");
	}
	
	
	
}
	//******************************//
	 class teacher extends superKeyword
	
		{
		 int std = 12;
		 public void getInfo()
			{
				System.out.println("value - 2nd ");
				System.out.println(std);
			}
		 
		 public void getDetails()
			{
		
			 super.getInfo(); //super class
			 superKeyword superKeyword = new superKeyword ();
			 System.out.println(superKeyword.std);

			}
		 
		 
		}
	 
		//******************************//
	
	 class InheritenceTest 
	 {

			public static void main(String[] args) 
			{
				teacher t1 = new teacher();
				t1.getDetails();
			}

		
	
}
