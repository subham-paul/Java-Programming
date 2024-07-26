import java.util.Scanner;

public class ArrayIpOp2d {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit for Row ");
        int row = sc.nextInt();
        System.out.print("Enter limit for Column ");
        int col = sc.nextInt();

        int[][] numbers = new int[row][col];

        // input
        // rows 
        for (int i = 0; i < row; i++) {
            // columns
            for (int j = 0; j < col; j++) {
                numbers[i][j]=sc.nextInt();
            } 
        }
        // output 
        System.out.println("Your output is ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
