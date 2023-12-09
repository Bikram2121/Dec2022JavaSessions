package ConstructorConcept;

public class TestCustomer {

	public static void main(String[] args) {
		
		Customer c1 = new Customer("Alex", 20, "IBM");
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getCompName());
		
		
		c1.setCompName("MS");
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getCompName());
		
		Customer c2 = new Customer();
		c2.setName("Anil");
		c2.setAge(23);
		c2.setCompName("Google");
		
		System.out.println(c2.getName());
		System.out.println(c2.getAge());
		System.out.println(c2.getCompName());
		
	}

}
