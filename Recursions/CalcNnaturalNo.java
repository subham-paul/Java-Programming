import java.util.Scanner;

public class CalcNnaturalNo {
    public static void sumOfN(int n, int sum) {
        if (n == 0) {
            System.out.println("Sum is " + sum);
            return;
        }
        sum += n;
        sumOfN(n - 1, sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range ");
        int n = sc.nextInt();
        sumOfN(n, 0);
    }
}
