public class IfElseClass {
    public static void main(String[] args) {
        int mathScore = 90;
        int engScore = 90;

        if(mathScore >=90 && engScore >=90){
            System.out.println("This is a very good student");
        } else if(mathScore >=90 && engScore <90) {
            System.out.println("This is a good student");
        } else{
            System.out.println("This is ok student");
        }

    }
}
