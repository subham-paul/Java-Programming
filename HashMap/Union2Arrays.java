
import java.util.HashSet;

public class Union2Arrays {

    public static int union(int arr1[], int arr2[]) { // O(n)
        HashSet<Integer> st = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            st.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            st.add(arr2[j]);
        }
        return st.size();
    }

    public static void main(String args[]) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        System.out.println(union(arr1, arr2));
    }
}
