package JavaSessions;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListGenerics {

	public static void main(String[] args) {

		// int AL:
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(100);
		ar.add(200);

		// for each loop
		for (Integer e : ar) {
			System.out.println(e);
		}
		System.out.println("------------------");
		for (int t : ar) {
			System.out.println(t);
		}
		System.out.println("--------for loop----------");
		
		for (int i = 0; i < ar.size(); i++) {
			int index = ar.get(i);
			System.out.println(index);
		}
		
		// double AL:
		ArrayList<Double> db = new ArrayList<>();
		db.add(12.44);
		db.add(4.00);

		System.out.println("------------------");

		for (Double double1 : db) {
			System.out.println(double1);
		}
		
		System.out.println("--------for loop----------");
		for (int j = 0; j < db.size(); j++) {
			double d1 = db.get(j);
			System.out.println(d1);
		}
		
		
		
		
		// String AL:
		ArrayList<String> prodList = new ArrayList<>();
		prodList.add("toyota");
		prodList.add("hyundai");
		prodList.add("tata");

		System.out.println("------------------");

		for (String s : prodList) {
			System.out.println(s);
		}
		System.out.println("--------for loop----------");
		for (int k = 0; k < prodList.size(); k++) {
			String prodName = prodList.get(k);
			System.out.println(prodName);
		}

		// Object data AL:
		ArrayList<Object> obj = new ArrayList<>();
		obj.add("Tom");
		obj.add(100);
		obj.add(27);
		obj.add(30.54);
		obj.add(true);

		System.out.println("------------------");

		System.out.println(obj.size());

		for (Object e : obj) {
			System.out.println(e);
		}

		System.out.println("--------for loop----------");
		
		for (int l = 0; l < obj.size(); l++) {
			Object item = obj.get(l);
			System.out.println(item);
		}
		
	}

}
