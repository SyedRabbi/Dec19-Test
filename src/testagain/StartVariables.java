package testagain;

public class StartVariables {
    int num = 10;

    public static void main(String[] args) {
        int num1 = 90;
        int num2 = num1 + 10;
        int num3 = num1 + num2;
        System.out.println(num3);

        num3 = num3 + 10;
        System.out.println(num3);

        double dNum1 = 23.6;
        double dNum2 = 63.7;
        double dNum3 = 63.85;

        char ahr1 = '$';

        String name = "ABCD";

        if(dNum1+dNum2 > dNum3){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        int month = 5;
        switch (month){
            case 1: {
                System.out.println("Month is January");
                break;
            }
            case 2: {
                System.out.println("Month is February");
                break;
            }
            case 12:{
                System.out.println("Month is December");
                break;
            }
            default:{
                System.out.println("No idea");
            }
        }

        }

    }
