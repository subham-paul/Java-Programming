public class FactNumber {

    public static int calcFact(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_num = calcFact(n - 1);
        int fact_n = n * fact_num;
        return fact_n;
    }

    public static void main(String args[]) {
        int number = 5;
        int ans = calcFact(number);
        System.out.println(ans);
    }
}
