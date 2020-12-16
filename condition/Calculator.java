package condition;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Put 1st number ");
		int a = sc.nextInt();
		
		System.out.println("Put 2nd number ");
		int b = sc.nextInt();
		
		System.out.println("Enter the operation");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		int result = 0;
		
		switch(operation) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		default:
			System.out.println("INVALID OPERATION");
		}
		System.out.println("the result is = " + result);
	}

}
