package InterviewPrograms;

public class FindMinNumberFromArray {

public static void main(String [] args) {
	
	int [] a = {45, 65 ,8787, 0, 1234};
	
	int min = a[0];
	
	for(int i =0; i<a.length; i++) {
		
		if(a[i]<min) {
			
			min = a[i];
		}
	}
	
	System.out.println(min);
	
}
		
}
