import java.util.*;;

public class B_PrintPermutation {
    public static void printPerm(String str, String perm, int idx) {
        // base case
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPerm(newStr, perm + currChar, idx + 1);
        }
    }

    // TC-> O(n * n!)

    public static void main(String args[]) {
        String str = "ABC";
        printPerm(str, "", 0);
    }
}
