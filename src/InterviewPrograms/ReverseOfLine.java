package InterviewPrograms;

public class ReverseOfLine {

	public static void main (String [] args) {
		
		 String s = "This is test";
	        String[] s1 = s.split(" ");
	        String rev = "";

	      /*  System.out.println("Thi is S1 [0] value  =  " +s1.clone()[0]);
	        System.out.println("Thi is S1 [1] value  =  " +s1.clone()[1]);
	        System.out.println("Thi is S1 [2] value  =  " +s1.clone()[2]);*/

	        
	        for(int i = s1.length - 1; i >= 0; i--){
	            rev = rev + s1[i]+" ";
	        }

	        System.out.println(rev);
	    }
	}

