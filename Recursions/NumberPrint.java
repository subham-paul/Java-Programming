public class NumberPrint {
    public static void SerialPrint(int n) {
        if (n == 5) {
            return;
        }
        System.out.println(n);
        SerialPrint(n + 1);
    }

    public static void main(String args[]) {
        int number = 1;
        SerialPrint(number);
    }
}
