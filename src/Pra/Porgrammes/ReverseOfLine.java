package Pra.Porgrammes;

public class ReverseOfLine {
    public static void main(String[] args){

    	/*The split() method splits a string into an array of substrings.

    	The split() method returns the new array.

    	The split() method does not change the original string.
    	*/
    	
        String s = "This is test";
        String[] s1 = s.split(" ");
        String rev = "";

        for(int i = s1.length - 1; i >= 0; i--){
            rev = rev + s1[i]+" ";
        }

        System.out.println(rev);
    }
    
    

}
