package loops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter number ");
		int n = sc.nextInt();
		
		float result = 0;

//SERIES SUM - 1
//		for(float i = 1; i<=n; i++) {
//			
//			result += 1 / i;
//			
//		}
//		
//		System.out.println("result " + result);
		
//SERIES SUM - 2
		for(float i = 1; i<=n; i++) {
			
			if(i % 2 == 0) {
				result -= 1/i;
			} else {
				result += 1/i;
			}
		}
		System.out.println("result " + result);
	}
	

}