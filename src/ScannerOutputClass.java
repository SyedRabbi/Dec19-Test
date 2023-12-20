import java.util.Scanner;

public class ScannerOutputClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number : ");
        int number1 = scanner.nextInt();

        System.out.println("Enter your second number : ");
        int number2 = scanner.nextInt();

//        System.out.println("Enter your third number : ");
//        int number3 = scanner.nextInt();

        System.out.println("Your first number is " + number1);
        System.out.println("Your second number is " + number2);
        //System.out.println("Your third number is "+number3);

//        if (number1>number2 && number1>number3){
//            System.out.println(number1+" is the largest");
//        }
//        else if (number2>number1 && number2>number3){
//            System.out.println(number2+ " is the largest");
//        } else {
//            System.out.println(number3+ " is the largest");
//        }
        if (number1 < 25 && number2 > 15) {
            System.out.println("We are good");
        } else if (number1 > 30 && number2 < 50) {
            System.out.println("We are ok");
        }
    }
}
