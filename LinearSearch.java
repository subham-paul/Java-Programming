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
        
        int arr[n];
        for(int i = 1;i <= n ; i++){
            arr[i]=sc.nextInt();
        }

        int key ;
        System.out.print("find number index ");
        sc.nextInt(key);
        System.out.println(linearSearch(arr,n,key));
        
    }
}
