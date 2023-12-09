package SuperKeyword;

public class LoginPage extends Page {
	
	public LoginPage()
	{
		//super(10);
		super(10,20);
		
		System.out.println("hi");
		
		//System.out.println("LoginPage default constructor");
	}

	int timeOut = 200;
	
	public void loginInfo() {
		System.out.println("login info method");
		super.display(); // parent
		display(); // child
	}
	
	@Override
	public void display() {
		System.out.println("LP display");
		super.display(); 
		
	}
	
	public void getTimeOut() {
		System.out.println(timeOut);
		System.out.println(super.timeOut);
	}
	
	
	
}
