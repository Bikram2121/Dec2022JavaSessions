package JavaSessions;

public class Car {

	String name;
	int price;
	String color;
	static int wheels=4;
	
	//static class variables should be the common value
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 69000;
		c1.color = "Blue";
		
		
		Car c2 = new Car();
		c2.name = "TVS";
		c2.price = 60000;
		c2.color = "Red";
		
		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 82000;
		c3.color = "Yellow";
		
		System.out.println(c1.name + ": " + c1.price + ":" + c1.color);
		//how to access static variables
		//1. within the same class,you can access them directly (not a good practice)
		
		System.out.println(wheels);
		
		//2. you can call by the class name
		
		System.out.println(Car.wheels);
		
		//3. call by object reference (not a good practice)
		System.out.println(c1.wheels);
	}

}
