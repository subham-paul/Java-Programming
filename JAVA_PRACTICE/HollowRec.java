import java.util.Scanner;

public class HollowRec {
    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        System.out.print("enter row ");
        int row = SC.nextInt();
        System.out.print("enter col ");
        int col = SC.nextInt();
        
        for(int i=1;i<=row;i++){
            for(int j =1;j<=col;j++){
                if (row==0 && row==col) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
