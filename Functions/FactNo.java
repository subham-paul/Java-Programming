import java.util.Scanner;

public class FactNo {

    public static void printFactorial(int n) {
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int factNumber = 1;
        for (int i = n; i >= 1; i--) {
            factNumber = factNumber * i;
        }
        System.out.println(factNumber);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value for show factorial number ");
        int n = sc.nextInt();

        printFactorial(n);
    }
}
