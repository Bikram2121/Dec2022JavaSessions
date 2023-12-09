package MapConcept;

import java.util.HashMap;

public class LoginPage {

	//RBAC- Role Base Access Control
	
	public static String getUserRole(String role) {
		
		HashMap<String, String> credMap = new HashMap<>();
		credMap.put("admin", "admin@z.com;admin123");
		credMap.put("customer", "customer@gmail.com;customer123");
		credMap.put("seller", "seller@z.com;seller123");
		credMap.put("partner", "partner@z.com;partner123");
		credMap.put("distributer", "distributer@az.com;distributer123");
		credMap.put("catmanager", "catmanager@zuu.com;cat123");
		
		return credMap.get(role);
	}
	
	
	public static void doLogin(String un , String pwd) {
		System.out.println("login with : " + un + " : " + pwd);
	}
	
	
	
	
	public static void main(String[] args) {
		
		String cred[] = getUserRole("distributer").split(";");
		String un = cred[0].trim();
		String pwd = cred[1].trim(); 
		
		doLogin(un, pwd);
		
	
		
		
	}

}
