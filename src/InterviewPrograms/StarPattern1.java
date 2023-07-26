package InterviewPrograms;

public class StarPattern1 {

	public static void main(String[] args){
      
		for(int i =1;i<=6;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int r =1; r<=4;r++) {
			for(int c=4;c>=r;c--) {
				System.out.print("*");
			}
			System.out.println();
		}
}

}