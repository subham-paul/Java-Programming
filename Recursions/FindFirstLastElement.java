public class FindFirstLastElement {
    public static int first = -1;
    public static int last = -1;

    public static void elementRecursive(String str, char element, int index) {
        if (index == str.length()) {
            return;
        }
        if (str.charAt(index) == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        elementRecursive(str, element, index + 1);
    }

    public static void main(String args[]) {
        String str = "abcdaabhyapi";
        char ele = 'a';
        elementRecursive(str, ele, 0);
        System.out.println("First element Occurence: " + first);
        System.out.println("Last element Occurence: " + last);
    }
}
