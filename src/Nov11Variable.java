import java.util.Scanner;

public class Nov11Variable {
    public static void main(String[] args) {

        int num1 = 9;
        //int num2 = num1;
        //num1 = num1 +10;
        //num1 = num1+1;
        //num1++;
        //System.out.println(num1);
        //num1--;
       // System.out.println(num1);


        //int num2 = 11%3;
        //System.out.println(num2);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number1 = scanner.nextInt();

        if (number1%2 ==0){
            System.out.println(number1+" is an even number");
        } else {
            System.out.println(number1+" is an odd number");
        }


    }
}
