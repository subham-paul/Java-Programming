import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        int m, flag = 0;
        System.out.print("enter your number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        m=n/2;
        for (int i = 2; i < m; i++) {
            if (n % i == 0) {
                System.out.println("It is non prime");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("it is prime");
        }
    }
}
