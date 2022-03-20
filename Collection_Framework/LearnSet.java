import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Anuj", 2));
        studentSet.add(new Student("Ramesh", 4));
        studentSet.add(new Student("Shivam", 3));

        studentSet.add(new Student("Rohit", 2));

        Student s1 = new Student("Anuj", 2);
        Student s2 = new Student("Rohit", 2);

        System.out.println(s1.equals(s2));
        System.out.println(studentSet);


        // Always value unique
//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>(); // set + LinkedList Properties 

//        Set<Integer> set = new TreeSet<>(); // value sorted order
//
//        set.add(32);
//        set.add(2);
//        set.add(54);
//        set.add(21);
//        set.add(65);
//
//        System.out.println(set);
//
//        set.remove(54); // remove specifics value
//
//        System.out.println(set);
//
//        System.out.println(set.contains(21)); // return boolean value
//
//        System.out.println(set.isEmpty()); // return Boolean Value
//
//        System.out.println(set.size()); // return set size
//
//        set.clear(); // clear set values
//
//        System.out.println(set);

    }
}