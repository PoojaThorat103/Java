package String;

public class StringBufferTest {

	public static void main(String [] args) {
		/*
			StringBuilder s1 = new StringBuilder("Hello");    //String 1  
	        StringBuilder s2 = new StringBuilder(" World");    //String 2  
	        StringBuilder s = s1.append(s2);   //String 3 to store the result 
	        System.out.println(s.toString());  //Displays result  
	        
	        StringBuffer p1 = new StringBuffer("hdfs dshg etet");
	        StringBuffer p4=   p1.reverse();
	        System.out.println(p4);
	        
	        
	        StringBuffer sb=new StringBuffer("Hello ");  
	        sb.insert(3,"Java");//now original string is changed  
	        System.out.println(sb);
	        
	        StringBuffer sbw=new StringBuffer("Hellopo ");  
	        sbw.replace(2, 3, "rryre");
	        System.out.println(sbw);*/
		
		
		
		StringBuilder s1 = new StringBuilder("AAA");
		StringBuilder s2 = new StringBuilder("BBB");
		StringBuilder s3 = s1.append(s2);
		System.out.println(s3);
		
		StringBuilder s4 =  new StringBuilder("This is a cat");
		//StringBuilder s5= s4.reverse();
		System.out.println(s4.reverse());
		
		
		StringBuilder s6 = new StringBuilder("pooja"); // 	It is used to delete the string from specified startIndex and endIndex.
		System.out.println(s6.delete(1, 3));
		
		
		StringBuilder s7 = new StringBuilder("PUNE"); //  The replace() method replaces the given String from the specified beginIndex and endIndex.
		System.out.println(s7.replace(1, 3, "POLAND"));
		
		System.out.println(s7.length());
		
		
	}
}
