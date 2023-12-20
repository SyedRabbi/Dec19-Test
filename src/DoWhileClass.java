public class DoWhileClass {
    public static void main(String[] args) {
        int i = 5;
        do {
            System.out.println("do " + i);
            i++;

        } while (i < 5);
        //*****************
        i = 5;
        while (i < 5) {
            System.out.println("while " + i);
            i++;
        }

        int year = 1990;
        int count = 0;

        while (year <= 2023) {
            if (year % 4 == 0) {
                count++;
            }
            year++;
        }
        System.out.println(count);

        year = 2015;
        i = 1;
        while (i <= 4) {
            if (year % 4 == 0) {
                System.out.println(year);
                break;
            }
            year = year + i;
            i++;

        }
    }
}
