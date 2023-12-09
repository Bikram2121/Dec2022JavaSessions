package ConstructorConcept;

public class Customer {

	private String name;
	private int age;
	private String compName;

	public Customer() {   // default const...
		System.out.println("Default const..");  
	}

	public Customer(String name, int age, String compName) { // parameterized const..
		this.name = name;
		this.age = age;
		this.compName = compName;
	}

	// getter and setter:

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	// features/methods:

	public String getCustomerInfo() {
		return name + " " + age + " " + compName;
	}

}
