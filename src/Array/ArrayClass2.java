package Array;

public class ArrayClass2 {
    public static void main(String[] args) {
        int [] nums = {2,9,8,5,36,87,44,45,56,25};

        for(int i = 0; i<nums.length; i++){
            if (nums[i] % 2 == 0){
                System.out.println(nums[i]);
            }
        }

        printEvenNumbers(nums);
        int s = getSumofEvenNumbers(nums);
        System.out.println(s);

    }

    public static void printEvenNumbers(int[] numbers){
        for(int i = 0; i<numbers.length; i++){
            if (numbers[i] % 2 == 0){
                System.out.println(numbers[i]);
            }
        }

    }

    public static int getSumofEvenNumbers(int[] numbers){
        int sum = 0;
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] % 2 == 0){
                sum = sum+numbers[i];
            }
        }
        return sum;
    }
}