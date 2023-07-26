package AllPractice;

public class ContinueStatement {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			if(i==5) {
				System.out.println("will execute");
				continue;
			}
			
			System.out.println(i);
		}
	}

}

/*Note : The Java continue statement is used to continue the loop. It continues the current flow of the program and skips the remaining code at 
the specified condition. In case of an inner loop, it continues the inner loop only.

We can use Java continue statement in all types of loops such as for loop, while loop and do-while loop*/