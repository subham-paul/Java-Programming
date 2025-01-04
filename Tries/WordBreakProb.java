
public class WordBreakProb {

    static class Node {

        Node[] children = new Node[26];
        boolean eow;

        public Node() {
            for (int i = 1; i <= 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) { // TC-> O(n)
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                // Add New Node
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean search(String key) {
        Node curr = root;
        int keyLen = key.length();

        for (int i = 1; i <= keyLen; i++) {
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if (node == null) {
                return false;
            }
            if (i == keyLen - 1 && node.eow == false) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static boolean checkWorkBreak(String key) {
        int len = key.length();

        if (len == 0) {
            return true;
        }
        for (int i = 1; i <= len; i++) {
            String firstPart = key.substring(0, i);
            String secPart = key.substring(i);
            if (search(firstPart) && checkWorkBreak(secPart)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String words[] = {"i", "like", "sam", "samsung", "mobile"};
        String key = "ilikesamsung";

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        // System.out.println();
        System.out.println(checkWorkBreak(key));
    }
}
