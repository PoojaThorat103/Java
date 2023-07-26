package InterviewPrograms;

public class StartPattern2 {

	public static void main (String []args) {
		
		for(int i =1;i<=4;i++) {
			
			for(int spc=4;spc>=i;spc--) {
				System.out.print(" ");
			}
			
			for(int col=1;col<=i;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
}
	
}
	
	
		
	
		      