package OOP_Encapsulation;

public class AmazonTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage("Vince007" , "Vince123");
		
//		lp.setUsername("Gon232");
//		lp.setPassword("Gon522");
		
			
		lp.doLogin(lp.getUsername(), lp.getPassword());
		
		
		
		
//		lp.setUsername("admin11");
//		lp.setPassword("27182");
//		
//		lp.login(lp.getUsername(), lp.getPassword());
//		
//		lp.setPassword("829379");
//		
//		lp.login(lp.getUsername(), lp.getPassword());
//		
//		LoginPage lp1 = new LoginPage();
//		lp1.login(lp.getUsername(), lp.getPassword());
		
	}

}
