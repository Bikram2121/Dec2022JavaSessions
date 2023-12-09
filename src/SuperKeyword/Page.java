package SuperKeyword;

public class Page {

	public Page() {
		System.out.println("Page default constructor");
	}
	
	public Page(int a) {
		System.out.println("Page default constructor : " + a);
	}
	
	public Page(int a , int b) {
		System.out.println("Page default constructor : " + (a + b));
	}
	
	int timeOut = 100;
	
	public void display() {
		System.out.println("page display");
	}
	
	
	
	
}
