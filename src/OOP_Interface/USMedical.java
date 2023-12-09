package OOP_Interface;

public interface USMedical extends WHO {

	// cannot have method body
	// only method prototype --abstract methods(only non static methods )
	// no method body, only method declaration
	// interface cannot have business logic
	// cannot create the object of interface
	//

	public int min_fees = 100;
	
	public void physioSercvices();

	public void cardioSercvices();

	public void oncologySercvices();

	public void emergencySercvices();

	// after jdk 1.8:
	// 1. you can have static methods with the body

	public static void billing() {
		System.out.println("US medical -- billing");
	}
	
	//2. you can have default mathod with a method body
	default void medInsurance() {
		System.out.println("US med Insurance");
	}
	

}
