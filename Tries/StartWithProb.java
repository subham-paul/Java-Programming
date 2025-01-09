
public class StartWithProb {

    static class Node {

        Node[] children = new Node[26];
        boolean eow;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) { // TC-> O(n)
        int idx = 0;
        Node curr = root;

        for (int level = 0; level < word.length(); level++) {
            idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }


    public static boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String args[]) {
        String words[] = {"apple", "app", "mango", "man", "man", "woman"};
        String prefix = "app";

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
            // System.out.println("Inserted Word :: " + words[i]);
        }
        System.out.println("Prefix :: " + prefix);
        System.out.println(startsWith(prefix));
    }
}
