package test;

public class Calc {

	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[2]);
		double c = 0;
		String op = args[1];
		//char ch = op.charAt(0);
		
		switch(op) {
			case '+':
				c = a + b;
				break;
			case '-':
				c = a - b;
				break;
			case '*':
				c = a * b;
					break;
			case '/':
				c = a / b;
					break;
		}
		
		System.out.println("Result is = " +c);

	}

}
