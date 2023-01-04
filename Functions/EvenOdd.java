import java.util.*;

public class EvenOdd {

    public static boolean EvenOdd(int x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check even or odd ");
        int n = sc.nextInt();

        System.out.println(EvenOdd(n));
    }
}
