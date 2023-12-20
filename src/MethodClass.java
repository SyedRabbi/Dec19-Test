public class MethodClass {
    public static void main(String[] args) {

        int num1 = 8;
        int num2 = 8;
        int sum = num1 + num2;
        System.out.println(sum);
        System.out.println("*****");
        addTwoNumbers();
        addTwoNumbersWithParam(9,8);
        addTwoNumbersWithParam(8,11);
        multiplyThreeParam(8,8,9);
        findLargestParam(10,12,6);

        int result = multiplyThreePara(3,4,3);
        System.out.println(result);
    }

    public static void addTwoNumbers(){
       int num1 =63;
       int num2 =11;
       int sum =num1 + num2;
        System.out.println(sum);

    }

    public static void addTwoNumbersWithParam(int num1, int num2){
        int sum = num1+num2;
        System.out.println(sum);
    }
    public static void multiplyThreeParam(int num1, int num2, int num3){
        int sum = num1*num2*num3;
        System.out.println(sum);
    }

    public static void findLargestParam(int num1, int num2, int num3){
        if(num1>num2 && num1>num3){
            System.out.println(num1);
        } else if (num2>num1 && num2>num3){
            System.out.println(num2);
        } else{
            System.out.println(num3);
        }
    }

    public static int multiplyThreePara(int num1, int num2, int num3){
        int sum= num1*num2*num3;
        //System.out.println(sum);
        return sum;
    }

    public static boolean isFirstOneLarger(int num1, int num2){
//        if (num1>num2)
//            return true;
//        else
//            return false;
        return num1>num2;
    }
}
