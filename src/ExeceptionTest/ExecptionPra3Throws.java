package ExeceptionTest;

import java.io.IOException;
import java.sql.SQLException;

class Bike{
	
	void run()throws IOException {
		System.out.println(" throws IOException ");
	}
	
	void info() throws IOException {
		run();
		System.out.println("rest of code");
	}
	
	
	class B{
		
		void info() throws IOException{
			System.out.println("IO");
		}
		
		void info2() throws IOException {
			info();
		}	
		
	}
	
	class C extends B{
		
		void work() throws IOException {
			info();
		}
		
		
		
	}

}

public class ExecptionPra3Throws {
	
	public static void main(String[] args) throws IOException {
		Bike B1 = new Bike();
		B1.info();
	}

}
