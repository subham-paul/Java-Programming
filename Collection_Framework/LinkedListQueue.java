import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        // Queue- Interface name,Integer- DataType name, LinkedList- implement Queue interface
        // Used FIFO (First In First Out)

        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll()); // remove first element

        System.out.println(queue);

        System.out.println(queue.peek()); // remove Next element

    }
}