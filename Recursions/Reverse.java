import java.util.Scanner;

public class Reverse {
    public static void printNumber(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Your number is here -> " + n);
        printNumber(n - 1);
    }

    public static void main(String args[]) {
        System.out.print("Enter number which you can reverse ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printNumber(number);
    }
}