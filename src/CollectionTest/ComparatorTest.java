package CollectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class student1{
	int rollno;  
	String name;  
	int age; 
	
	student1(int rollno, String name, int age){  
		
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
}
	class AgeComparator implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			student1 s1=(student1)o1;  
			student1 s2=(student1)o2;  
			
			if(s1.age==s2.age)
			return 0;
			else if(s1.age>s2.age)  
			return 1;  
			else  
			return -1;  
		}
		
	}

public class ComparatorTest {

		public static void main (String [] args) { 
			ArrayList al = new ArrayList();
			al.add(new student1(10, "sahil" , 30));
			al.add(new student1 (12 , "pooja" , 28));
			
			System.out.println("Sorting by age");  
			  
			Collections.sort(al,new AgeComparator()); 
			
			Iterator itr=al.iterator();  
			while(itr.hasNext()){  
				System.out.println(itr.next());
				student1 st=(student1)itr.next();  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
			}  
			
		}
}
