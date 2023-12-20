package Array;

public class ArrayClass {

    public static void main(String[] args) {
//        int num1 = 8;
//        System.out.println(num1);

        int[] numbers = new int[7];

        numbers[0] = 9;
        numbers[1] = 99;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[2] = 540;
        numbers[3] = 66;

        int sum = 0;
        int max = numbers[0];

        for (int i =0; i<numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println(max);

        for (int i = 0; i<numbers.length; i++){
            sum = sum+numbers[i];
        }
        System.out.println(sum);
        addSum(numbers);

    }

    public static void addSum(int[] nums){
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum = sum+nums[i];
        }
        System.out.println("Sum is "+sum);
    }
}
