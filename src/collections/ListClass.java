package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(3);

//        System.out.println(arrayList.get(3));
//        System.out.println(arrayList.size());

        for (int num: arrayList) {
           // System.out.println(num);

        }

       // arrayList.clear();
        System.out.println(arrayList.size());
        arrayList.remove(3);
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.contains(1));
        arrayList.add(3);
        arrayList.add(3,5);

        List<String> names = new LinkedList<>();
        names.add("ABC");
        names.add("XYZ");
        names.add("DEF");

        List<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Canada");


        ArrayList<Integer> arrayList1= new ArrayList<>();
        arrayList1.add(5);
        arrayList1.add(6);
        arrayList1.add(20);
        arrayList1.add(20);
        arrayList1.add(20);
        arrayList1.add(400);
        int i=0;
        int max=arrayList1.get(0);
        for (int num:arrayList1) {
            if (num> max){
                max=num;
            }
            System.out.println(max);
        }





    }
}
