package whileLoops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		
//		while(temp > 0) {
//			
//			int lastDigit = temp % 10;
//			
//			temp /= 10;
//			
//			sum += lastDigit;
//		}		
//		System.out.println("sum of the digits " + n + " is " + sum);

//check for how many numbers you can try to added
		int numberOfDigits = (int)Math.log10(n) + 1;
		
		System.out.println(numberOfDigits);
	}
}
