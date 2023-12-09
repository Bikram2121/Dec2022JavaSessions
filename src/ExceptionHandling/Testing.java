package ExceptionHandling;

public class Testing {

	public static int div(int a, int b) {
		int z = -1;
		try {
			z = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception here...");
			e.printStackTrace();
		}
		return z;
	}

	public static void main(String[] args) {

		int d = div(10, 0);
		System.out.println(d);

	}

}
