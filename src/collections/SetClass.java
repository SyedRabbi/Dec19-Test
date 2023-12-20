package collections;

import java.util.*;

public class SetClass {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();

        set1.add(6);
        set1.add(7);
        set1.add(8);
        set1.add(10);
        set1.add(5);
        set1.add(7);
        set1.add(8);

        for (int i : set1) {
            System.out.println(i);

        }
        System.out.println(set1);

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(set1);
        System.out.println(numbers.get(0));

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(10);
        set2.add(5);
        set2.add(7);
        set2.add(8);

        System.out.println(set2);

        Set<Integer> set3 = new TreeSet<>();
        set3.add(6);
        set3.add(7);
        set3.add(8);
        set3.add(10);
        set3.add(5);
        set3.add(7);
        set3.add(8);

        System.out.println(set3);


    }
}