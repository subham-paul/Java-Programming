package loops;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("enter the number ");
		int n = sc.nextInt();
		
		//PRINT HELLO WORLD USER CHOICE
		/*for(int i = 0; i < n; i=i+1) {
			System.out.println(i +" Hello World!");
		}*/
		
		//PRINT HELLO WORLD USING FOR LOOPS EVEN TIMES
		/*for(int i = 0; i < n; i=i+2) {
			System.out.println(i +" Hello World!");
		}*/
		
		//CHECK TOTAL OF THE VARIABLE
		/*int sum = 0;
		for(int i = 1; i<= n ; i++) {
			sum = sum + i;
		}
		System.out.println("sum " + sum);*/
		
		//FOR DECREMENT LOOP
		/*for (int i = n ; i> 0; i--) {
			System.out.println(i);
		}*/
		
		//FOR NUMBER TABLE
		int tableOf = n;
		for(int i = 1; i<= 10; i++ ) {
			System.out.println(tableOf * i);
		}
		
		//FOR PRINT INFINITE LOOPS
		/*for(int i = 0; i<10; ) {
			System.out.println(i);
		}*/
		
		/*for(int i = 0; i<10; i-- ) {
			System.out.println(i);
		}*/
		
		/*for(int i = 0; ;i++ ) {
			System.out.println(i);
		}*/
		
		/*for(; ; ) {
			System.out.println("hello world");
		}*/
	}

}
