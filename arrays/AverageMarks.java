package arrays;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the students number ");
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		
		System.out.println("enter the marks ");
		
		for(int i = 0; i<n; i++) {
			marks[i] = sc.nextInt();
		}
		
		int avgMarks = 0;
		
		for(int i = 0; i<n; i++) {
			avgMarks += marks[i];
		}
		avgMarks /= n;
		System.out.println("avg marks " + avgMarks);
	}

}
