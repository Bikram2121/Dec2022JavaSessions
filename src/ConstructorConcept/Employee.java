package ConstructorConcept;

public class Employee {

	String name;
	int id;
	int age;
	double salary;
	boolean isPerm;
	char gender;

	// constructor:
	// name of constructor will be same as class name
	// a constructor cannot have any return type
	// const.. will be called when you create the object of the class

	public Employee() { // Default constructor / zero parameter const..
		System.out.println("default const");
	}

	public Employee(int a) { // 1 parameter const..
		System.out.println(a);
	}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public Employee(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
}

	public Employee(String name, boolean isPerm  ) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.isPerm = isPerm;
}

	public Employee(String name, int id, int age, double salary, boolean isPerm, char gender) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.isPerm = isPerm;
		this.gender = gender;
	}
	
	
	
}