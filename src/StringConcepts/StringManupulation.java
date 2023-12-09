package StringConcepts;

import java.util.Arrays;

public class StringManupulation {

	public static void main(String[] args) {

		String s = "hey this is my java code it is awesome";
		System.out.println(s.length());

		System.out.println(s.charAt(6));
		System.out.println(s.charAt(19));
		// System.out.println(s.charAt(20));//StringIndexOutOfBoundsException
		// System.out.println(s.charAt(-1));//StringIndexOutOfBoundsException

		System.out.println(s.indexOf('i'));
		System.out.println(s.indexOf('a')); // 1st occurrence of 'a'
		System.out.println(s.indexOf('a', s.indexOf('a') + 1)); // 2nd occurrence of 'a'
		System.out.println(s.lastIndexOf('a', s.lastIndexOf('e'))); // 3rd occurrence
		System.out.println(s.indexOf('a', s.indexOf('e') - 1)); // 3rd occurrence
		System.out.println(s.indexOf('a', s.indexOf('a' , s.indexOf('a')+1)+1)); // 3rd occurrence

		System.out.println(s.indexOf("code")); // 16
		System.out.println(s.indexOf("python")); // -1

		String msg = "welcome admin";
		if (msg.indexOf("admin") > 0) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		String str = "   hello world   ";
		System.out.println(str.trim());
		System.out.println(str.replaceAll(" ", ""));

		String dob = "19-01-95";
		System.out.println(dob.replace("-", "/"));

		// contains
		String s1 = "your user id is vikku automation";
		System.out.println(s1.contains("vikku automation"));
		if (s1.contains("vikku automation")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		// comparison
		String t1 = "hello java"; // string literals
		String t2 = "hello java";
		t2 = "hello python";
		System.out.println(t1.equals(t2)); // exactly matches the contents
		System.out.println(t1.equalsIgnoreCase(t2));

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1 == t2); // matches the reference variable

		String t3 = new String("hello ruby"); // new keyword-- object in heap-- 2 objects(SCP + HEAP)
		String t4 = "hello ruby"; // 0 object
		System.out.println(t3);
		System.out.println(t4);

		String t5 = new String("hello ruby"); // 1 object (heap)
		System.out.println(t3 == t5); // false , reference comparison
		System.out.println(t3 == t4); // false
		System.out.println(t3.equals(t5)); // true , value comparison

		// split: (if it doesn't split properly use 2 backslash "\\" before the character ex-: split("\\|"))

		String lang = "JAV_RUBY_PYTON_PHP";
		String langArr[] = lang.split("_");
		// System.out.println(langArr[0]);
		System.out.println(Arrays.toString(langArr));
		for (String e : langArr) {
			System.out.println(e);
			// System.out.print(e + " ");
		}
		
		String name = "xXtestingxXjavaxXXSeleniumXxXPython";
		String nameArr[] = name.split("xX");
		System.out.println(nameArr.length);
		System.out.println(Arrays.toString(nameArr));
		System.out.println(nameArr[0]);
		System.out.println(nameArr[1]);
		System.out.println(nameArr[2]);  
		System.out.println(nameArr[3]);
		System.out.println(nameArr[4]);
		
		

		String cred = "admin;admin";
		System.out.println(cred.split(";")[0]);
		System.out.println(cred.split(";")[1]);

		//String to int :  
		//String x = "100";
		String x = "100A";
		String z = x.replace("A", "");
		System.out.println(x+20);
		
		int y = Integer.parseInt(z);
		System.out.println(y+20);
		
		//String to double:
		String v= "12.33";
		System.out.println(v+20);
		
		double r = Double.parseDouble(v);
		System.out.println(r+20);
		
		//int to String :
		int w= 1100;
		System.out.println(w+20);
		
		//int to String:
		String w1 = String.valueOf(w);
		System.out.println(w1+20);
		
		//String to boolean:
		String flag = "true";
		boolean bl = Boolean.parseBoolean(flag);
		if (bl) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
		
		// substring
		String message = "your order id is 12345 is awesome";
		System.out.println(message.substring(17));
		System.out.println(message.substring(3, 15));
		System.out.println(message.substring(message.indexOf("is") + 3, message.length()));
		System.out.println(message.substring(message.indexOf("is"), message.indexOf("is") + 12));
		System.out.println(message.substring(message.indexOf("is"), message.indexOf("is") + 11));

		String test = "selenium"; // 1 object --> heap
		test.intern(); // 1 --> SCP

		String test1 = "selenium"; // 0 object

		String sp1 = new String();// 1 object will be created without any value
		System.out.println(sp1.length());

		String st = "java";
		System.out.println(st + "python");
		System.out.println(st);

		st = st + "automation";
		System.out.println(st);

		String u = "java";

		// Mutable classes:
		// StringBuilder and StringBuffer

		StringBuilder sb = new StringBuilder("Testing");
		sb.append("automation");
		System.out.println(sb);

	}

}
