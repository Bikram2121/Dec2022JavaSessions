package OOP_Inheritence;

public class Vehicle extends Automobile {

	public void engine() {
		System.out.println("vehicle engine");
	}
	
	@Override
	public void start() {
		System.out.println("vehicle start");
	}
	
}
