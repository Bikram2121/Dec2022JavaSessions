package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
		System.out.println(numbers);

		int i[] = { 10, 20, 30, 40 }; // array literals
		System.out.println(i);
		System.out.println(Arrays.toString(i));

		ArrayList<String> names = new ArrayList<>(Arrays.asList("java", "python", "ruby", "c++"));

		System.out.println(names);

		ArrayList<String> n1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
		ArrayList<String> n2 = new ArrayList<>(Arrays.asList("A", "B", "C", "F"));
		ArrayList<String> n3 = new ArrayList<>(Arrays.asList("C", "B", "A", "D"));

		System.out.println(n1.equals(n3));

		System.out.println(n3);
		Collections.sort(n3);
		System.out.println("---" + n3);
		Collections.reverse(n3);
		System.out.println("---" + n3);
		Collections.sort(n3, Collections.reverseOrder());
		System.out.println("---" + n3);
		System.out.println(n1.equals(n2));
		System.out.println(n1.equals(n3));

		if (n1.equals(n3)) {
			System.out.println("pass");

		}

		ArrayList<String> n4 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
		ArrayList<String> n5 = new ArrayList<>(Arrays.asList("A", "B", "C", "F"));

		n4.removeAll(n5);
		System.out.println(n4);

//		n5.removeAll(n4);
//		System.out.println(n4);
//		n4.retainAll(n5);
//		System.out.println(n4);

		// find out the common elements

		ArrayList<String> lang1 = new ArrayList<>(Arrays.asList("java", "python", "ruby", "c++"));
		ArrayList<String> lang2 = new ArrayList<>(Arrays.asList("java", "python", "ruby", "php"));

		lang1.retainAll(lang2);
		System.out.println(lang1);

		ArrayList<String> n6 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
		ArrayList<String> n7 = new ArrayList<>(Arrays.asList("F", "G", "Q", "R"));
		n6.addAll(n7);
		System.out.println(n6);
		System.out.println(n7);
		n7.clear();
		System.out.println(n7);

		ArrayList<String> cloneList = (ArrayList<String>) n7.clone();
		System.out.println(cloneList);

		ArrayList<String> n8 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
		n8.add(4, "K");
		System.out.println(n8);

	}

}
