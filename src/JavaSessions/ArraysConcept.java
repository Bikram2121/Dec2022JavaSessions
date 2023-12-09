package JavaSessions;

import java.util.Arrays;

public class ArraysConcept {
	public static void main(String[] args) {
		// int array

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[0]);
		System.out.println(i[3]);
		// System.out.println(i[4]); //arrayindexoutofboundsexception
		// System.out.println(i[-1]);//arrayindexoutofboundsexception
		// System.out.println(i); // never use this
		System.out.println(i[1] + i[2]);

		int len = i.length;
		System.out.println(len);
		System.out.println("HI = " + (len - 1));
		System.out.println("LI = " + 0);

		// print all the values from the array: for loop
		for (int j = 0; j < len; j++) {
			System.out.println(i[j]);
		}

		for (int k = 0; k <= len - 1; k++) {
			System.out.println(i[k]);
		}
		System.out.println("======================================================");
		
		//print all values without using for loop:
		System.out.println(i); // [I@379619aa
		System.out.println(Arrays.toString(i));
		
		
		System.out.println("======================================================");
		// for each loop : enhanced for loop

		for (int e : i) {
			System.out.println(e);
		}
		System.out.println("======================================================");
		// double array
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 100;
		d[2] = 72.7;
		// d[3] = 29.90; //arrayindexoutofboundsexception
		// System.out.println(d[3]);

		for (double e : d) {
			System.out.println(e);
		}

		System.out.println("======================================================");

		// char array
		char c[] = new char[3];
		c[0] = 'e';
		c[1] = '$';
		c[2] = '3';
		for (char e : c) {
			System.out.println(e);
		}
		System.out.println("======================================================");
		
		//string array 
		String lang[] = new String[4];
		lang[0] = "java";
		lang[1] = "python";
		lang[2] = "ruby";
		lang[3] = "js";	
		
		System.out.println("total length is : " + lang.length);
		System.out.println(Arrays.toString(lang));
		
		
		for (int p = 0; p < lang.length; p++) {
			System.out.println(p + ":" + lang[p]);
			
		}
		
		for (int j = 0; j < lang.length; j++) {
			System.out.println(lang[j]);
			if (lang[j].equals("ruby")) {
				System.out.println("the language is : " +lang[j]);
				break;
			}
		}
		
		
		int index = 0;
		for (String str : lang) {
			System.out.println(index +":"+ str);
			index++;
		}
		
		//Object Array :
		Object emp[] = new Object[4];
		emp[0] = "Tom";
		emp[1] = "23";
		emp[2] = "24.44";
		emp[3] = 'm';
		
		for (Object e : emp) {
			System.out.println(e);
		}
		
		//
		String product[] = new String[100];
		product[0] = "mac";
		
		
		
	}
}
