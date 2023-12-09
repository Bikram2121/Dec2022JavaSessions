package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launch broswer");
		checkVersion();
		checkOSVersion();
		checkEnoughRAM();
		System.out.println("broswer is launched");

	}

	private void checkVersion() {
		System.out.println("check browser version");
	}

	private void checkOSVersion() {
		System.out.println("check OS version");
	}

	private void checkEnoughRAM() {
		System.out.println("check enough RAM");
	}
}
