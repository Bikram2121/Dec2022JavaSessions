package AccessModifier1;

public class BMW extends Car {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.name ="bmw400";
		c.color = "Red";
		c.price = 6387612;
		
		
		
		BMW b = new BMW();
		b.name = "";
		b.Brakes();
		b.gearSystem();
		b.securitySystem();
		
	}

}
