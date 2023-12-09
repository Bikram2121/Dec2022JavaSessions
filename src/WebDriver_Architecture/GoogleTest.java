package WebDriver_Architecture;

public class GoogleTest {

	static WebDriver driver;

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		//FFDriver driver = new FFDriver();
		//cross browser logic:
		
		String browser = "chrome";
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} 
		else if(browser.equals("firefox"))
		{
			driver = new FFDriver();
		}
		else if(browser.equals("safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("pass the right browser...");
		}
		
		
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement();
		driver.findElements();
		driver.click();
		driver.sendKeys("Vikram");
		driver.close();
		
		
	}

}
