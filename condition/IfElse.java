package condition;

import java.util.*;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number=");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}

	}

}
