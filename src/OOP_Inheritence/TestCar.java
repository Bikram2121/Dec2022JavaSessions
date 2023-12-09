package OOP_Inheritence;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start(); // overridden method
		b.stop(); // inherited method
		b.refuel();
		b.engine();
		b.autoId();
		b.formula();
		b.equation();

		BMW.drive();
		
		Audi a = new Audi();
		a.start();
		a.stop();
		a.theftSafety();
		a.sportsMode();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		c.engine();
		
		Car.drive();
		
		//child class object can be referred by parent class reference variable : this is called top casting
		
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		//child class object can be referred by grandparent class reference variable : this is called top casting
		Vehicle v = new BMW();
		v.engine();
		v.start();
		
		//
		Automobile auto = new BMW();
		auto.start();
		auto.autoId();
		auto.formula();
		
		
		//
		Physics ph = new BMW();
		ph.start();
		ph.formula();
		ph.equation();
		
		//
		Science sc = new BMW();
		sc.start();
		sc.equation();
		
		
	}

}
