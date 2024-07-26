public class Q1Average {
    public static void printAverage(int x, int y, int z) {
        int avg = (x + y + z) / 3;
        System.out.println("Average of 3 number is " + avg);
        return;
    }

    public static void main(String args[]) {
        int a = 10, b = 20, c = 30;
        // System.out.println(printAverage(a,b,c));
        printAverage(a, b, c);
    }
}
