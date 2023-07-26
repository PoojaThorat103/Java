package Pra;


class Teacher
{
	 Teacher()
	 {
		 System.out.println("in Constractor");
	 }
	 
	 
	 Teacher(int std , int age)
	 {
		 System.out.println("in paramiterise Constractor "+std + " " + age);
	 }
	 
	void Info()
	{
		System.out.println("in Method");
	}
	
}

public class ConstractorPra 
{
	public static void main(String [] args)
	{
		Teacher t1 = new Teacher();
		Teacher t2 = new Teacher( 32 ,  30);
		//t1.Info();
	}
}
