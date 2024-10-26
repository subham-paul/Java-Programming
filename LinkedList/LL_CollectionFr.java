import java.util.LinkedList;

public class LL_CollectionFr {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("is");
        list.add("a");
        list.add("good");
        list.addLast("list");
        list.addFirst("this");

        System.out.println("Print total List value " + list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");

        System.out.println("To get 3rd Index : " + list.get(2));
        System.out.println("To get First Index : " + list.getFirst());
        System.out.println("To get Last Index : " + list.getLast());
        System.out.println("Print total List value " + list);
        list.removeFirst();
        System.out.println("Print after remove 1st index : " + list);
        System.out.println("Now check size after remove 1th element : " + list.size());
        list.remove(2);
        System.out.println("Print after remove specific index : " + list);
        list.removeLast();
        System.out.println("Print after remove last index : " + list);
    }
}
