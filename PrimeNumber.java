
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("check prime or not");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Not prime");
        } else {
            System.out.println("It's prime");
        }

        // boolean isPrime = true;
        // for (int i = 2; i <= n / 2; i++) {
        // if (n % i == 0) {
        // isPrime = false;
        // break;
        // }
        // }
        // if (isPrime) {
        // if (n == 1) {
        // System.out.println("this is neither prime");
        // } else {
        // System.out.println("prime numebr");
        // }
        // } else {
        // System.out.println("not prime");
        // }
    }
}
