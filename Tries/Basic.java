
public class Basic {

    static class Node {

        Node[] children = new Node[26];
        boolean eow;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) { // TC-> O(n)
        int level = 0;
        int len = word.length();
        int idx = 0;

        Node curr = root;
        for (; level < len; level++) {
            idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) { // TC-> O(L) L = Key Length
        Node curr = root;
        int KeyLen = key.length();

        for (int i = 0; i < KeyLen; i++) {
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if (node == null) {
                return false;
            }
            if (i == KeyLen - 1 && node.eow == false) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String args[]) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};
        for (String word : words) {
            insert(word);
            System.out.println("inserted " + word);
        }
        System.out.println();

        System.out.println("there -> " + search("there"));
        System.out.println("thee -> " + search("thee"));
        System.out.println("thor -> " + search("thor"));

        // System.out.println(startsWith("the"));
        // System.out.println(startsWith("thi"));
    }
}
