import java.util.*;

public class Q4Circumfence {
    public static Double getCircumference(Double radius) {
        return 2 * 3.14 * radius;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. ");
        Double r = sc.nextDouble();
        System.out.println(getCircumference(r));
    }
}