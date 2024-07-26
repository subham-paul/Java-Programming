import java.util.Scanner;

public class Q5AgeCheck {

    public static void VoteOrNot(int x) {
        if (x >= 18) {
            System.out.println("Eligible for vote");
        } else {
            System.out.println("You are not eligible");
        }
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age ");
        int age = sc.nextInt();
        VoteOrNot(age);
    }
}
