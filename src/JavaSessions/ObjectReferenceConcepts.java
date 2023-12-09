package JavaSessions;

public class ObjectReferenceConcepts {
	//class data members:
	
	//class variables
	String 	name;
	int age;
	
	//methods
	public void get() {
		System.out.println("get method");
	}
	
	
	
	
	public static void main(String[] args) {
		
		ObjectReferenceConcepts obj = new ObjectReferenceConcepts();
		obj = null; // null reference object
		
		obj.name = "tom"; //Null pointer exception
		obj.age = 23;
		System.out.println(obj.name);
		System.gc();
	}

}
