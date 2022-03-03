import java.util.Scanner;

public class SumNaturalNo {
    public static void main(String args[]) {
        int i;
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number for calc sum ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Total of all numbers " + sum);
    }
}
