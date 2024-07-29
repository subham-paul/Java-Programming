public class LL_Basic_1 {
    Node head;
    private int size;

    LL_Basic_1(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printList(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("Empty List, Nothing to delete from FIRST.");
            return;
        }
        size--;
        head = this.head.next;
    }

    public void removeLast(){
        if(head == null){
            System.out.println("Empty List, Nothing  left for delete from LAST");
            return;
        }
        size--;
        if(head.next == null){
            head=null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String args[]){
        LL_Basic_1 list = new LL_Basic_1();
        list.addFirst("My");
        list.addFirst("Name");
        list.addFirst("Subham");
        list.addLast("Paul");

        list.printList();
        System.out.println("Now LL size "+list.getSize());

        list.removeLast();
        list.printList();
        System.out.println("Now LL size "+list.getSize());

        list.removeFirst();
        list.printList();
        System.out.println("Now LL size "+list.getSize());

        list.removeLast();
        list.printList();
        System.out.println("Now LL size "+list.getSize());

        list.removeFirst();
        list.printList();

        System.out.println("Now LL size "+list.getSize());

        // list.removeLast();
        // list.printList();
        
        // list.removeFirst();
        // list.printList();
    }
}
