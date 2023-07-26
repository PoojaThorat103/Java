package SuperKeyword;

class one{
	
	void info1() {
		System.out.println("one");
	}
}


class two extends one{
	void info2() {
		super.info1();
		System.out.println("two");
	}
	
}




public class NormalTest {
	public static void main (String []args) {
	one o = new one();
	o.info1();
	
	two t = new two();
	t.info1();
	t.info2();
}

}