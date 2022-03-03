import java.util.Scanner;

public class ProductTwoNo {

    public static int product(int a, int b) {
        int result = a * b;
        return result;
    }

    public static void main(String args[]) {
        Scanner subham = new Scanner(System.in);
        System.out.print("Enter a integer number ");
        int x = subham.nextInt();
        System.out.print("Enter 2nd integer number ");
        int y = subham.nextInt();

        System.out.println("Your two numbers of product is " + product(x, y));
    }
}
