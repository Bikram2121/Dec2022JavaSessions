package ExceptionHandling;

public class MultipleTryCatchBlock {

	int age;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9 / 3; //AE
			TryCatchBlock obj = new TryCatchBlock();
			obj = null;
			obj.age = 20; //NPE
			System.out.println("hi");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetice exception coming...");
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			System.out.println("NPE coming here");
			e.printStackTrace();
		}
		System.out.println("bye");

	}

}
