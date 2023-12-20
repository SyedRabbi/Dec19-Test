package collections;

import java.util.List;

public class ClassB implements InterfaceB{

    @Override
    public void addValues(List<Integer> list) {
        int sum = 0;
        for (int num:list) {
            sum = sum + num;
        }
        System.out.println("Sum is "+sum);
    }
}
