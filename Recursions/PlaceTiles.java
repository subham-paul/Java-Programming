public class PlaceTiles {
    public static int PlaceTiles(int n, int m) {
        if (n == m) return 2;

        if (n < m) return 1;

        // vertically
        int vertPlacements = PlaceTiles(n - m, m);

        // Horizontally
        int horPlacements = PlaceTiles(n - 1, m);
        return vertPlacements + horPlacements;
    }

    public static void main(String args[]) {
        int n = 4, m = 2;
        System.out.println(PlaceTiles(n, m));
    }
}
