package String;

public class StringBuilderTest {

	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		
		
		
		StringBuilder s1 =  new StringBuilder ("Pooja");
		s1.append("Thul");
		System.out.println(s1);
		
		
		StringBuilder sb1=new StringBuilder("Hello");  
		sb1.replace(1,3,"Java");  
		System.out.println(sb1);//prints HJavalo  
		
		
		StringBuilder sb2=new StringBuilder("Hello");  
		sb2.delete(1,3);  
		System.out.println(sb2);//prints Hlo  
		
	}

}
