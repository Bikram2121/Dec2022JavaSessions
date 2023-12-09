package JavaSessions;

public class MainMethodOverloading {

	public static void main(String a[]) {   // this is called command line argument
		System.out.println("main 1");

	}

	public static void main(int a) {
		System.out.println("main 2" + a);
	}

	public static void main(String a) {
		System.out.println("main 4" + a);
	}

	public static void main(int a, int b) {
		System.out.println("main 3" + a + b);
	}

}
