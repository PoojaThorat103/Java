package AllPractice;

public class SwitchStatement {
	
	public static void main(String [] args) {
		
		//======================== Int data type switch case ==================================
	
	int age =20;
	
	switch(age) {
	
	case 10: System.out.println("this is 10 ");
	break;
	
	case 20: System.out.println("this is 20");
	break;
		
	case 30: System.out.println("This is 30");
	break;
	
	
	default: System.out.println("Invalid value");
	
	/*A switch statement can have an optional default case, which must appear at the end of the switch. 
	The default case can be used for performing a task when none of the cases is true. No break is needed in the default case.*/
	
	}
		
		//======================== String data type switch case ==================================
		
		String day = "yyyyy";
		
		switch(day) {

		
		case "Monday": System.out.println("Monday");
		break;
		
		case "Tuesday": System.out.println("Tuesday");
		break;
		
		
		default: System.out.println("Invalid day value");
		
		}
		
		
		
	
	}

}
