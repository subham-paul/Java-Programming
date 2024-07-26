import java.util.Scanner;

public class BasicString {
    public static void main(String args[]) {
        /*
         * String name = "Subham";
         * String fullName = "Subham Paul";
         * String fDetails = "I am Subham Paul";
         * System.out.println(name);
         * System.out.println(fullName);
         * System.out.println(fDetails);
         */

        Scanner sc = new Scanner(System.in);
        /*
         * System.out.print("Enter F_Name ");
         * String name = sc.next();
         * System.out.print("Enter L_Name ");
         * String sName = sc.next();
         * // String Concatenation
         * System.out.println("Welcome " + name + " "+ sName);
         */
        /*
         * System.out.print("Enter Full name ");
         * String name = sc.nextLine();
         * System.out.println("Good Morning, "+name);
         */

        // String length
        String user = "Akash";
        // System.out.println(user.length());

        // charAt
        // for (int i = 0; i < user.length(); i++) {
        // System.out.println(user.charAt(i));
        // }

        // comparision
        String model = "Apple";
        String model1 = "apple";
        /*
         * if (model.compareTo(model1) == 0) {
         * System.out.println("Equal");
         * } else {
         * System.out.println("Not Equal");
         * }
         */

        // if (model == model1) {
        // System.out.println("Equal");
        // } else {
        // System.out.println("Not Equal");
        // }
/* 
        // Not equal for String builder reason
        if (new String("Subham") == new String("Subham")) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
 */

    // SubString
        String Sentence = "My name is Subham Paul";
        // String name = Sentence.substring(3, Sentence.length());
        // String name = Sentence.substring(3, 7);
        String name = Sentence.substring(18);
        // System.out.println(name);
        System.out.println(name);
    }
}