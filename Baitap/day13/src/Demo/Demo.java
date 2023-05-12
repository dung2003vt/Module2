package Demo;

import java.util.*;

public class Demo {
    public static void main(String args[]) {
        int a[] = {77, 23, 4, 66, 99, 112, 45, 56, 39, 89};
        Set<Integer> s = new HashSet<Integer>();
        try {
            for (int i = 0; i < 4; i++) {
                s.add(a[i]);
            }
            System.out.println(s);
            TreeSet sorted = new TreeSet<Integer>(s);
            System.out.println("Sorted list = ");
            System.out.println(sorted);
        } catch (Exception e) {
        }
        Set<String> set = new TreeSet<>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        System.out.println(set);
        for (String s1: set) { System.out.print(s1.toUpperCase()+ " ");
        }
    }
}
