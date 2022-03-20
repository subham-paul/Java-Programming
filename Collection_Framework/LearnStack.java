import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);

        System.out.println(animals.peek()); // Print Top element inside a bucket

        animals.pop(); // remove top element inside a bucket

        System.out.println("Stack: " + animals);

        System.out.println(animals.peek());
    }
}