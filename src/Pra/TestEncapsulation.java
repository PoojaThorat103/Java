package Pra;

public class TestEncapsulation {

	public static void main(String[] args) {
	
		EncapsulationProgram E1 = new EncapsulationProgram();
		E1.setName("pooja");
		E1.setAddreass("poland");
		E1.setId(123);
		E1.setage(22);
		
		System.out.println(E1.getName());
		System.out.println(E1.getAddreass());
		System.out.println(E1.getId());
		System.out.println(E1.getage());
	}

}
