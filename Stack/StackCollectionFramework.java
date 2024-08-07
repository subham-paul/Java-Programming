import java.util.Stack;

public class StackCollectionFramework {
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);

        while (!st.isEmpty()) {
            System.out.println(st.peek() + " is the stack Peek.");
            st.pop();
        }
    }
}
