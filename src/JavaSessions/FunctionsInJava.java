package JavaSessions;

public class FunctionsInJava {

	// 1. no input and no return
	// void - no return
	public void test() {
		System.out.println("test method");
		int i = 10; // local variable
		System.out.println(i);
	}

	public void getPrint() {
		System.out.println("print my paper");
	}

	// 2. no input but some return
	// return type - int

	public int getBalance() {
		System.out.println("get balance");
		int fee = 10;
		int tax = 5;
		int total = fee + tax;
		return total;
	}

	public String getTrainerName() {
		System.out.println("get trainer name");
		String name = "Vince";
		return name;
	}

	public boolean isEmpActive() {
		System.out.println("is employee active");
		return true;
	}
	// 3. some input and some return

	public int add(int a, int b) {
		int z = a + b;
		return z;
	}

	public int getCourseFee(String courseName) {
		System.out.println("get course fee for " + courseName);

		if (courseName.equals("Java")) {
			return 100;
		} else if (courseName.equals("Api")) {
			return 50;
		} else if (courseName.equals("Php")) {
			return 70;
		} else
			System.out.println("course not found");
		return -1; // if the condition doesn't match and we are returning an integer.we can return
					// -1

	}

	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		obj.getPrint();
		int t = obj.getBalance();
		System.out.println(t);
		String n = obj.getTrainerName();
		System.out.println(n);

		if (obj.isEmpActive()) {
			System.out.println("pass");
		}
		boolean b = obj.isEmpActive();
		System.out.println(b);

		int sum = obj.add(4, 7);
		System.out.println(sum);

		int sum1 = obj.add(4, 7);
		System.out.println(sum1 - 2);

		int c = obj.getCourseFee("Api");
		System.out.println(c);

		int c1 = obj.getCourseFee("ruby");
		System.out.println(c1);

		if (c1 == -1) {
			System.out.println("this is not part of the training");
		}

	}

}
