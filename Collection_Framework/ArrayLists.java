import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// import ArrayList class which is in util folder inside the java folder.

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
        list.add(191);
        list.add(100);

        System.out.println(list);

        // Print only 1 number index
        // int element = list.get(1);
        // System.out.println(element);

        // add element in between
        // list.add(1,100);
        // System.out.println(list);

        // Edit element at 2 number index
        // list.set(2, 51);
        // System.out.println(list);

        // delete element at 2 number index
        // list.remove(2);
        // System.out.println(list);

        // list.remove(Integer.valueOf(139)); // This will remove 30 from the list
        // System.out.println(list);

        // size of arrayList
        int size = list.size();
        // System.out.println(size);

        // loops for print values
        for (int i = 0; i < list.size(); i++) {
            // System.out.print(list.get(i) + " ");
        }
        // System.out.println();

        // For each loop for print values
        for (Integer elements: list) {
                // System.out.println("foreach element is " + elements);
            }

        // sorting the ArrayList
        // Collections.sort(list);
        // System.out.println(list);

        // list.clear(); //This will remove all the elements from the list.
        // System.out.println(list);

        // System.out.println(list.contains(100)); // For check 100 present or not in this list


        // for print all value inside list using Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("iterator " + it.next());
        }

    }
}
