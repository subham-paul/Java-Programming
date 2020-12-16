package String;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a string ");
		String str = sc.nextLine();
		
		System.out.println("your string value is " + str);

	}

};
