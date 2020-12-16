package operators;

import java.util.*;

public class LogicalOp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number=");
		int n = sc.nextInt();
		
		/*if(n >= 1 && n <= 100) {
			System.out.println("value in range");
		}else {
			System.out.println("out of range");
		}*/
		
		if(n >= 1 || n <= 100) {
			System.out.println("value in range");
		}
	}

}
