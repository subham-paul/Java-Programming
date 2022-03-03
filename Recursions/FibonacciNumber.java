import java.util.Scanner;

public class FibonacciNumber {

    public static void printFibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int sum = a + b;
        System.out.println(sum);
        printFibonacci(b, a + b, n - 1);
    }

    public static void main(String args[]) {
        System.out.print("Enter number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        // int n = 4;
        printFibonacci(a, b, n - 2);
    }
}
