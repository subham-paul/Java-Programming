import java.util.*;

public class StringBuild {
    public static void main(String args[]) {
        /*
         * StringBuilder sb = new StringBuilder("Paul"); // here create some error
         * System.out.println(sb);
         * 
         * sb.insert(0, 's');
         * System.out.println(sb);
         */

        /*
         * StringBuilder df = new StringBuilder("H");
         * df.append("e");
         * df.append("l");
         * df.append("l");
         * df.append("o");
         * System.out.println(df);
         */

        StringBuilder sp = new StringBuilder("hello");
        for (int i = 0; i < args.length; i++) {
            int front = i;
            int backend = sp.length() - 1 - i;

            char frontChar = sp.charAt(front);
            char backChar = sp.charAt(backend);
            sp.setCharAt(front, backChar);
            sp.setCharAt(backend, frontChar);
        }
        System.out.println(sp);
    }
}
