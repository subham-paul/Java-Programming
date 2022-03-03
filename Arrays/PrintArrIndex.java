import java.util.Scanner;

public class PrintArrIndex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Array size length ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input values
        for (int i = 0; i < size; i++) {
            System.out.print("Give number ");
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        // Output
        for (int i = 0; i < size; i++) {
            if (numbers[i] == x) {
                System.out.println("X found index nmber at " + i);
            }
        }
    }
}
