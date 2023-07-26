package InterviewPrograms;

public class FindMaxNumberFromArray {

	public static void main (String [] args) {
		
		/*int [] value = {10,6,29,5,1,566,2,1,} ;
		
		int max = value[0];
		
		for(int i=0; i<value.length;i++) {
			if(value[i]> max) {
				max = value[i];
			}
		}
		
		System.out.println(max);
		*/
		
		
		
		int [] value = {10,20,30,50,80,60};
		int max= value[0];
		
		for(int i =0; i<value.length;i++) {
			if(value[i]>max) {
				max = value[i];
			}
		}
		System.out.println(max);
		
		
	}
}
