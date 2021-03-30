package typecasting;

public class Typecast {

	public static void main(String[] args) {
		
				int a= 10;  // Integer to String
				String st1 = String.valueOf(a);
				String st2 = Integer.toString(a);

				System.out.println("Integer to String: " + st1);
				System.out.println("Integer to String: " + st2);
	
				String s = "234"; // String to Integer
				int i1 = Integer.parseInt(s);
				int i2 = Integer.valueOf(s);
				System.out.println("String to Integer : " + i1);
				System.out.println("String to Integer : " + i2);

	}	

	}


