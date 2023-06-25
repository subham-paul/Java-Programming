import java.util.Scanner;

public class SumOfTwoNo {
    public static void main(String args[]){
    // System.out.println("Max value "+ Integer.MAX_VALUE);
    // System.out.println("Min value "+ Integer.MIN_VALUE);
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd number ");
    int b = sc.nextInt();

    int sum = a+b;

    System.out.println("Sum is " + sum);
    }
}
