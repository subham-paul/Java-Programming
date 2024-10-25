
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Basic {

    public static void main(String args[]) {
        //Creation
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion Country(Key), Population(value)
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180);
        map.put("ChINa", 999);
        System.out.println(map);

        //Searching
        if (map.containsKey("Indonesia")) {
            System.out.println("key is present in the map");
        } else {
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("China")); //key exists
        System.out.println(map.get("Indonesia")); //key doesn't exist

        int arr[] = {11, 32, 12};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int val : arr) {
            System.out.print(val + " : ");
        }
        System.out.println();

        //Iteration (1)
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey()+" -> ");
            System.out.println(e.getValue());
        }

        //Iteration (2)
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        //Removing
        map.remove("China");
        System.out.println(map);
    }

}
