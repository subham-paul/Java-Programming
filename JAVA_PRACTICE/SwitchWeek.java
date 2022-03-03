import java.util.Scanner;

public class SwitchWeek {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 7 ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("SunDay");
                break;
            case 2:
                System.out.println("MonDay");
                break;
            case 3:
                System.out.println("TuesDay");
                break;
            case 4:
                System.out.println("WednesDay");
                break;
            case 5:
                System.out.println("ThrusDay");
                break;
            case 6:
                System.out.println("FriDay");
                break;
            case 7:
                System.out.println("SaturDay");
                break;
        
            default:
            System.out.println("You enter wrong number");
                break;
        }
    }
}
