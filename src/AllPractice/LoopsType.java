package AllPractice;

public class LoopsType {

	public static void main(String [] args) {
			
//===================== For Loop =======================================
		/*
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}*/
		
		
//=========================== While Loop ==============================
		
		/* NOTES :
		The while loop loops through a block of code as long as a specified condition is true.
		Note : If you forget to increase the variable used in the condition, the loop will never end. This will crash your browser.
		Note : In while loop the condition must return a boolean value.
		while (condition) {
			  // code block to be executed
			}
		*/
		
		
		
		
		
		
		/*int i =2;
		while(i<=5) {
			System.out.println(i);
			i ++;
		}*/
		
		// ================================= do-while Loop =========================================
		
		/*
		 NOTES :
		The Java do-while loop is used to iterate a part of the program repeatedly, until the specified condition is true. If the number of iteration is not
		fixed and you must have to execute the loop at least once, it is recommended to use a do-while loop.

		Java do-while loop is called an exit control loop. 
		Therefore, unlike while loop and for loop, the do-while check the condition at the end of loop body. 
		The Java do-while loop is executed at least once because condition is checked after loop body.
		*/
		
		
		int i =1;
		
		do {
			System.out.println(i);
			i++;
		}
		while(i<0);
		
		
	}
}
