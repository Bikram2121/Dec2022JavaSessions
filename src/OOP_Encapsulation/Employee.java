package OOP_Encapsulation;

public class Employee {

	public static void main(String[] args) {

		Company c1 = new Company();
		//c1.name = "HP";
		c1.hq = "Delhi";

		c1.setSharePrice(500);
		int p1 = c1.getSharePrice();
		System.out.println(p1);
		
		c1.setName("Virat");
		String p2 = c1.getName();
		System.out.println(p2);

	}

}
