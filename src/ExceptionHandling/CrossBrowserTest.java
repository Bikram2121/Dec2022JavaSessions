package ExceptionHandling;

public class CrossBrowserTest {

	public static void main(String[] args) {

		String browser = "opera";
		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		} else if(browser.equals("FF")) {
			System.out.println("launch FF ");
		}
		else if(browser.equals("safari")) {
			System.out.println("launch safari ");
		}
		else {
			System.out.println("wrong browser...");
			throw new MyException("browser not found exception");
		}
		
	}

}
