package StaticKeyword;

public class StaticPracticeBySahil {
	
	static int a;
	
	 StaticPracticeBySahil(){
		 a = a + 10;
			System.out.println(a);
	 }
	 
	 static {  // Static block
		 a = 10;
		 System.out.println("In static");
	 }
	 
	static void add() {
	
		a = a + 10;
		System.out.println(a);
	}
	
	 void add1() {
		a = a + 10;
		System.out.println(a);
	}

	public static void main(String[] args) {
	
		System.out.println(a);
		add();
		
		StaticPracticeBySahil s1 = new StaticPracticeBySahil();
		//StaticPracticeBySahil s2 = new StaticPracticeBySahil();
		//StaticPracticeBySahil s3s = new StaticPracticeBySahil();
		
		//StaticPracticeBySahil.add();
	}

}
