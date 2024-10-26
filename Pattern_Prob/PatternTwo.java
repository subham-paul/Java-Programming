// Hollow Rectangle

public class PatternTwo {
    public static void main(String[] args) {
        int row = 4, col = 4;
        // Outer loop
        for (int i = 1; i <= row; i++) {
            // Inner loop
            for (int j = 1; j <= col; j++) {
                // cell-> (i,j)
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}

// ****
// * *
// * *
// ****