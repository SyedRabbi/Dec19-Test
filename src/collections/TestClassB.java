package collections;

import java.util.ArrayList;
import java.util.List;

public class TestClassB {
    public static void main(String[] args) {
        List<Integer>nums = new ArrayList<>();

        nums.add(5);
        nums.add(6);
        nums.add(5);
        nums.add(6);
        nums.add(5);
        nums.add(6);

        ClassB classB = new ClassB();
        classB.addValues(nums);
    }
}
