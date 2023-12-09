package ExceptionHandling;

public class TryCatchBlock {

	//String name;
	int age;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		TryCatchBlock obj = new TryCatchBlock();

//		obj.name = "tom";
//		obj = null;
		try{
		obj.age = 20;
		}
		catch(NullPointerException ne) {
			System.out.println("NPE starts here");
			ne.printStackTrace();
		}
		System.out.println(obj.age);
		try {
			// System.out.println(obj.name);// NPE
			int i = 9 / 0;
			System.out.println("hi");
			System.out.println("hi");
			System.out.println("hi");

		}
//			catch (Error e) {
//				System.out.println("some exception is coming...");
//				e.printStackTrace();
//			}		
		catch (Error e) {
			System.out.println("arithmetic exception is coming...");
			e.printStackTrace();

		} catch (NullPointerException n) {
			System.out.println("null exception....");
			n.printStackTrace();
		}

		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

	}

}
