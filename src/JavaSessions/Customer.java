package JavaSessions;

import java.util.ArrayList;
import java.util.Iterator;

public class Customer {

	public ArrayList<String> doSearch(String categoryName) {
		System.out.println("searching the product " + categoryName);
		
		ArrayList<String> prodList = new ArrayList<>();
				
		switch (categoryName) {
		case "Apple":
			prodList.add("iphone12");
			prodList.add("macbook");
			prodList.add("ipad");
			break;

		case "Samsung":
			prodList.add("S8");
			prodList.add("Galaxy");
			break;
			
		case "HP":
			prodList.add("compact");
			prodList.add("hq");
			break;

		default:
			System.out.println("product of category not found..." + categoryName);
			break;
		}
		return prodList;
	}
	
	
	//WAF: launch the browser(cross browser logic)
	//input parameter : browser name (string)
	//return : void
	
	public void launchBrowser(String browserName , int version)
	{
		System.out.println("the browser name is : " +browserName);
		if (browserName.equals("Chrome")) {
			System.out.println("launch chrome");
		}
		else if (browserName.equals("FF")) {
			System.out.println("launch ff");
		}
		else if (browserName.equals("Safari")) {
			System.out.println("launch safari");
		}
		else {
			System.out.println("please pass the right browser: " +browserName);
		}
		
	}
	
	//WAF:register a user
	//parameters: fn,ln,email,ph,password,age,dob,city,address,country
	//we will pass the class object
	
	public void registerUser()
	{
		
	}
	
	
	

	public static void main(String[] args) {
		Customer c1 = new Customer();
		ArrayList<String> appleList =  c1.doSearch("Apple");
		System.out.println(appleList.size());
		System.out.println(appleList);
		
		ArrayList<String> samsungList =  c1.doSearch("Samsung");
		System.out.println(samsungList.size());
		System.out.println(samsungList);
		
		for (String e : samsungList) {
			System.out.println("the products are : " +e);
		}

		ArrayList<String> nokiaList =  c1.doSearch("Nokia");
		System.out.println(nokiaList.size());
		System.out.println(nokiaList);
		
		
		
		c1.launchBrowser("Chrome" , 90);
		
		
		
		
	}

}
