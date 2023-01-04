import java.util.*;

public class PrimeOrNot {
    public static void isPrime(int x) {
        if (x % 2 == 0) {
            System.out.println("It's not prime");
        } else {
            System.out.println("It's prime");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number prime or not ");
        int n = sc.nextInt();
        isPrime(n);
    }
}
