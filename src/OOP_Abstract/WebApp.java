package OOP_Abstract;

public abstract class WebApp {

	//0% abstraction -- no abstract methods used
	//100% abstraction -- only abstract methods used
	//0-100% abstraction -- abstract + non abstract methods used
	
	
	public void url() {
		System.out.println("Web--url");
	}

	public void title() {
		System.out.println("Web--title");
	}
	
	public abstract void header();
	public abstract void footer();
	
	
	
	
}
