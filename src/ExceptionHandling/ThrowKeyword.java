package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args)  {
		
		try {
		throw new Exception("VikramException");
		}catch(Exception e) {
			//System.out.println("some exception is coming...");
			e.printStackTrace();
		}
		
		 
		
	}

}
