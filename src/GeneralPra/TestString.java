package GeneralPra;

public class TestString {
	public static void main (String [] args) {
		String s = "sahil";
		String p = "pooja";
		
		 String s1 = new String("sahil");
		 System.out.println(s.equals(s1));
		 System.out.println(s==s1);

		 String ch ="ajhhgeufidsgoafgu";
		 //String rep = ch.replace("a", "*");
		 String rep = ch.replaceAll("[aA,eE]", "*");
		 System.out.println(rep);
		 
		 
		 String name = "POOJA";
		 String name1 = name.trim();
		 String name3 = name.toLowerCase();
		 System.out.println("name 3 - reture in lower case " + name3);
		 System.out.println(name1);
	}
	
	 

	
	 
}
