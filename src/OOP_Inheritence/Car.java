package OOP_Inheritence;

public class Car extends Vehicle {

	public final void logo() {
		System.out.println("car logo");
	}
	
	@Override
	public void start() {
		System.out.println("car start");
	}

	public void stop() {
		System.out.println("car stop");
	}

	public final void refuel() {
		System.out.println("car refuel");
	}
	
	
	public static void drive() {
		System.out.println("car drive");
	}

}
