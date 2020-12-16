package condition;

import java.util.*;

public class ElseIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number=");
		int n = sc.nextInt();
		
		if(n <= 10) {
			System.out.println("less than 10");
		}else if (n > 10 && n <= 20) {
			System.out.println("greater than 10 less than 20");
		}else {
			System.out.println("greater than 20");
		}
		
	}

}
