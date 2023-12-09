package JavaSessions;

public class Ecomm {

	// method overloading
	// within the same class,when you have number of methods
	// 1. with same name
	// 2. diferent parameters
	// 3. diferent types of parameters
	// 4.sequence of the parameters should be different

	public void login() {
		System.out.println("deafult login");
	}

	public void login(String un, String pwd) {
		System.out.println("login with :" + un + " : " + pwd);
	}

	public void login(String un, String pwd, String otp) {
		System.out.println("login with :" + un + " : " + pwd + " : " + otp);
	}

	public void login(String un, int otp) {
		System.out.println("login with :" + un + " : " + otp);
	}

	public void login(int otp, String un) {
		System.out.println("login with :" + otp + " : " + un);
	}

	public void login(long ph, int otp) {
		System.out.println("login with :" + ph + " : " + otp);
	}

	///feature name : search
	//filters:
	//1.name
	//2.name,price
	//3.name,price,seller
		
	public void search(String name) {

	}

	public void search(String name , int price) {

	}
	
	public void search(String name,int price , String seller) {

	}
	
	//payment
	public void doPayment(String cc,int otp)
	{
		
	}
	
	public void doPayment(String debit,int otp , String pwd)
	{
		
	}
	
	public void doPayment(long ph,int otp)
	{
		
	}
	
	public void doPayment(long ph,int otp , String upi)
	{
		
	}
	
	//Uber:
	//booking
	public void booking(String st , String end)
	{
	System.out.println(st);
	System.out.println(end);
	}
	
	public void booking(String st , String end , String carType)
	{
		
	}
	
	public void booking(String st , String end , String carType , String couponCode)
	{
		
	}
	
	public static void main(String[] args) {

		Ecomm e1 = new Ecomm();
		e1.login("admin", "admin");
		
	}

}
