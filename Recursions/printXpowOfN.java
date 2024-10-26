import java.util.Scanner;

public class printXpowOfN {
    static int tot=1;
    public static void recXofN(int x, int n) {
        // BC
        if (n == 0) {
            System.out.println("Output is " + tot);
            return;
        }
        tot *= x;
        recXofN(tot, n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter for X ");
        int x = sc.nextInt();
        System.out.print("Enter for N ");
        int n = sc.nextInt();

        recXofN(x, n);
    }
}
