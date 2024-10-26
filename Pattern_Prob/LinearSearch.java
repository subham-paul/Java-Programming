import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int arr[], int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for " + i + " of index : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("which one no. you want to search ? ");
        int key = sc.nextInt();
        System.out.println("It's present index no " + linearSearch(arr, n, key) + ".");

    }
}
