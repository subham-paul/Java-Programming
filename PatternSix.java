// Half Pyramid with Numbers
import java.util.Scanner;

public class PatternSix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}

// Enter a number 6
//  1    
//  1 2  
//  1 2 3
//  1 2 3 4
//  1 2 3 4 5
//  1 2 3 4 5 6