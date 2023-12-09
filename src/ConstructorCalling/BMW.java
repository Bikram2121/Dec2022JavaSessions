package ConstructorCalling;

public class BMW extends Car {

	 private int min_speed = 200;

	 @Override
	 public void display() {
		 System.out.println("bmw display");
		 super.display();
	 }
	 
	 
	public void speedCal() {
		System.out.println(min_speed); // bmw
		int carSpeed = super.min_speed;
		int diff = min_speed - carSpeed;
		System.out.println(diff);
	}

	public BMW() {
		super("AUDI", 250000);
		System.out.println("BMW construtor");
	}

	public BMW(int price) {
		super("AUDI", 520000);
		System.out.println("BMW construtor");
	}

}
