package AllPractice;

// 1st interface
interface Animal7{
	
 	abstract void print();
}


// 2nd interface
interface Cat7 {
	
	abstract void print();
}




//Multiple inheritance
class rat implements Cat7, Animal7{ 

	public void print() {
		System.out.println(" This is rat");
	}
	
	
}





public class AbstractionTest2 {

	public static void main(String[] args) {

		rat rat = new rat();
		rat.print();
	}

}


/*note : An interface can extend another Java interface only. (IMP)
	
	Q) Multiple inheritance is not supported through class in java, but it is possible by an interface, why?
			As we have explained in the inheritance chapter, multiple inheritance is not supported in the case of class because of ambiguity. However, 
			it is supported in case of an interface because there is no ambiguity.
			It is because its implementation is provided by the implementation class.*/
