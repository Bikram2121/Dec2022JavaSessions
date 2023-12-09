package JavaSessions;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {

		// 2.Array iIterals
		int a[] = { 10, 20, 30 };

		System.out.println(a.length);
		System.out.println(Arrays.toString(a));

		double d[] = { 1.1, 2.3, 3.5 };
		System.out.println(d.length);
		System.out.println(Arrays.toString(d));

		String browsers[] = { "chrome", "FF", "IE", "Safari" };
		for (int i = 0; i < browsers.length; i++) {
			System.out.println(browsers[i]);
//			if (browsers[i].equals("FF")) {
//				System.out.println("print the browser : " + browsers[i]);
//				break;
//			}
//		}

		switch (browsers[i]) {
		case "chrome":
			System.out.println("this is coming from google");
			break;

		case "FF":
			System.out.println("this is coming from mozilla");
			break;

		case "IE":
			System.out.println("this is coming from windows");
			break;

		case "Safari":
			System.out.println("this is coming from Apple");
			break;

		default:
			System.out.println("its not a browser");
			break;
		}

	}

}
}
