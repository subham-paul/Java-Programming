// Inverted & Rotated Half Pyramid
public class PatternFive {
    public static void main(String args[]) {
        int n = 4;
        // outer
        for (int i = 1; i <= n; i++) {
            // blank space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// *
// **
// ***
// ****