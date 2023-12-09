package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		//String to int Conversion
		int i = Integer.parseInt(x);
		System.out.println(i + 20);
		
		String y = "100A";
		String z = y.replace("A", "");
		int j = Integer.parseInt(z); // NumberFormatException: For input string: "100A"
		
		System.out.println(j+20);
	
		//String to double:
		String p ="12.44";
		System.out.println(p + 20);
		
		Double d = Double.parseDouble(p);
		System.out.println(d+20);
		
		//int to String:
		int total = 100;
		String s = String.valueOf(total); // t is internally in double quotes "100"
		System.out.println(s + 20);
		
		
	}

}
