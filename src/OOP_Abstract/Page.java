 package OOP_Abstract;

public abstract class Page {
	// astract class obj cannot be created
	// but constructor of abstract class can be created

	public Page() {
		System.out.println("page--default constructor");
	}

	public Page(int t) {
		System.out.println("page--one param constructor" + t);
	}

	public abstract void title();

	public abstract void url();

	public void header() {
		System.out.println("page header");
	}

	public final void logo() {
		System.out.println("page logo");
	}

}
