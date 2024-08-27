public class CountTotalPathsInMaze {
    public static int countPaths(int i, int j, int n, int m) {
        // base case
        if (i == n || j == m) return 0;

        if (i == n - 1 && j == m - 1) return 1;

        // Move Downward
        int downward = countPaths(i + 1, j, n, m);

        // Move Rightward
        int rightward = countPaths(i, j + 1, n, m);

        return downward + rightward;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println("The TOTAL No of paths -> " + countPaths(0, 0, n, m));
    }
}
