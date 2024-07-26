// Inverted half Pyramid

public class PatternFour {
    public static void main(String args[]) {
        int n = 4;
        // Outer loop
        for (int i = n; i >=1; i--) {
            // Inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


// * * * * 
// * * *
// * *
// *