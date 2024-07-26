import java.util.ArrayList;

public class ArrayList1{
    public static void main(String args[]) {
        ArrayList<Integer> subhamList = new ArrayList<Integer>();
        subhamList.add(10);
        subhamList.add(20);
        subhamList.add(30);
        System.out.println(subhamList);

        int element = subhamList.get(1);
        System.out.println(element);

        subhamList.add(1,100);
        System.out.println(subhamList);

        subhamList.set(2, 51);
        System.out.println(subhamList);

        subhamList.remove(2);
        System.out.println(subhamList);

        list.remove(Integer.valueOf(139)); // This will remove 30 from the list
        // System.out.println(list);
    }
}