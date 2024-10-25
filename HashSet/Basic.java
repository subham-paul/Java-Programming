
import java.util.HashSet;
import java.util.Iterator;

public class Basic {

    public static void main(String args[]) {
        HashSet<Integer> hs = new HashSet<>();

        // add
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(1);
        hs.add(6);
        hs.add(3);

        //Print all elements
        System.out.println(hs);

        // size
        System.out.println("Size " + hs.size());

        //Search
        if (hs.contains(1)) {
            System.out.println("value present");
        }

        if (!hs.contains(7)) {
            System.out.println("value absent");
        }

        //Delete
        hs.remove(1);
        if (!hs.contains(1)) {
            System.out.println("value absent");
        }

        //Print all elements
        System.out.println(hs);

        //Iteration - HashSet does not have an order
        hs.add(0);
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();

        //isEmpty
        if (!hs.isEmpty()) {
            System.out.println("set is not empty");
        }

    }
}
