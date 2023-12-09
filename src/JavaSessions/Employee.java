package JavaSessions;

public class Employee {
	String name;
	int age;
	String city;
	double salary;
	boolean isPerm;
	char gender;
	
	public static void main(String[] args) {
	
		Employee e1 = new Employee();
		e1.name = "Tom";
		e1.age = 28;
		e1.city = "Delhi";
		e1.salary= 12.44;
		e1.isPerm = true;
		e1.gender = 'm';
		System.out.println(e1.name+ " " + e1.age + " " + e1.city);
		
		
		Employee e2 = new Employee();
		e2.name = "Fom";
		e2.age = 29;
		e2.city = "Mumbai";
		e2.salary= 12.24;
		e2.isPerm = false;
		System.out.println(e2.name+ " " + e2.age + " " + e2.city);
		
		e1= e2;
		System.out.println(e1.name+ " " + e1.age + " " + e1.city);
		System.out.println(e2.name+ " " + e2.age + " " + e2.city);
		
	}

}
