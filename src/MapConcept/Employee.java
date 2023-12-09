package MapConcept;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {
		//Map(I) <-- HashMap(C)
		HashMap<String, String> empMap = new HashMap<>();
		empMap.put("A", "Tom");
		empMap.put("B", "Peter");
		empMap.put("C", "Robert");
		
		System.out.println(empMap.get("A"));
		System.out.println(empMap.get("B"));
		
		HashMap<String, Integer> studentMap = new HashMap<>();
		studentMap.put("Tom", 76);
		studentMap.put("Peter", 100);
		studentMap.put("Peter", 200);
		studentMap.put(null, 400);
		studentMap.put(null, 500);
		
		System.out.println("-----------------");
		studentMap.forEach((k,v) -> System.out.println(k + ":" + v));
		System.out.println("-----------------");
		
		System.out.println(studentMap.get("Peter"));
		System.out.println(studentMap.get(null));
		
		//Traversing the HashMap
		
		HashMap<Integer, Integer> m1 = new HashMap<>();
		
		m1.put(1, 100);
		m1.put(2, 200);
		
		HashMap<Integer, String> userMap = new HashMap<>();
		
		userMap.put(101, "Tom");
		
		
		
		
		
		
	}

}
