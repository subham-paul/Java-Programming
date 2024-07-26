import java.util.Scanner;

public class SumOfNumber {

    public static void numberPrint(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        numberPrint(i + 1, n, sum);
    }

    public static void main(String args[]) {
        System.out.println("enter a natural number ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        numberPrint(1, 5, 0);
    }
}
