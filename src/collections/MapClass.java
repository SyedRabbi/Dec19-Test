package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        Map<Integer, String>map1 = new HashMap<>();

        map1.put(1, "January");
        map1.put(2, "February");
        map1.put(3, "March");
        map1.put(2, "April");

        //System.out.println(map1.get(1));
        for (int key:map1.keySet()) {
            //System.out.println(map1.get(key));

        }

        Map<Integer, String>map2 = new HashMap<>();

        map2.put(1,"Friday");
        map2.put(2,"Saturday");
        map2.put(3,"Sunday");
        map2.put(4,"Monday");
        map2.put(5,"Tuesday");
        map2.put(6,"Wednesday");
        map2.put(7,"Thrusday");

        for (int key:map2.keySet()) {
            System.out.println(map2.get(key));

        }

        Map<Integer, Integer>map3 = new LinkedHashMap<>();
        

    }
}
