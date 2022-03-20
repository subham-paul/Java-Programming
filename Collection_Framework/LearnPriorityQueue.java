import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

    public static void main(String[] args) {

        // Queue<Integer> pq = new PriorityQueue<>(); // (like mean Heap)
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // remove highest value (Like Max heap)

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);
        pq.poll(); // remove short amount value
        System.out.println(pq);

        System.out.println(pq.peek());  // remove next short amount value

    }

}