package WebDriver_Architecture;

public class FFDriver implements WebDriver {
	
	public FFDriver() {
		System.out.println("launch firefox browser....");
	}
	
	
	
	@Override
	public void findElement() {
		System.out.println("find element");
	}

	@Override
	public void findElements() {
		System.out.println("find elements");		
	}

	@Override
	public void click() {
		System.out.println("click");
		
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("enter value : " +value);
		
	}

	@Override
	public void get(String url) {
		System.out.println("launch url : " + url);
		
	}

	@Override
	public String getTitle() {
		return "some title";
	}

	@Override
	public void close() {
		System.out.println("close the browser");
	}
	
	
	
	
}
