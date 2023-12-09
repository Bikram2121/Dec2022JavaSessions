package ConstructorConcept;

public class RegistrationTest {

	public static void main(String[] args) {
		
		RegistrationPage rp = new RegistrationPage("Vikku", "Mohanty", "vcxusad@gmail.com", 564128641, "qwerty", "qwerty");
		
		System.out.println(rp.getFirstName());
		System.out.println(rp.getLastName());
		System.out.println(rp.getEmail());
		System.out.println(rp.getTelephone());
		System.out.println(rp.getPassword());
		System.out.println(rp.getConfirmPwd());
		
		rp.setFirstName("Alice");
		rp.setLastName("Cooper");
		rp.setEmail("alice@gmail.com");
		rp.setTelephone(682348111);
		rp.setPassword("asdfgh");
		rp.setConfirmPwd("asdfgh");
		
		System.out.println(rp.getFirstName());
		System.out.println(rp.getLastName());
		System.out.println(rp.getEmail());
		System.out.println(rp.getTelephone());
		System.out.println(rp.getPassword());
		System.out.println(rp.getConfirmPwd());
		
		
		
		
		
		
	}

}
