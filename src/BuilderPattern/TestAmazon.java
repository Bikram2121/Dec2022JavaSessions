package BuilderPattern;

public class TestAmazon {

	public static void main(String[] args) {

		EcommApp e = new EcommApp();
		
		//use case 1
		
		e.login("vikku", "vik2616").search("apple").addToCart("apple").doPayment("sadaskhd@ybi").generateOrderId()
				.logout();

		//USE CASE 2
		
		e.login("vikku", "vik2616").addToCart("Macbook").doPayment("testok@icic", 890).generateOrderId().logout();
		
		//USE CASE 3
		e.login().addToCart("puma").logout();
		
		
		
		
	} 

}
