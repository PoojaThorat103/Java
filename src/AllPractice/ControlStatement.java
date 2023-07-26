package AllPractice;

public class ControlStatement {
	
	public static void main(String [] args) {
		
		
// ======================== Normal If else statement ==================================
		/*int value =00;
		
		if(value ==10) {
			System.out.println("In If statement : Value is 10");
		}
		
		else {
			System.out.println("In else statement ");
		}*/
		
		
// ========================== If else If stamenent ====================================		
		// The if-else-if ladder statement executes one condition from multiple statements.

		
		/*int age = 64 ;
		
		if(age>0 & age<18) {
			System.out.println("age is less than 18");
		}
		
		else if(age>18 & age<= 60) {
			System.out.println("age >18 and age <=60");
		}
		
		else if(age>60) {
			System.out.println("age > 60 ");
		}
		else {
			System.out.println("Invalid age value");
		}*/
		
		
//================================ Nested if statement ======================================
		
/*The nested if statement represents the if block within another if block. 
Here, the inner if block condition executes only when outer if block condition is true*/


		
		int age = 30;
		char sex = 'u';
		
		if (sex == 'F') {
			
				if(age>= 18) {
					System.out.println(" user is applicable");
				}
			
				else if(age<=50) {
					System.out.println(" user is applicable");
				}
				
				else {
					System.out.println("User is not applicable");
				}				
		}
		
		else if(sex == 'M') {
			System.out.println("Not valid");
		}
		
		
		else {
			System.out.println("user is not valid");
		}
		
		
		
		
		
		
	}

}
