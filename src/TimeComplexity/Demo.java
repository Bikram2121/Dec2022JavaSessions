package TimeComplexity;

public class Demo {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		// Big O
		// O(1) -- constant time

		int j = 20;
		int sum = i + j; // time complexity will be O(1) -- because this state will be executed only once
		System.out.println(sum);

		// 1 to 10:
		for (int k = 0; k < 10; k++) {
			System.out.println(k);
		}
		// 1+n+n+n => 1+3n ~ 3n ~ O(3n) ~ O(n)
		// 3n + 1 --> linear equation

		// inner loop & outer loop

		for (int p = 1; p <= 10; p++) {
			for (int q = 1; q <= 10; q++) {
				System.out.print(p + "" + q);
			}
			System.out.println();
		}

		// (1+n+n+n)(1+n+n+n) => (1+3n) (1+3n) =>1+3n+en+9n^2 => 9n^2+6n+1 (quadratic
		// equation)
		// 9n^2+6n => 3n(3n+2) => 3n(3n)=> 9n^2 =>n^2 => (n^2)

		for (int p = 1; p <= 10; p++) {
			for (int q = 1; q <= 10; q++) {
				for (int r = 1; r <= 10; r++) {
					System.out.print(p + "" + q + "" + r + " ");
				}
			}
			System.out.println();
		}
  
		//(1+n+n+n)(1+n+n+n)(1+n+n+n) => (1+3n)(1+3n)(1+3n) =>1+27n^3 => 27n^3 => 9(n^3) => n^3 => O(n^3)  
		
		
		
	}

}
