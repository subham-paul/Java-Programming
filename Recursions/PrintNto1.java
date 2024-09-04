import java.util.Scanner;

public class PrintNto1 {
    public static void printDesc(int n) {
        if (n == 0)
            return;

        System.out.print(n + " ");

        printDesc(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No = ");
        int n = sc.nextInt();
        printDesc(n);
    }
}
