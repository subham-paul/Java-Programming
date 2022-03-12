public class PrintPermutation {
    public static void permutationPrint(String str, int index, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            permutationPrint(newString, index + i, perm + currentChar);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        permutationPrint(str, 0, "");
    }
}
