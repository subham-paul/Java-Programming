import java.util.Scanner;

public class Q2SumOddEven {

    public static void SumOdd(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for showing sum ");
        int n = sc.nextInt();
        SumOdd(n);
    }
}
