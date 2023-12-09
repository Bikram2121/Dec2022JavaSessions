package OOP_Abstract;

public class AmazonTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.header();
		lp.doLogin("admin", "admin");
		
		HomePage hp = new HomePage();
		hp.title();
		hp.url();
		hp.header();
		hp.logout();
		
		//top casting:
		//child class object can be referred by parent abstract class reference variable
		
		Page p = new LoginPage();
		p.title();
		p.url();
		p.header();
		
		
		
		
	}

}
