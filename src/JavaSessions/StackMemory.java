package JavaSessions;

public class StackMemory {

	public static void t1() {
		System.out.println("t1");
		t2();
	}

	public static void t2() {
		System.out.println("t2");
		t3();
	}

	public static void t3() {
		System.out.println("t3");
		StackMemory o2 = new StackMemory();
		o2.m1();
	}

	public void m1() {
		System.out.println("m1");
		int i =10;
		m2();
	}

	public void m2() { 
		System.out.println("m2");
		int p =20;
		m3();
	}

	public void m3() {
		System.out.println("m3");
		//m1();
		StackMemory.t1();
	}

	public static void main(String[] args) {

		StackMemory obj = new StackMemory();
		obj.m1();
		
		
		

	}

}
