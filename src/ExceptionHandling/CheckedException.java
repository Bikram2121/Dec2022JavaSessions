package ExceptionHandling;

public class CheckedException {

	public static void main(String[] args) {
		System.out.println("A");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("B");
	}
	
	
}
