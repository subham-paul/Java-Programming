import java.util.Scanner;

public class PrintFact {
    public static void printFact(int n, int val) {
        if (n == 0) {
            System.out.println("Factorial Value is " + val);
            return;
        }
        val *= n;
        printFact(n - 1, val);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range ");
        int n = sc.nextInt();
        printFact(n, 1);
    }
}
