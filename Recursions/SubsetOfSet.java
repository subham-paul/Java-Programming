import java.util.ArrayList;

public class SubsetOfSet {
    public static void printSubSet(ArrayList<Integer> ss) {
        int i = 0;
        while (i < ss.size()) {
            System.out.print(ss.get(i) + " ");
            i++;
        }
        System.out.println();
    }

    public static void findSubSet(int n, ArrayList<Integer> ss) {
        if (n == 0) {
            printSubSet(ss);
            return;
        }
        // Add in subset
        ss.add(n);
        findSubSet(n - 1, ss);
        // remove from subset
        ss.remove(ss.size() - 1);
        findSubSet(n - 1, ss);
    }

    public static void main(String agrs[]) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubSet(n, subset);
        // TC -> O(2^n)
    }
}
