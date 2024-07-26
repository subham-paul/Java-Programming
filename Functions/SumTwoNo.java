import java.util.Scanner;

public class SumTwoNo {

    public static int sum(int x, int y){
        int sum = x+y;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number ");
        int b = sc.nextInt();
        
        System.out.println("The sum of two value "+ sum(a,b));
    }
}
