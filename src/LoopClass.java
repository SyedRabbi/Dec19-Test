import java.util.Scanner;

public class LoopClass {

    public static void main(String[] args) {
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);

//        for(int i = 1; i <= 10; i++){
//            i++;
//            System.out.println(i);
//
//        }

//        int sum = 0;
//        for(int i = 1; i<=15; i++){
//           // System.out.println(i);

//            if (i%2 ==1){
//                System.out.println(i+" is an odd number");
//
//            }
            int sum = 0;
            for(int i = 1; i<=1000; i++){
            if (i%2 ==1){
                sum = sum+i;
            }
        }
        System.out.println(sum);



    }
}
