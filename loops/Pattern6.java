package loops;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n-i; j++) {
				System.out.print("  "); //2(n-i)
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}

	}

}
