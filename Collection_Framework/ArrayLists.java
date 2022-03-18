import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String args[]) {
        // class-> Integer | Float | Boolean | String
        // in ArrayList value store in object form
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<Boolean> list3= new ArrayList<Boolean>();

        // add element
        list.add(121);
        list.add(129);
        list.add(139);
        list.add(147);

        System.out.println(list);

        // Print only 1 number index
        int element = list.get(1);
        System.out.println(element);

        // add element in between
        list.add(1,100);
        System.out.println(list);

        // Edit element at 2 number index
        list.set(2, 51);
        System.out.println(list);

        // delete element at 2 number index
        list.remove(2);
        System.out.println(list);

        // size of arrayList
        int size = list.size();
        System.out.println(size);

        // loops for print values
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // sorting the ArrayList
        Collections.sort(list);
        System.out.println(list);
    }
}
