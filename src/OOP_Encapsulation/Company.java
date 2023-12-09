package OOP_Encapsulation;

public class Company {

	private String name;
	private int sharePrice;
	public String hq;

	//setter
	public void setSharePrice(int sharePrice)
	{
		this.sharePrice = sharePrice;
	}
	
	//getter
	public int getSharePrice() {
		return sharePrice;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	

	public static void main(String[] args) {

		Company obj = new Company();
		obj.name = "IBM";
		obj.hq = "Bglr";
		obj.sharePrice = 100;

	}
}
