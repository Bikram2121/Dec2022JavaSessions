package AccessModifier1;

public class Car {

	
	String name;
	public String color;
	protected int price;
	private int licenseNumber;
	
	
	void Brakes() {
		System.out.println("car---brakes");
	}
	
	public void gearSystem() {
		System.out.println("car--gear system");
	}
	
	protected void securitySystem() {
		System.out.println("car--security system");
	}
	
	private void registrationNumber() {
		System.out.println("car---registration number");
	}
	
	public static void main(String[] args) {
		
	Car c = new Car();
	c.name = "BMW";
	c.licenseNumber = 1234;
	
		
		
		
	}

}
