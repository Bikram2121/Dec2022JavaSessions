package JavaSessions;

public class Customers {

	String name;
	int id;
	static String city = "bangalore";
	static String paymentMethod = "credit card";
	
	
	public void getInfo()
	{
		System.out.println("get info.....");
	}
	
	public static void sendMail()
	{
		System.out.println("send mail.....");
	}
	
	public static void main(String[] args) {
		
		Customers obj = new Customers();
		
	//how to call static methods
	//1. call directly
		sendMail();
	//2. using class name
		Customers.sendMail();
	//using obj reference
		obj.sendMail();
		
		
		
		
	}

}
