package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100); //0
		ar.add(200);//1
		ar.add(300);//2
		System.out.println(ar.size());
		
		ar.add(400);//3
		ar.add(10.66);
		
		
		
		System.out.println(ar.size());
		System.out.println(ar.get(1));
		//System.out.println(ar.get(4)); //indexoutofboudexception
		//System.out.println(ar.get(-1));//indexoutofboudexception
		
//		ar.remove(2);
//		System.out.println(ar.get(2));
//		System.out.println(ar.size());
		
		// to print all the values from ArrayList :use for loop
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		
		
		
		
	}

}
