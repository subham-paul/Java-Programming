import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("enter number ");
        int n = SC.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}

// enter number 5
// 5 
// 10
// 15
// 20
// 25
// 30
// 35
// 40
// 45
// 50