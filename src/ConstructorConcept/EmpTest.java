package ConstructorConcept;

public class EmpTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.name = "vin";
		e1.age = 23;
		
		Employee e2 = new Employee(10);
		
		Employee e3 = new Employee("Gon", 19);
		System.out.println(e3.name +" " + e3.id + " " + e3.age + " " + e3.gender + " " + e3.isPerm);
		
		Employee e4 = new Employee("Peter", 202,25,14.77,true,'m');
		System.out.println(e4.name + " " + e4.id + " " + e4.age + " " + e4.salary + " " + e4.isPerm + " " + e4.gender);
		
		
		//
		Users u1 = new Users("Vikku", "Bangalore");
		Users u2 = new Users("Kim", 100, "Delhi");
		Users u3 = new Users("Rohit", 101, true, "Pune");
		
		//
		//MySystem sys = new MySystem();
		
		
		
	}

}
