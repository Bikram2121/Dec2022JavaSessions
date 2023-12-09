package ConstructorCalling;

public class Employee {

	String name;
	int age;
	String city;

	public Employee() {
		this("Tommy" , 25);
		System.out.println("hi employee");
//		this.name = name;
//		this.age = age;
		
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Employee(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public Employee(String name) {
//		this("Vikam" , 20 , "LA");
		this();
		this.name = name;
		this.age = 30;
		this.city= "Bangalore";
		
	}
	
	
	

}
