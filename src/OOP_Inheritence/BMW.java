package OOP_Inheritence;

public class BMW extends Car {

	// overridden method : polymorphism
	@Override
	public void start() // method overriding
	{
		System.out.println("BMW start");
	}
	

//	public void engine() {
//		System.out.println("BMW engine");
//	}

	public void autoParking() {
		System.out.println("BMW autoparking");
	}
	
//	public static void drive() {
//		System.out.println("BMW drive");
//	}
	
	
}
