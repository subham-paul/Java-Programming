import java.util.Scanner;

public class MenuDriven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.print("enter marks ");
            int marks = sc.nextInt();
            if (marks >= 90 && marks <= 100) {
                System.out.println("this is great");
            } else if (marks >= 60 && marks <= 89) {
                System.out.println("also good");
            } else if (marks >= 0 && marks <= 59) {
                System.out.println("not good");
            } else {
                System.out.println("invalid");
            }
            System.out.println("enter 0<NO> or 1<YES> for you want to continue");
            input = sc.nextInt();
        } while (input == 1);
    }
}
