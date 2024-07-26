// Solid Rectangle & Nested Loops

import java.util.Scanner;

public class PatternOne {
    public static void main(String args[]) {
        // for(int i =0; i<=4;i++){
        // System.out.println("* * * *");
        // }

        int row, col, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row number ");
        row = sc.nextInt();
        System.out.print("enter column number ");
        col = sc.nextInt();

        for (i = 1; i <= row; i++) {
            for (j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


// enter row number 2
// enter column number 3
// * * * 
// * * *