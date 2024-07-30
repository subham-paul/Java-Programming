import java.util.*;

public class LL_Reverse {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // Iterative Way -> TC=O(n), SC=O(1)
    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // Recursive Way -> TC=O(n), SC=O(1)
    public Node reverseLLRec(Node head) {
        // emptyNode || LastNode || OneNode
        if (head == null || head.next == null) {
            return head;
        }

        Node newNode = reverseLLRec(head.next);

        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public static void main(String args[]) {
        LL_Reverse list = new LL_Reverse();
        list.addFirst("Paul");
        list.addFirst("Subham");
        list.addFirst("Name");
        list.addFirst("My");
        // list.printList(); //
        list.addLast("....");
        // list.printList(); //
        // list.reverseList();
        list.head = list.reverseLLRec(list.head);
        // list.printList(); //

        // LinkedList<Integer> list2 = new LinkedList<Integer>();
        // list2.add(1);
        // list2.add(2);
        // Collections.reverse(list2);

    }
}
