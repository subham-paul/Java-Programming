import java.util.Scanner;

public class Table {
    public static void Table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value ");
        int n = sc.nextInt();
        Table(n);
    }
}
