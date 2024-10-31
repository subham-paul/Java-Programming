
import java.util.Scanner;
// import Scanner class which is in util folder inside the java folder.
// Util stands for utility and contains utility classes.
// Scanner is a predefined class for taking inputs from user.

public class HelloWorld {

    public static void main(String args[]) {
        System.out.println("Hello Subham!");

        System.out.println();
        Scanner subham = new Scanner(System.in);
        System.out.print("enter a number here ");
        int paul = subham.nextInt();
        System.out.println("Print the number is " + paul);
    }
}
