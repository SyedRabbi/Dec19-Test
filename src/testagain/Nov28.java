package testagain;

public class Nov28 {
    public static void main(String[] args) {
        double salary = 7000;
        int years = 6;
        double bonus = 0;

        if (years > 5){
            bonus = salary * 0.05;
        }
        System.out.println(bonus);

        int totalClass = 65;
        int totalAtt = 55;

        double percentage = (double) (totalClass * .75);

        if (totalAtt > percentage){
            System.out.println("He can attend "+percentage);
        } else {
            System.out.println("He can't "+percentage);
        }
    }
}
