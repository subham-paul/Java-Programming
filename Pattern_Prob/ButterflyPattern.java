import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String args[]) {
        // int n = 5;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number ");
        int n = sc.nextInt();

        // upper half
        for (int i = 1; i <= n; i++) {
            // 1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // 2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for (int i = n; i >=1; i--) {
            // 1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // 2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
