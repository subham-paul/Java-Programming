import java.util.Scanner;

public class Print1ToN {
    public static void printASC(int n) {
        if (n == 0)
            return;

        printASC(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range = ");
        int n = sc.nextInt();
        System.out.println("Vwholah!");
        printASC(n);
    }
}
