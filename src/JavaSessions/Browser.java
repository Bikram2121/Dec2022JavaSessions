package JavaSessions;

public class Browser {

	String name;
	double version;
	String vendor;
	
	public void getInfo(Browser browser)
	{
	System.out.println(browser.name+ " " + browser.version + " " + browser.vendor) ;	
	}
	
	public void sum(int a , int b)
	{
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
 
		Browser b = new Browser();
		b.name = "chrome";
		b.version= 91.8;
		b.vendor = "google";
		b.getInfo(b); // call by reference/pass by reference (we are calling a method by passing the reference)
		
		b.sum(10, 20);
		
	}

}
