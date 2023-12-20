package testagain;

public class LoopAgainClass {
    public static void main(String[] args) {
        int sum =0;
//        for (int i=1; i<=100; i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);
//
//        for (int i=1; i<=5; i++){
//            System.out.println("*****");
//            System.out.println("Value of i is "+i);
//            System.out.println("#####");
//            //i++;
//        }

        int i =1;
        for ( i=1; i<=100; i++){
            sum = sum + i;
            if (sum > 2000){
                break;
            }
        }
        System.out.println(i);
        System.out.println(sum);
    }
}
