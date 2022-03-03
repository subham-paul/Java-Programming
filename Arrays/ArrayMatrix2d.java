import java.util.Scanner;

public class ArrayMatrix2d {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit for Row ");
        int rows = sc.nextInt();
        System.out.print("Enter limit for Column ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // input
        // rows
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter a number which you search above array ");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // compare with x
                if (numbers[i][j] == x) {
                    System.out.println("Your number found at location (" + i + ", " + j + ")");
                }
            }
        }

    }
}


// Enter limit for Row 2
// Enter limit for Column 3
// 1 2 3
// 4 5 6
// Enter a number which you search above array 5
// Your number found at location (1, 1)