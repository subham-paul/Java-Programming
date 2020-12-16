package test;

public class Exception {

	public static void main(String[] args) 
	{
		try {
			String s1 = args [0];
			String s2 = args [1];
			int x1 = Integer.parseInt (s1);
			int x2 = Integer.parseInt (s2);
			int x3 = x1/x2;
			System.out.println("Divided value is = " + x3);
		}
		catch (ArithmeticException Ae) {
			System.out.println("value pass at catch 1");
		}
		catch (NumberFormatException Nfe) {
			System.out.println("print only integer value");
		}
		catch (ArrayIndexOutOfBoundsException Aioobe)
        {
            System.out.println ("PASS DATA FROM CATCH 3...");
        }
		finally {
			System.out.println("Finally print");
		}

	}

}
