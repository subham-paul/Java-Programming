import java.util.Stack;

public class Stack_Reverse {
    public static void pushAtBottom(String str, Stack<String> st) {
        if (st.isEmpty()) {
            st.push(str);
            return;
        }
        String top = st.pop();
        pushAtBottom(str, st);
        st.push(top);
    }

    public static void reverse(Stack<String> s) {
        if (s.empty()) {
            return;
        }
        String top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }

    public static void main(String args[]) {
        Stack<String> st = new Stack<>();
        st.push("S");
        st.push("U");
        st.push("B");
        st.push("H");
        st.push("A");
        st.push("M");

        /*
         * System.out.print("Before Reverse -> ");
         * while (!st.isEmpty()) {
         * System.out.print(st.pop() + " ");
         * }
         * System.out.println();
         */

        reverse(st);

        System.out.print("After Reverse -> ");
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}
