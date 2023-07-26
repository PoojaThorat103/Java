package JavaPractice;

public class Switch {
	
	public static void main(String [] args)
	
	{	
		
	int marks = 35;
	
	int numberOfAttempt = 4;
	int rank = 2;
	String Post = "";
	
	switch (rank)
	{
	case 1 : Post = "1st Winner";
	break;
	
	case 2 : Post = "2nd Winner";
		if (numberOfAttempt <3)
		{
			System.out.println("gifts  = Gold coins");
		}
		else
		{
			System.out.println("gifts  = Silver Coins");
		}
	break;
	
	case 3 : Post = "Loser";
	break;
	
	default : Post = "participant";
	}
	System.out.println("your post is = "+Post );
	
	
	/*switch (marks)
	{
	case 35: System.out.println("35 marks");
	break ; 
	
	case 40: System.out.println("40 marks");
	break;
	
	case 60: System.out.println("60 marks");
	break;
	
	default : System.out.println("Fail or Invalid marks");
	}*/
		
	}
}
